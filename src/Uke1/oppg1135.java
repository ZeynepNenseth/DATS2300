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
        int verdimin = a[0]; //første verdi i tabellen
        int verdimax = a[0];

        int teller = 0; // teller hvor mange ganger du bruker if'en eller if else

        for (int i = 1; i < a.length; i++) {
            teller += 2;
            if (a[i] < verdimin) {
                verdimin = a[i];
                m1 = i;
                teller--;
            } else if (a[i] > verdimax) {
                verdimax = a[i];
                m2 = i;
            }
        }

        // TA sin måte å returnere
        // return new int[]{m1, m2};

        System.out.println(teller);
        int[] b = {m1, m2};
        return b;
    }
}
