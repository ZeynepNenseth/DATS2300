package Uke4;

public class oppg1412 {
    public static void main(String[] args) {
        char[] c = "JASMIN".toCharArray();
        System.out.println(maks(c));
    }

    public static int maks(char[] c) {
        int m = 0;                          // indeks til største verdi
        char maksverdi = c[0];            // største verdi

        for (int i = 1; i < c.length; i++) {
            if (c[i] > (maksverdi)) {
                maksverdi = c[i];  // største verdi oppdateres
                m = i;             // indeks til største verdi oppdaters
            }
        }
        return m;                   // returnerer posisjonen til største verdi
    }  // svaret er 2
}
