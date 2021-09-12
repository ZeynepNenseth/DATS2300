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
            Tabell.bytt(a, i, Tabell.min(a, i, a.length));

            /* bytt-metoden bytt(int[]a, int i, int j) {
            if (a[i] != a[j]) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            }
            }*/
        }
    }
}
