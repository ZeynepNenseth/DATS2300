package Uke11;

import Uke2.HeapPrioritetsKø;
import Uke2.PrioritetsKø;

public class oppg5331 {
    public static void main(String[] args) {
        int[] a = {3,5,7,10,5,8,18,12,17,11,10,14};
        PrioritetsKø<Integer> kø = HeapPrioritetsKø.naturligOrden();
        for (int k : a) kø.leggInn(k);
        System.out.println(kø);           // [3, 5, 7, 10, 5, 8, 18, 12, 17, 11, 10, 14]
        kø.leggInn(6);
        System.out.println(kø);           // [3, 5, 6, 10, 5, 7, 18, 12, 17, 11, 10, 14, 8]


        int[] b = {7, 6, 5, 4, 3, 2, 1};
        PrioritetsKø<Integer> kø1 = HeapPrioritetsKø.naturligOrden();
        for (int k : b) kø1.leggInn(k);
        System.out.println(kø1);           // [1, 4, 2, 7, 5, 6, 3]
    }
}
