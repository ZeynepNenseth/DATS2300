package Uke3;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg1313 {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 9, 7, 10, 8, 6, 5, 2};
        System.out.println("Tabellen er: " + Arrays.toString(a));
        System.out.println("De 10 første permutasjonene er:");
        for (int i = 0; i < 10; i++) {
            Tabell.nestePermutasjon(a);
            System.out.println((i + 1) + ": " + Arrays.toString(a));
        }
    }
}
