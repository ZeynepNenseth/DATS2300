package Uke1;

public class oppg1151 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int[] b = {6};
        int[] c = {};
        System.out.println(maks(a)); // utskrift: 5
        System.out.println(maks(b)); // utskrift: 0
        System.out.println(maks(c)); // utskrift: error message-ArrayIndexOutOfBoundsException
    }

    public static int maks(int[] a) {// versjon 3 av maks-metoden
        int sist = a.length - 1; // siste posisjon i tabellen
        int m = 0; // indeks til største verdi
        int maksverdi = a[0]; // største verdi
        int temp = a[sist]; // tar vare på siste verdi
        a[sist] = 0x7fffffff; // legger tallet 2147483647 sist

        for (int i = 0; ; i++) {// i starter med 0
            if (a[i] >= maksverdi) {// denne blir sann til slutt
                if (i == sist) {// sjekker om vi er ferdige
                    a[sist] = temp; // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m; // er siste størst?
                } else {
                    maksverdi = a[i]; // maksverdi oppdateres
                    m = i; // m oppdateres
                }
            }
        }
    }
}
