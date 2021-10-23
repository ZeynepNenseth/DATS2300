package Uke9;

import Uke2.BinTre;

import java.util.Arrays;

public class oppg5152 {
    public static void main(String[] args) {
        BinTre<Character> tre1 = new BinTre<>();
        int[] posisjon1 = {1, 2, 3, 5, 6, 7, 10, 11, 12, 13, 21, 24, 25, 42, 43};
        char[] verdi1 = {'D','I', 'H', 'L', 'O', 'B', 'A', 'E', 'N', 'G', 'K', 'M', 'J', 'F', 'C'};
        //char[] verdi1 = "DIHLOBAENGKMJFC".toCharArray();
        for (int i = 0; i < verdi1.length; i++) {
            tre1.leggInn(posisjon1[i], verdi1[i]);
        }

        // eller bruk konstruktøren
        // BinTre<Character> tre1 = new BinTre<>(posisjon1, verdi1);
        System.out.print(Arrays.toString(verdi1) + "\n");

        BinTre<Character> tre2 = new BinTre<>();
        int[] posisjon2 = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 14, 22, 23, 28, 29};
        char[] verdi2 = "EIBGAHKLODNMCJF".toCharArray();
        for (int i = 0; i < verdi2.length; i++) {
            tre2.leggInn(posisjon2[i], verdi2[i]);
        }
        System.out.print(Arrays.toString(verdi2));
    }
}
