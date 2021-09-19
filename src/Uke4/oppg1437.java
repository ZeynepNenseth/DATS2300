package Uke4;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg1437 {
    public static void main(String[] args) {
        double[] d = {5.7, 3.14, 7.12, 3.9, 6.5, 7.1, 7.11};  // en double-tabell
        Double[] e = new Double[d.length];             // en tom Double-tabell

        for (int i = 0; i < e.length; i++) {
            e[i] = d[i];  // fyller tabellen (autoboksing)
        }
        System.out.println(Arrays.toString(e));
        // før sortering: [5.7, 3.14, 7.12, 3.9, 6.5, 7.1, 7.11]

        Tabell.innsettingssortering(e);
        System.out.println(Arrays.toString(e));
        // etter sortering: [3.14, 3.9, 5.7, 6.5, 7.1, 7.11, 7.12]
    }
}
