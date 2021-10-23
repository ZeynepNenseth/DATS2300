package Uke9;

import Uke2.BinTre;

import java.util.Arrays;

public class oppg5155 {
    public static void main(String[] args) {
        // bygger et perfekt tre med 15 noder og med verdiene 1 - 15 i nivåorden.
        BinTre<Integer> tre4 = new BinTre<>();
        int n = 15;
        for (int i = 0; i <= 15; i++) {
            tre4.leggInn(i,i);
        }
        System.out.print(tre4);
    }
}
