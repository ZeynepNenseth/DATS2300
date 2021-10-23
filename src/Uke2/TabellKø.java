package Uke2;

import Uke8.Stakk;

import java.util.NoSuchElementException;

public class TabellKø<T> implements Kø<T>
{
    private T[] a;      // en tabell
    private int fra;    // posisjonen til den første i køen
    private int til;    // posisjonen til første ledige plass

    @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
    public TabellKø(int lengde)
    {
        if (lengde < 1)
            throw new IllegalArgumentException("Må ha positiv lengde!");

        a = (T[])new Object[lengde];

        fra = til = 0;    // a[fra:til> er tom
    }

    public TabellKø()   // standardkonstruktør
    {
        this(8);
    }

    private T[] utvidTabell(int lengde) {
        @SuppressWarnings("unchecked")      // pga. konverteringen: Object[] -> T[]
        T[] b = (T[])new Object[lengde];  // ny tabell

        // kopierer intervallet a[fra:a.length> over i b
        System.arraycopy(a,fra,b,0,a.length - fra);

        // kopierer intervallet a[0:fra> over i b
        System.arraycopy(a,0,b,a.length - fra, fra);

        fra = 0; til = a.length;
        return b;
    }

    @Override
    public boolean leggInn(T verdi) {      // null-verdier skal være tillatt
        a[til] = verdi;                                 // ny verdi bakerst
        til++;                                          // øker til med 1
        if (til == a.length) til = 0;                   // hopper til 0
        if (fra == til) a = utvidTabell(2*a.length);    // sjekker og dobler
        return true;
    }

    @Override
    public T kikk() {
        if (fra == til) throw new         // sjekker om køen er tom
                NoSuchElementException("Køen er tom!");
        return a[fra];
    }

    @Override
    public T taUt() {
        if (fra == til) throw new         // sjekker om køen er tom
                NoSuchElementException("Køen er tom!");

        T temp = a[fra];                  // tar vare på den første i køen
        a[fra] = null;                    // nuller innholdet
        fra++;                            // øker fra med 1
        if (fra == a.length) fra = 0;     // hopper til 0
        return temp;
    }

    @Override
    public int antall() {
        return fra <= til ? til - fra : a.length + til - fra;
    }

    @Override
    public boolean tom() {
        return fra == til;
    }

    @Override
    public void nullstill() {
       /* if (fra == til) throw new         // sjekker om køen er tom
                NoSuchElementException("Køen er tom!");
        for (int i = fra; i < til; i++) {
            a[i] = null;
        }*/

        while (fra != til) {
            a[fra++] = null;  //du øker indeksen i []
            if (fra == a.length) {
                fra = 0;
            }
        }
        /* while (fra != til) {  Denne koden er også riktig
              a[fra] = null;
              fra++;
              if (fra == a.length) {
                fra = 0;
            }
        * */
    }

    @Override
    public String toString() {
        if (fra == til) {
            return "[]";
        }
        int sbfra = fra;
        int sbtil = til;
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(a[sbfra]);
        sbfra++;
        if (sbfra == a.length) {
            sbfra = 0;
        }

        while (sbfra != sbtil) {
            sb.append(", ").append(a[sbfra]);
            sbfra++;
            if (sbfra == a.length) {
                sbfra = 0;
            }
        }
        sb.append("]");
        return sb.toString();


        /* if (fra == til) {
                   return "[]";
               }
           StringBuilder sb = new StringBuilder();
           sb.append("[");

           for (int i = fra; i < til -1; i++) {
               sb.append(a[i]).append(", ");
               if (fra == a.length) {
                    fra = 0;
                }

            sb.append(a[til-1]).append("]");
         */

    }

    public int indeksTil(T verdi) {
       /* if (fra == til) throw new         // sjekker om køen er tom
                NoSuchElementException("Køen er tom!");*/
        /*for (int i = fra; i < til; i++) {
            if (a[i].equals(verdi))
                return i;
        }*/
       /* while (fra != til) {
            if (a[fra].equals(verdi)) {
                return fra;
            }
            fra++;
            if (fra == a.length) {
                fra = 0;
            }
        }
        return -1;*/
        int k = fra;

        while (k != til)
        {
            if (verdi.equals(a[k]))
                return fra <= k ? k - fra : a.length + k - fra;

            k++; if (k == a.length) k = 0;
        }
        return -1;  // ikke funnet
    }

    public static <T> void snu(Stakk<T> A) {
        Kø<T> B = new TabellKø<>();
    }




} // class TabellKø
