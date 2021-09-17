package Uke3;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg1349 {
    public static void main(String[] args) {
        int[] a = {15, 8, 21, 16, 5, 19, 7, 23, 10, 14, 3, 11, 6, 17, 4};
        utvalgssortering(a, 3, 11); // 11 er ikke med!
        System.out.println(Arrays.toString(a));

    }

    public static void utvalgssortering(int[] a, int fra, int til) { // skal sortere et åpent intervall
        if (fra < 0) {
            throw new ArrayIndexOutOfBoundsException("fra(" + fra + ") < 0");
        }

        if (til >= a.length) {
            throw new ArrayIndexOutOfBoundsException("til(" + til + ") >= tabellengde(" + a.length + ")");
        }

        if (fra >= til) {
            throw new IllegalArgumentException("fra = " + fra + ", til = " + til);
        }

        for (int i = fra; i < til; i++) {
            Tabell.bytt(a, i, Tabell.min(a, i, til)); // må bli i, ikke fra
        }
    }
}
