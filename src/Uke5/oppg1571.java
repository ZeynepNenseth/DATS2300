package Uke5;

import Uke2.Tabell;

public class oppg1571 {
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(10);
        kvikksortering1(a, 0, 9);
    }

    private static void kvikksortering0(int[] a, int v, int h) {
        System.out.println("Kallet med [" + v + ":" + h + "] starter!");
        if (v >= h) return;   // tomt eller maks ett element

        int k = Tabell.sParter0(a, v, h, (v + h) / 2);   // returnerer posisjonen k
        kvikksortering0(a, v, k - 1);
        kvikksortering0(a, k + 1, h);
        System.out.println("Kallet med [" + v + ":" + h + "] er ferdig!");
    }

    private static void kvikksortering1(int[] a, int v, int h) {
        System.out.println("Kallet med [" + v + ":" + h + "] starter!");
        int p = Tabell.sParter0(a, v, h, (v + h) / 2);   // returnerer posisjonen k
        if (v < p - 1) {
            kvikksortering1(a, v, p - 1);
        }
        if (p + 1 < h) {
            kvikksortering1(a, p + 1, h);
        }
        System.out.println("Kallet med [" + v + ":" + h + "] er ferdig!");

    }
}
//Utskriften til kvikksortering0 viser at både tomme intervaller (h < v) og intervaller med lengde 1 legges på stakken.
//Utskriften til kvikksortering1 viser nå kun intervaller med lengde større enn 1 behandles.

/**
 * Kallet med [0:9] starter!
 * Kallet med [0:3] starter!
 * Kallet med [0:0] starter!
 * Kallet med [2:3] starter!
 * Kallet med [2:2] starter!
 * Kallet med [4:3] starter!
 * Kallet med [2:3] er ferdig!
 * Kallet med [0:3] er ferdig!
 * Kallet med [5:9] starter!
 * Kallet med [5:8] starter!
 * Kallet med [5:5] starter!
 * Kallet med [7:8] starter!
 * Kallet med [7:6] starter!
 * Kallet med [8:8] starter!
 * Kallet med [7:8] er ferdig!
 * Kallet med [5:8] er ferdig!
 * Kallet med [10:9] starter!
 * Kallet med [5:9] er ferdig!
 * Kallet med [0:9] er ferdig!
 */
/* Kallet med [0:9] starter!
Kallet med [0:1] starter!
Kallet med [0:1] er ferdig!
Kallet med [3:9] starter!
Kallet med [5:9] starter!
Kallet med [5:6] starter!
Kallet med [5:6] er ferdig!
Kallet med [8:9] starter!
Kallet med [8:9] er ferdig!
Kallet med [5:9] er ferdig!
Kallet med [3:9] er ferdig!
Kallet med [0:9] er ferdig!*/