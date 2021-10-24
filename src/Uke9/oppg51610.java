package Uke9;

import Uke2.BinTre;
import Uke2.Tabell;

import java.util.Arrays;

public class oppg51610 {
    public static void main(String[] args) {
        int[] posisjon = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};  // nodeposisjoner
        String[] verdi = "EIBGAHKLODNMCJF".split("");              // verdier i nivåorden

        BinTre<String> tre = new BinTre<>(posisjon, verdi);        // en konstruktør

        int[] nivåer = tre.nivåer();  // bruker Programkode 5.1.6 k)

        System.out.print("Nivåer: " + Arrays.toString(nivåer));
        System.out.print(" Treets bredde: " + nivåer[Tabell.maks(nivåer)]);
        System.out.println(" Treets høyde: " + (nivåer.length - 1));

        // Utskrift: Nivåer: [1, 2, 4, 4, 4] Treets bredde: 4 Treets høyde: 4
    }
}
