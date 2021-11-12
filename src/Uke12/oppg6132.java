package Uke12;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg6132 {
    public static void main(String[] args) {
        int n = 197;
        int[] tabell = new int[n];

        for (int i = 0; i < 400; i++) {
            String s = "A";

            if (i < 100) {
                s += 0;
            }
            if (i < 10) {
                s += 0;
            }
            s += i;

            tabell[s.hashCode() % n]++;
        }

        int m = Tabell.maks(tabell);
        int maks = tabell[m];

        int[] frekvens = new int[maks + 1];
        for (int i = 0; i < tabell.length; i++) frekvens[tabell[i]]++;  // teller opp

        System.out.println(Arrays.toString(frekvens));  // [0, 48, 95, 54]

        /*Utskriften over viser at alle indeksene ble brukt. Det var 48 indekser som ble brukt én gang, 95 ble brukt to ganger og 54 ble brukt 3 ganger. Dermed 48·1 + 95·2 + 54·3 = 400. Det ideelle hadde vært at hver indeks ble brukt nøyaktig to ganger. Men det vi fikk her er likevel ganske bra.

                Med n = 193, 199 og 211 ble det ikke så bra. Da kommer flg. utskrift:

        n = 193 : [33, 48, 44, 24, 28, 16]
        n = 199 : [30, 38, 38, 86, 7]
        n = 211 : [48, 44, 44, 40, 27, 8]*/
    }
}
