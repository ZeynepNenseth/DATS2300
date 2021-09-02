package Uke1;

public class oppg114 {
    public static void main(String[] args) {
        int[] a = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(maksi(a));
        System.out.println(maksii(b));
    }
    public static int maksi(int[] a) {  // versjon 2 av maks-metoden
        int m = 0;               // indeks til største verdi; +1
        int maksverdi = a[0];    // største verdi; +2

        for (int i = 1; i < a.length; i++) { // +1 +10(=n) +9=(n-1)
            if (a[i] > maksverdi) { // 2 * 9(=2n-2)
                maksverdi = a[i];     // største verdi oppdateres; 2 * 0
                m = i;                // indeks til største verdi; 1 * 0
            }
        }
        return m;   // returnerer indeks/posisjonen til største verdi
    } // antall grunleggende operasjoner = 1 + 2 + 1 + 10 + 9 + 18 + 0 + 0 = 41

    public static int maksii(int[] b) {  // versjon 2 av maks-metoden
        int m = 0; // indeks til største verdi; +1
        int maksverdi = b[0]; // største verdi; +2

        for (int i = 1; i < b.length; i++) { // +1 +10(=n) +9(=n-1)
            if (b[i] > maksverdi) { // 2 * 9(=2n-2)
                maksverdi = b[i]; // største verdi oppdateres; 2 * 9
                m = i; // indeks til største verdi; 1 * 9
            }
        }
        return m; // returnerer indeks/posisjonen til største verdi
    } // antall grunleggende operasjoner = 1 + 2 + 1 + 10 + 9 + 18 + 18 + 9 = 68
}
/*
Det er ingen forskjell på gjennomsnittlig effektivitet, effektiviteten i det mest ugunstige tilfellet
og effektiviteten i det beste tilfellet for maks-metoden, dvs. for den metoden som finner posisjonen
til den største verdien i en tabell fordi vi må løpe gjennom tabellen uansett.
 */