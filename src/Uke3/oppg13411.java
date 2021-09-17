package Uke3;

import Uke2.Tabell;

import java.util.Arrays;
public class oppg13411 {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 7, 3, 6, 8, 1, 3, 2, 9, 4, 6, 10};
        utvalgssorteringSammeVerdier(a);
        System.out.println(Arrays.toString(a));
        // [1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10]
    }
    public static void utvalgssorteringSammeVerdier(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minverdi = a[i]; // minste verdi oppdateres
            int m = i;
           // Tabell.bytt(a, i, Tabell.min(a, i, a.length));
            //finner min
            for (int j = i + 1  ; j < a.length; j++) {
                if (a[j] < minverdi) {
                    m = j; // indeks til minste verdi oppdateres
                    minverdi = a[j]; // minste verdi oppdateres
                }
            }
            if (a[i] != a[m]) {
                int temp = a[i];
                a[i] = a[m];
                a[m] = temp;
            }
            }
            // m representerer index til minsteverdi nå
        }
    }

