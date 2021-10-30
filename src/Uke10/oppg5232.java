package Uke10;

import Uke2.SBinTre;

import java.util.stream.Stream;

public class oppg5232 {
    public static void main(String[] args) {
        /*SBinTre<Character> karakterTre1 = SBinTre.sbintre();          // 1. konstruksjonsmetode);
        Character[] a = {'H', 'J','C','F','D','M','A','I','E','K','G','L','B'};

        for(Character verdi : a) {
            karakterTre1.leggInn(verdi);
        }

        SBinTre<Character> karakterTre2 = SBinTre.sbintre();          // 1. konstruksjonsmetode);
        Character[] b = {'E', 'H','B','E','G','F','D','I','H','A','E','C'};

        for(Character verdi : b) {
            karakterTre2.leggInn(verdi);
        }

        SBinTre<Integer> tallRekke1 = SBinTre.sbintre();          // 1. konstruksjonsmetode);
        Integer[] d = {4, 1, 8, 5, 3, 10, 7, 2, 6, 9};

        for(Integer verdi : d) {
            tallRekke1.leggInn(verdi);
        }

        SBinTre<Integer> tallRekke2 = SBinTre.sbintre();          // 1. konstruksjonsmetode);
        Integer[] e = {9, 4, 17, 12, 15, 1, 8, 10, 2, 5, 4, 20, 11, 6, 16, 9};

        for(Integer verdi : e) {
            tallRekke2.leggInn(verdi);
        }

        SBinTre<String> navneList = SBinTre.sbintre();          // 1. konstruksjonsmetode);
        String[] f = {"Sohil", "Per", "Thanh", "Fatima", "Kari", "Jasmin"};

        for(String verdi : f) {
            navneList.leggInn(verdi);
        }

        SBinTre<Integer> tallRekke3 = SBinTre.sbintre();          // 1. konstruksjonsmetode);
        Integer[] g = {10, 5, 20, 10, 3, 8, 13, 18, 7, 5, 6, 12, 4, 9, 11, 10, 22};

        for(Integer verdi : g) {
            tallRekke3.leggInn(verdi);
        }*/

        Character[] a = {'H', 'J','C','F','D','M','A','I','E','K','G','L','B'};
        SBinTre<Character> treA = SBinTre.sbintre(Stream.of(a));
        System.out.println(treA);

        Character[] b = {'E', 'H','B','E','G','F','D','I','H','A','E','C'};
        SBinTre<Character> treB = SBinTre.sbintre(Stream.of(b));
        System.out.println(treB);

        Integer[] d = {4, 1, 8, 5, 3, 10, 7, 2, 6, 9};
        SBinTre<Integer> treD = SBinTre.sbintre(Stream.of(d));
        System.out.println(treD);

        Integer[] e = {9, 4, 17, 12, 15, 1, 8, 10, 2, 5, 4, 20, 11, 6, 16, 9};
        SBinTre<Integer> treE = SBinTre.sbintre(Stream.of(e));
        System.out.println(treE);

        String[] f = {"Sohil", "Per", "Thanh", "Fatima", "Kari", "Jasmin"};
        SBinTre<String> treF = SBinTre.sbintre(Stream.of(f));
        System.out.println(treF);

        Integer[] g = {10, 5, 20, 10, 3, 8, 13, 18, 7, 5, 6, 12, 4, 9, 11, 10, 22};
        SBinTre<Integer> treG = SBinTre.sbintre(Stream.of(g));
        System.out.println(treG);
    }
}
