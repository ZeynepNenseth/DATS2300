package Uke4;

import Uke2.Tabell;

import java.util.Arrays;

public class oppg1422 {
    public static void main(String[] args) {
        String[] s = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(s);
        System.out.println(Arrays.toString(s));
        // [Ali, Anne, Eva, Kari, Ole, Per]
    }
}
