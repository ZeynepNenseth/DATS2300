package Uke2;

// trenger ikke "import hjelpeklasser.*;" public klassene ligger under samme package
public class Program {
    public static void main(String[] args) { // hovedprogram
        int[] a = Tabell.randPerm(20); // lager en tilfeldig array med tallene 1-20
        for (int k : a) {
            System.out.print(k + " "); // skriver ut arrayet
        }

        int m = Tabell.maks(a);   // finner indeksen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);
        int[] b = {};
        // Tabell.maks1(a, 5, 25); // ArrayIndexOutOfBoundsException: til(25) > tablengde(20)
        // Tabell.maks1(a, -2, 10); // ArrayIndexOutOfBoundsException: fra(-2) er negativt!
        // Tabell.maks1(a, 12, 7); // IllegalArgumentException: fra(12) > til(7) - illegalt intervall!
        // Tabell.maks1(a, 7, 7); // NoSuchElement
        Tabell.maks1(b, 0, 3);
        } // avslutt main
    } // avslutt class Program
