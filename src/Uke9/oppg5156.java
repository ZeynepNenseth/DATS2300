package Uke9;

import Uke2.BinTre;

public class oppg5156 {
    public static void main(String[] args) {
       // int[] posisjon5 = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384};
       // Integer[] verdi5 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

       // BinTre<Integer> tre5 = new BinTre<>(posisjon5,verdi5);

        // enklere måte å gjøre det
        BinTre<Integer> tre6 = new BinTre<>();
        int n = 15;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            tre6.leggInn(k, i);
            k *= 2;
        }
    }
}
