package Uke8;

import java.util.*;

public class TabellStakk<T> implements Stakk<T>
{
    private T[] a;                     // en T-tabell
    private int antall;                // antall verdier på stakken

    public TabellStakk()               // konstruktør - tabellengde 8
    {
        this(8);
    }

    @SuppressWarnings("unchecked")     // pga. konverteringen: Object[] -> T[]
    public TabellStakk(int lengde)     // valgfri tabellengde
    {
        if (lengde < 0)
            throw new IllegalArgumentException("Negativ tabellengde!");

        a = (T[])new Object[lengde];     // oppretter tabellen
        antall = 0;                      // stakken er tom
    }

    @Override
    public void leggInn(T verdi) {
        if (antall == a.length)
            a = Arrays.copyOf(a,antall == 0 ? 1 : 2*antall);  // dobler

        a[antall++] = verdi;
    }

    @Override
    public T kikk() {
        if (antall == 0) throw
                new NoSuchElementException("Stakken er tom!");

        return a[antall-1];
    }

    @Override
    public T taUt() {
        if (antall == 0) throw
                new NoSuchElementException("Stakken er tom!");

        antall--;

        T temp = a[antall];
        a[antall] = null;
        return temp;
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean tom() {
        return antall == 0;
    }

    @Override
    public void nullstill() {
        for (int i = 0; i < antall; i++) {
            a[i] = null;
        }
        antall = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (antall == 0) {
            sb.append("]");
        } else {
            for (int i = antall -1 ; i > 0; i--) {
                sb.append(a[i]).append(", ");
            }
            sb.append(a[0]).append("]");
        }
        return sb.toString();

        /** med Stringjoiner
         * StringJoiner s = new StringJoiner(", ", "[", "]");
         *     for (int i = antall - 1; i >= 0; i--)
         *       s.add(a[i] == null ? "null" : a[i].toString());
         *     return s.toString();
         */

        /** med StringBuilder
         *if (tom()) return "[]";
         *
         *     StringBuilder s = new StringBuilder();
         *     s.append('[');
         *     s.append(a[antall-1]);
         *
         *     for (int i = antall - 2; i >= 0; i--)
         *       s.append(',').append(' ').append(a[i]);
         *
         *     s.append(']');
         *     return s.toString();
         */
    }

    public static <T> void snu(Stakk<T> A) {  // snur rekkefølgen på stakken A
        Stakk<T> B = new TabellStakk<>();     // bruk to hjelpestakker
        Stakk<T> C = new TabellStakk<>();

        while (!A.tom()) {        // verdiene flyttes fra A til B
            B.leggInn(A.taUt());
        }

        while (!B.tom()) {        // verdiene flyttes fra B til C
            C.leggInn(B.taUt());
        }

        while (!C.tom()) {        // verdiene flyttes fra C til A
            A.leggInn(C.taUt());
        }
    }

    public static <T> void kopier(Stakk<T> A, Stakk<T> B) {  // kopierer innholdet av A over i B
        Stakk<T> C = new TabellStakk<>();
        while (!A.tom()) {        // verdiene flyttes fra A til C
            C.leggInn(A.taUt());
        }

        while (!C.tom()) {
            T temp = C.taUt();  // tar vare på verdien som fjernes fra C
            B.leggInn(temp);    // legger verdien til B
            A.leggInn(temp);    // legger verdien til A
        }
    }

    public static <T> void snu1(Stakk<T> A) {    // snur rekkefølgen på stakken A
        Stakk<T> B = new TabellStakk<>();    // bruk en hjelpestakk
        T temp;                              // bruk en T-variabel
        int n = A.antall() - 1;

        while (n > 0) {
            temp = A.taUt();
            for (int j = 0; j < n; j++) {
                B.leggInn(A.taUt());
            }
            A.leggInn(temp);
            while (!B.tom()) {
                A.leggInn(B.taUt());
            }
            n--;
        }
    }

    public static <T> void kopier1(Stakk<T> A, Stakk<T> B) {   // Den skal kopiere innholdet av A over i B
        T temp; // kun en hjelpevariabel
        int n = A.antall();

        while (n > 0) {
            for (int i = 0; i < n; i++) {
                B.leggInn(A.taUt());
            }
            temp = B.kikk();
            for (int j = 0; j < n; j++) {
                A.leggInn(B.taUt());
            }
            B.leggInn(temp);
            n--;
        }
    }

    public static <T> void sorter(Stakk<T> A, Comparator<? super T> c) { // sorterer objektene på A vha. komparatoren c
        Stakk<T> B = new TabellStakk<>();
        T temp;
        int n = 0;

        while (!A.tom()) {
            temp = A.taUt();
            n = 0;
            while (!B.tom() && c.compare(temp, B.kikk()) < 0) {
                n++;
                A.leggInn(B.taUt());
            }
            B.leggInn(temp);
            for (int i = 0; i < n; i++) {
                B.leggInn(A.taUt());
            }
        }

        while (!B.tom()) {
            A.leggInn(B.taUt());
        }
    }





    public static void main(String[] args) {
        /*Stakk<Integer> s = new TabellStakk<>();
        s.leggInn(1);
        s.leggInn(2);
        s.leggInn(3);
        s.leggInn(4);
        System.out.println(s.toString());
        snu1(s);
        System.out.println(s.toString());*/


        Stakk<Integer> s1 = new TabellStakk<>();
        s1.leggInn(2);
        s1.leggInn(1);
        s1.leggInn(4);
        s1.leggInn(5);
        s1.leggInn(3);
        System.out.println(s1.toString());
        //sorter(s1, c);
    }


}  // class TabellStakk
