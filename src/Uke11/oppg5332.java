package Uke11;

import Uke2.HeapPrioritetsKø;
import Uke2.PrioritetsKø;
import Uke2.Tabell;

public class oppg5332 {
    public static void main(String[] args) {
        /*int[] a = {3,5,4,10,5,8,18,12,17,11,10,14};
        HeapPrioritetsKø<Integer> kø = HeapPrioritetsKø.naturligOrden();
        for (int k : a) kø.leggInn(k);
        System.out.println(kø.minimumsGrenen());   // [3, 4, 8, 14]*/

        int n = 10;                           // velg n >= 0
        int[] b = Tabell.randPerm(n);         // en permutasjon av tallene fra 1 til n

        PrioritetsKø<Integer> kø1= HeapPrioritetsKø.naturligOrden();
        for (int k: b) kø1.leggInn(k);         // ett og ett tall inn i køen // legger inn som 1,2,3...???

        while (!kø1.tom())
        {
            System.out.print(kø1.taUt() + " ");  // tar ut fra køen // 1 2 3 4 5 6 7 8 9 10
        }
    }


}
