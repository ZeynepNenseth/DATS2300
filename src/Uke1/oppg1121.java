package Uke1;

public class oppg1121 {
    public static void main(String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        System.out.println(min(a));
    }

    public static int min(int[] a) {
        int indeks = 0;
        int minimum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
                indeks = i;
            }
        }
        return indeks;
    }
}
