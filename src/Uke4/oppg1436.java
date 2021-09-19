package Uke4;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg1436 {
    public static void main(String[] args) {
        Integer[] a = Tabell.randPermInteger(10);
        System.out.println(Arrays.toString(a));
        // mulig utsktift [9, 6, 5, 3, 2, 1, 10, 8, 7, 4]

        Tabell.innsettingssortering(a);
        System.out.println(Arrays.toString(a));
        // Utskrift: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
