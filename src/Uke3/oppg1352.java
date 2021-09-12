package Uke3;

import Uke2.Tabell;

public class oppg1352 {
    public static void main(String[] args) {
        int[] a = {3, 8, 10, 12, 14, 16, 21, 24, 27, 30, 32, 33, 34, 37, 40};
        int[] b = {};
        System.out.println(Tabell.lineærsøk(a, 41));
    }
}
//hvis vi leter etter en verdi mindre enn den minste verdien i tabellen f.eks 2, får vi -1.
//hvis vi leter etter en verdi mindre enn den minste verdien i en tom tabel, får vi -1.
// verdi 2, returverdi -1.
// verdi 15, returverdi -6.
// verdi 16, returverdi 5.
// verdi 40, returverdi 14.
// verdi 41, returverdi -16.
