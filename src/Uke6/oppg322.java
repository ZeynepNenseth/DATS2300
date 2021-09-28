package Uke6;

import Uke2.TabellListe;

public class oppg322 {
    public static void main(String[] args) {
        String[] s = {"Per", "Kari", "Ole", "Azra", "Brumm", "Donald", "Duck", "Hello", "Kitty"};
        TabellListe navn = new TabellListe(s);
        //System.out.println(navn.tom());
        //System.out.println(navn.hent(1));
        //System.out.println(navn.toString());
       // System.out.println(navn.indeksTil("Ole"));
        navn.forEach(n -> System.out.print(n + " "));
       // navn.fjernHvis(n -> n.equals("Duck"));
        //System.out.println(navn.fjernHvis(n -> n.equals("Duck"))); utskrift : true;
        System.out.println("\n --------");
        navn.forEach(n -> System.out.print(n + " "));
    }
}
