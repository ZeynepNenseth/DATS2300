package Uke12;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg6134 {
    public static int hash(String s) {
        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            h = (h << 4) + s.charAt(i);
            int g = h & 0xf0000000;
            if (g != 0) h ^= (g >>> 24);
            h &= ~g;
        }
        return h;
    }



    public static void main(String[] args) {
        int n = 197;
        int[] hash = new int[n];

        for (int i = 0; i < 400; i++)
        {
            String s = "A";
            if (i < 100) s += 0;
            if (i < 10) s += 0;
            s += i;
            hash[s.hashCode() % n]++;
        }

        int m = Tabell.maks(hash);  // posisjonen til største verdi

        int maks = hash[m];         // den største verdien

        int[] frekvens = new int[maks + 1];
        for (int i = 0; i < hash.length; i++) frekvens[hash[i]]++;  // teller opp

        System.out.println(Arrays.toString(frekvens));  // [0, 48, 95, 54]
    }
}
