package Uke2;

// trenger ikke "import hjelpeklasser.*;" public klassene ligger under samme package
public class Program {
    public static void main(String[] args) { // hovedprogram
        int[] a = Tabell.randPerm(20); // lager en tilfeldig array med tallene 1-20
            for (int k : a) System.out.print(k + " "); // skriver ut arrayet

            int m = Tabell.maks(a);   // finner indeksen til største verdi

            System.out.println("\nStørste verdi ligger på plass " + m);
        } // avslutt main
    } // avslutt class Program
