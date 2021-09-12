package Uke3;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg13410 {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 7, 3, 6, 8, 1, 3, 2, 9, 4, 6, 10};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
        // [1, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10]
    }

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            Tabell.bytt(a, i, Tabell.min(a, i, a.length));
        }
    }
}
//selectionSort er en stabil algortime siden like like verdier har samme innbyrdes rekkefølge etter sorteringen som de hadde før.
