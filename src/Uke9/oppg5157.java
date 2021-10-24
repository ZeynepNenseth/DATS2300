package Uke9;

import Uke2.BinTre;

public class oppg5157 {
    public static void main(String[] args) {
        // int[] posisjon7 = {1,2,3,4,7,8,15,16,31,32,63,64,127,128,255};
        // Integer[] verdi7 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // BinTre<Integer> tre7 = new BinTre<>();

        // en enklere metode gitt som flg:
        BinTre<Integer> tre8 = new BinTre<>();
        tre8.leggInn(1,1);  // lager rotnoden
        int n = 7;
        int k = 2;
        for (int i = 1; i <= n; i++) {
            tre8.leggInn(k, i * 2);
            tre8.leggInn((2 * k)-1,(2 * i)+1);
            k *= 2;
        }
     }
}
