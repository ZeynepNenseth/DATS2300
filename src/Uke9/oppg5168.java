package Uke9;

import Uke2.BinTre;

import java.util.StringJoiner;

public class oppg5168 {
    public static void main(String[] args) {
        int[] posisjon = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};  // posisjoner og
        String[] verdi = "EIBGAHKLODNMCJF".split("");              // verdier i nivåorden

        //StringJoiner s = new StringJoiner(", ", "[", "]");

        BinTre<String> tre = new BinTre<>(posisjon, verdi);        // en konstruktør
       // tre.nivåorden(c -> s.add(c.toString()));  // Utskrift: E I B G A H K L O D N M C J F
       // String verdier = s.toString();
       // System.out.println(verdier);

       // char[] list = {(char)0}; // (char)0 er minste mulige tegn
       // tre.nivåorden(c -> {if (c > list[0]) list[0] = c;});
        // System.out.println(list[0]);
    }
}
