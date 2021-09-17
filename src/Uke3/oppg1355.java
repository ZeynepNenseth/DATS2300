package Uke3;

public class oppg1355 {
    public static void main(String[] args) {
        int[] a = {3, 8, 10, 12, 14, 16, 21, 24, 27, 30, 32, 33, 34, 37, 40};

        System.out.println(linearsokHopp(a, 3, 33));
    }

    public static int linearsokHopp(int[] a, int k, int verdi) {
        if (a.length == 0 || verdi > a[a.length - 1]) {
            return -(a.length + 1);  // verdi er større enn den største
        }
        for (int i = 0; i < a.length; i = i + k) {
            if (a[i] >= verdi) {
                int start = i - k;
                int end = i + 1; // end er ikke med

                for (int j = start; j < end; j++) {
                    if (a[j] == verdi) {
                        return j;
                    }
                }
                return -1;
            }
        }
       /* int i = 0;
        for (; a[i] < verdi; i++);   // siste verdi er vaktpost
        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]'*/
        return -1;
    }
    //I den vanlige lineærsøk-metoden er algoritmen av orden O(n^2) siden det er 2 for-løkker inn i hverandre. Hvis vi setter k til
    //kvadratroten av array lengden (n) så, hopper så så mye som kvadratroten til n. Tror orden blir kvadrot (n)

    public static int kvadratrotsøk(int[] a, int verdi) {
        if (a.length == 0 || verdi > a[a.length - 1]) {
            return -(a.length + 1);  // verdi er større enn den største
        }
        int k = (int) Math.sqrt(a.length);
        for (int i = 0; i < a.length; i = i + k) {
            if (a[i] >= verdi) {
                int start = i - k;
                int end = i + 1; // end er ikke med

                for (int j = start; j < end; j++) {
                    if (a[j] == verdi) {
                        return j;
                    }
                }
                return -1;
            }
        }
        return -1;
    }
}
