package Uke3;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg1341 {
    public static void main(String[] args) {
        //int[] a = {15, 8, 21, 16, 5, 19, 7, 23, 10, 14, 3, 11, 6, 17, 4};
        int n = 1000, antall = 200; // tabellstørrelse og gjentagelser
        long tid = 0;
        int a[] = Uke2.Tabell.randPerm(n);

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) selectionSort(a);  // Programkode 1.1.2
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("selection sort-metoden w hjelpemetoder: " + tid + " millisek");
        // for n = 1000; antall = 200, det tar 59 ms
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            Tabell.bytt(a, i, Tabell.min(a, i, a.length));
        }
       // System.out.println(Arrays.toString(a));
    }
}
/* etter 3 iterasjoner ser tabellen ut som {3, 4, 5, 16, 21, 19, 7, 23, 10, 14, 15, 11, 6, 17, 8}
dvs 3 minste ligger på plass
Etter 5 iterasjoner hadde det set ut som {3, 4, 5, 6, 7, 19, 21, 23, 10, 14, 15, 11, 16, 17, 8}
Etter 7 iterasjoner hadde det set ut som {3, 4, 5, 6, 7, 8, 10, 23, 21, 14, 15, 11, 16, 17, 19}
 */
