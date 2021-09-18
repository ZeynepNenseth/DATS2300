package Uke4;

public class oppg1413 {
    public static void main(String[] args) {
        Integer[] a = {5,2,7,3,9,1,8,4,6};
        System.out.println(maks(a));
    } // 4

    public static int maks(Integer[] a) {   // legges i class Tabell
        int m = 0;                          // indeks til største verdi
        Integer maksverdi = a[0];            // største verdi

        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(maksverdi) > 0) {
                maksverdi = a[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        }
        return m;  // returnerer posisjonen til største verdi
    }
}
