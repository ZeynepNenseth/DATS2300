package Uke12;

public class oppg6131 {
    public static void main(String[] args) {
        String a = "Aa";
        String b = "BB";
        System.out.println(a.hashCode()); // 2112
        System.out.println(b.hashCode()); // 2112
    }
}

/*
Vi må finne bokstaver a, b, c og d slik at 31a + b = 31c + d eller 31(a - c) = d - b.
Vi kan som a og b velge to bokstaver ved siden av hverandre, f.eks. a = 'B' og c = 'A'.
Dermed bli a - c = 'B' - 'A' = 1 og 31(a - c) = 31. Vi får løst oppgaven hvis vi finner
to bokstaver d og b som har en avstand på 31. Vi har at avstanden mellom 'A' og 'a' er 32.
Da kan vi velge d = 'a' og b = 'B'. Da blir d - b = 'a' - 'B' = 31.
Eller vi kan velge d = 'b' og b = 'C', osv. Med andre ord er det mange muligheter.
 */