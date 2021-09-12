package Uke3;

public class oppg1355 {
    public static void main(String[] args) {

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
                return  -1;
            }
        }
       /* int i = 0;
        for (; a[i] < verdi; i++);   // siste verdi er vaktpost
        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]'*/
        return -1;
    }
}
