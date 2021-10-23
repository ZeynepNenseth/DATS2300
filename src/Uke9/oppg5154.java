package Uke9;

import Uke2.BinTre;

import java.util.Arrays;

public class oppg5154 {
    public static void main(String[] args) {

        int[] posisjon3 = {1,2,3,5,10,11,22,23,44,47}; // du må ordne posisjonene i nivåorden
        Integer[] verdi3 = {1,2,3,4,5,6,7,8,9,10};   // rekkefølgen til verdiene endres relativt til posisjonene
        BinTre<Integer> tre3 = new BinTre<>(posisjon3, verdi3);
        System.out.print(Arrays.toString(verdi3));
    }
}
