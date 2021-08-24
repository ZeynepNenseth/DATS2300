package Uke1;

public class oppg1122 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        System.out.println(min(a));
    }
    public static int min(int[] a) { //min-metode
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }
        int m = 0; //indeks til foreløpig minste verdi
        for (int i = 1; i < a.length; i++) { //! starter med i = 1
            if (a[i] < a[m]) {
                m = i; //indeksen oppdateres
            }
        }
        return m; // returnerer indeksen til minste verdi
    }
}
