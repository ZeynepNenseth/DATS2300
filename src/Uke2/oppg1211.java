package Uke2;

public class oppg1211 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19, 13, 5}; // array med lengde 17
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
}

/* for-each loop (for-alle løkke):
for (<datatype> <navn> : <object>) {...}
Eks: int[] a = {1,2,3,4,5,6,7,8,9,10}
     for (int k : a) {Sytem.out.println(k + " ");}
     // Utskrift: 1 2 3 4 5 6 7 8 9 10
 */
