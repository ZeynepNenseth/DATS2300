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
// Metoden halverer antall numre i hver runde av metodekall. Hvis vi kaller på metoden med n antall av tall,
// så får man større enn log 2 (n) lag på programstakken.
// Hvis metoden kalles med v = 0 og h = a.length-1, vil maksimal rekursjonsdybde bli ⌈log2(n)⌉ + 1 der n = a.length.
// n lenggden til arrayet.