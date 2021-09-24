package Uke5;

import Uke2.Tabell;

public class oppg1532 {
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(100);       // en permutasjon av tallene fra 1 til 100
        System.out.println(sum(a,12, 23));     // Utskrift: 5050
    }
    public static int sum(int[] a, int v, int h) {   // intervallet a[v:h]
        if (v == h) return a[v];   // summen av én verdi er verdien selv
        int m = (v + h)/2;         // finner midten
        return sum(a,v,m) + sum(a,m+1,h);  // summen av de to halvdelene
    }
}
// Krav 1 er oppfyllt siden metoden bruker to rekursive metoder.
// Krav 2 er oppfyllt siden avstanden mellom v og h blir mindre, dvs, metoden jobber seg mot et basistilfelle.
// Hvis vi kaller på metoden v == 0 og h == a.length-1, blir
