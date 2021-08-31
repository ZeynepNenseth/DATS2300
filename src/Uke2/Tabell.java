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

    public static int maks1(int[] a, int fra, int til) {
        fratilKontroll(a.length, fra, til);

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
        return maks1(a, 0, a.length);     // kaller metoden over
    }

    public static int min1(int[] a, int fra, int til) { //halvåpent array a[fra:til), dvs "til" er ikke med
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
        return min1(a, 0, a.length); // kaller metoden over
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
}

