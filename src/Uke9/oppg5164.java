package Uke9;

import Uke2.BinTre;

import java.util.StringJoiner;

public class oppg5164 {
    public static void main(String[] args) {
        BinTre<Character> tre9 = new BinTre<>();
        int[] posisjon9 = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12, 14, 22, 23, 28, 29};
        String verdi9 = "EIBGAHKLODNMCJF";

        for (int i = 0; i < posisjon9.length; i++) {
            tre9.leggInn(posisjon9[i], verdi9.charAt(i));
        }

        char d = 'D';
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        tre9.nivåorden(c -> sj.add(c.toString()));
        String verdier = sj.toString();
        System.out.println(verdier);
        StringJoiner sj1 = new StringJoiner(", ", "[", "]");
        tre9.nivåorden(c -> {if (c > d) sj1.add(c.toString()); });  // dette skriver ut verdier større enn D, dvs bokstaver som kommer etter D
        String verdier1 = sj1.toString();
        System.out.println(verdier1);
    }

}
