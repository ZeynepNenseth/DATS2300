package Uke2;

import java.util.*;

public class Tabell { // Samleklasse for tabellmetoder
    private Tabell() {
    }

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] randPerm(int n) { // en effektiv versjon
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--) {  // løkke som går n - 1 ganger
            int i = r.nextInt(k + 1);        // en tilfeldig tall fra 0 til k
            bytt(a, k, i);                   // bytter om
        }
        return a;                        // permutasjonen returneres
    }

    public static void randPerm(int[] a) { // stokker om a
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--) {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a, k, i);
        }
    }

    public static int maks(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);
        if (a.length == 0) {
            throw new NullPointerException("Tom tabell!");
        }

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++) {
            if (a[i] > maksverdi) {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }
        return m;  // posisjonen til største verdi i a[fra:til>
    }

    public static int maks(int[] a) { // bruker hele tabellen
        return maks(a, 0, a.length);     // kaller metoden over
    }

    public static int min(int[] a, int fra, int til) { //halvåpent array a[fra:til), dvs "til" er ikke med
        if (fra < 0 || til > a.length || fra >= til) {
            throw new IllegalArgumentException("Illegalt intervall");
        }

        int m = fra; // indeks til minste verdi i a[fra:til)
        int minverdi = a[fra]; // minste verdi oppdateres

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i; // indeks til minste verdi oppdateres
                minverdi = a[i]; // minste verdi oppdateres
            }
        }
        return m; // returnerer indeksen til minste verdi i a[fra:til)
    }

    public static int min(int[] a) { // bruker hele arrayet
        return min(a, 0, a.length); // kaller metoden over
    }

    public static void bytt2(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void skriv(int[] a, int fra, int til) {
        for (int i = fra; i < til - 1; i++) {
            //if (i != til-1 ) du kunne legge til en if til men det blir ikke effektiv
            System.out.print(a[i] + " ");
        }
        System.out.print(a[til - 1]);
        /* int[] b = Arrays.copyOfRange(a, fra, til); // lager en kopi av arrayet a[fra:til) ikke relevant her
        for (int i : b) {
            System.out.println(i + " ");
        }*/
    }

    public static void skriv(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[a.length - 1]);
        /* skriv(a, 0, a.length) men du kan få stackoverflow hvis du kaller mange metoder over metoder*/
    }

    public static void skrivln(int[] a, int fra, int til) {
        for (int i = fra; i < til - 1; i++) {
            //if (i != til-1 ) du kunne legge til en if til men det blir ikke effektiv
            System.out.print(a[i] + " ");
        }
        System.out.print(a[til - 1] + "\n");
        /* int[] b = Arrays.copyOfRange(a, fra, til); // lager en kopi av arrayet a[fra:til) ikke relevant her
        for (int i : b) {
            System.out.println(i + " ");
        }*/
    }

    public static void skrivln(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[a.length - 1] + "\n");
        /* skriv(a, 0, a.length) men du kan få stackoverflow hvis du kaller mange metoder over metoder*/
    }

    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0) { // fra er negativ
            throw new ArrayIndexOutOfBoundsException("fra(" + fra + ") er negativ!");
        }

        if (til > tablengde) { // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException("til(" + til + ") > tablengde(" + tablengde + ")");
        }

        if (fra > til) { // fra er større enn til
            throw new IllegalArgumentException("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
        }

        if (fra == til) {
            throw new NoSuchElementException("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
        }
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0) {
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");
        }

        if (h >= tablengde) {
            throw new ArrayIndexOutOfBoundsException("h(" + h + ") >= tablengde(" + tablengde + ")");
        }

        if (v > h + 1) {
            throw new IllegalArgumentException("v = " + v + ", h = " + h);
        }

        /* Arrays + trykk ctrl og mus og kommer inn i java klassen Arrays, check der for "rangeCheck():
        static void rangeCheck(int arrayLength, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) { fra må alltid være mindre enn til
            throw new IllegalArgumentException(
                "fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
        if (fromIndex < 0) { // tom array
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }
        if (toIndex > arrayLength) { indeksen går ut av arrayet
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }
         */
    }

    public static void skrivChar(char[] c, int fra, int til) {
        for (int i = fra; i < til - 1; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print(c[til - 1]);
    }

    public static void skrivChar(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print(c[c.length - 1]);
        /* skriv(a, 0, a.length) men du kan få stackoverflow hvis du kaller mange metoder over metoder*/
    }

    public static void skrivlnChar(char[] c, int fra, int til) {
        for (int i = fra; i < til - 1; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print(c[til - 1] + "\n");
    }

    public static void skrivlnChar(char[] c) {
        for (int i = 0; i < c.length - 1; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.print(c[c.length - 1] + "\n");
    }

    public static int[] naturligeTall(int n) {
        int[] a = new int[n];
       /* if (n < 1) {
            throw new ArrayIndexOutOfBoundsException("n må være større enn eller lik 1!");
        }*/ // NegativeArraysizeException??
        fratilKontroll(n,1, n); // n i plassen til "til" representerer indeksen og ikke verdien re
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    public static int[] heleTall(int fra, int til) {
        /*if (fra > til) {
            throw new IllegalArgumentException("fra må være mindre enn til!");
        }
        if (fra == til) {
            throw new NoSuchElementException("Tom tabell!");
        }*/
        int[] a = new int[til - fra];
        a[0] = fra;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i-1] + 1;
        }
        return a;
    }

    public static int[] nestMaks(int[] a) {
        int n = a.length;   // tabellens lengde
        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");// må ha minst to verdier!
        }

        int m = maks(a);  // m er posisjonen til tabellens største verdi
        int nm;           // nm skal inneholde posisjonen til nest største verdi
        if (m == 0) {                          // den største ligger først
            nm = maks(a, 1, n);                  // leter i a[1:n>
        } else if (m == n - 1) {                   // den største ligger bakerst
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        } else {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }
        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1
    }

    public static int[] nestMaksF(int[] a) {
        int n = a.length;   // tabellens lengde
        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");// må ha minst to verdier!
        }

        int m = maks(a);  // m er posisjonen til tabellens største verdi
        int nm;           // nm skal inneholde posisjonen til nest største verdi
        bytt(a, 0, m); // har største verdi indeks 0

        nm = maks(a, 1, n);// leter i a[1:n>
        if (nm == m) { // spesialtilfelle her når den nest største verdien ligger forrest i tabellen.
            nm = 0;
        }
        bytt(a, 0, m);
        return new int[] {m,nm}; // indeksen til største tall=m i posisjon 0 , nm i posisjon 1
    }

    public static int[] nestMaksB(int[] a) {
        int n = a.length;   // tabellens lengde
        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");// må ha minst to verdier!
        }

        int m = maks(a);  // m er posisjonen til tabellens største verdi
        int nm;           // nm skal inneholde posisjonen til nest største verdi
        bytt(a, n-1, m); // har største verdi i siste indeks

        nm = maks(a, 0, n-2); // leter i a[0:n-2>

        if (nm == m) { // spesialtilfelle her når den nest største verdien ligger bakerst i tabellen.
            nm = n-1;
        }
        bytt(a, 0, m);
        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1
    }
    public static void sortering(int[] a) {
        int n = a.length;   // tabellens lengde
        if (n < 2) {
            throw new NoSuchElementException("a.length(" + n + ") < 2!");
        }
        int m = maks(a);
        bytt(a, n-1, m);

        int nextMax;
        for (int k = n-2; k > 1; k--) {
            /*
            nextMax = maks(a, 0, n-2); //funker ikke med k
            int temp = a[k];
            a[k] = a[nextMax];
            a[nextMax] = temp;*/
            m = maks(a, 0, k);
            bytt(a, m, k);
            System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

    }

    public static int[] nestMaksNy(int[] a) {// ny versjon, bruker færrest mulig operasjoner når tabellen desc=baklengs sortert
        int n = a.length;
        if (n < 2) throw new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = 0;      // m er posisjonen til største verdi
        int nm = 1;     // nm er posisjonen til nest største verdi

        // bytter om m og nm hvis a[1] er større enn a[0]
        if (a[1] > a[0]) { // gjør sammenlikning  1 gang
            m = 1; nm = 0;
        }

        int maksverdi = a[m];                // største verdi
        int nestmaksverdi = a[nm];           // nest største verdi

        for (int i = 2; i < n; i++) {
            if (a[i] > nestmaksverdi) { // gjør sammenlikning  n-2 ganger
                if (a[i] > maksverdi) { // gjør sammenlikning  n-2 ganger
                    nm = m;
                    nestmaksverdi = maksverdi;     // ny nest størst

                    m = i;
                    maksverdi = a[m];              // ny størst
                } else {
                    nm = i;
                    nestmaksverdi = a[nm];         // ny nest størst
                }
            }
        } // total sammenlikning = 1 + n - 2 + n - 2 = 2n - 3
        return new int[] {m,nm};    // n i posisjon 0, nm i posisjon 1
    }

    public static void snu(int[] a, int v, int h) { // snur intervallet a[v:h]
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v) { // snur fra og med v og ut tabellen
        snu(a, v, a.length - 1);
    }
    public static void snu(int[] a) { // snur hele tabellen
        snu(a, 0, a.length - 1);
    }

    public static boolean nestePermutasjon(int[] a) {
        int i = a.length - 2; // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--; // går mot venstre
        if (i < 0) return false; // a = {n, n-1, . . . , 2, 1}
        int j = a.length - 1; // j starter bakerst
        while (a[j] < a[i]) j--; // stopper når a[j] > a[i]
        bytt(a,i,j); snu(a,i + 1); // bytter og snur
        return true; // en ny permutasjon
    }

    public static int inversjoner(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) { // hvis den starter fra 1 blir det helt feil
                if (a[i] > a[j]) {
                    antall++;
                }
            }
        }
        return antall;
    }
    public static void utvalgssortering(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            bytt(a, i, min(a, i, a.length));
        }
    }
}

