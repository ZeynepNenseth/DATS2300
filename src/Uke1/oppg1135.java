package Uke1;

import java.util.Arrays;

public class oppg1135 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        System.out.println(Arrays.toString(minmaks(a)));
    }
    public static int[] minmaks(int[] a) {
        int m1 = 0; //indeksen til det minste tallet i tabellen
        int m2 = 0; //indeksen til det største tallet i tabellen
        int verdi = a[0]; //første verdi i tabellen

        for (int i = 1; i < a.length; i++) {
            if (a[i] < verdi) {
                verdi = a[i];
                m1 = i;
            }
        }

        for (int i = 1; i < a.length; i++) {
            if (a[i] > verdi) {
                verdi = a[i];
                m2 = i;
            }
        }
        // TA sin måte å returnere
        // return new int[]{m1, m2};
        int[] b = {m1, m2};
        return b;
    }
}
