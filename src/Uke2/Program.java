package Uke2;

import java.util.Arrays;

// trenger ikke "import hjelpeklasser.*;" public klassene ligger under samme package
public class Program {
    public static void main(String[] args) { // hovedprogram
       /* int[] a = Tabell.randPerm(20); // lager en tilfeldig array med tallene 1-20
        int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell med største og nest største tall i a

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks
        Tabell.skrivln(a); // alternativ til for-each løkken

        for (int k : a) { // skriver ut arrayet med for-each-løkke
            System.out.print(k + " ");
        }

        int max_verdi = Tabell.maks(a);   // finner indeksen til største verdi
        System.out.println("\nStørste verdi ligger på plass " + max_verdi);

        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
        int[] tom = {};
        // Tabell.maks(a, 5, 25); // ArrayIndexOutOfBoundsException: til(25) > tablengde(20)
        // Tabell.maks(a, -2, 10); // ArrayIndexOutOfBoundsException: fra(-2) er negativt!
        // Tabell.maks(a, 12, 7); // IllegalArgumentException: fra(12) > til(7) - illegalt intervall!
        // Tabell.maks(a, 7, 7); // NoSuchElement
        // Tabell.maks(tom, 0, 3);

       /* System.out.println(Arrays.toString(Tabell.heleTall(3,7)));
        System.out.println(Arrays.toString(Tabell.heleTall(7,3)));
        System.out.println(Arrays.toString(Tabell.naturligeTall(6)));
        System.out.println(Arrays.toString(Tabell.naturligeTall(-1)));*/

        int [] d = {12,9,3,21, 17, 5, 8, 10, 13, 2};
        Tabell.sortering(d);

        }


}
