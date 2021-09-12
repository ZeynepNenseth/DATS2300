package Uke3;

public class oppg1353 {
    public static void main(String[] args) {
        int[] a = {3, 8, 10, 10, 12, 14, 16, 16, 16, 21, 24, 27, 30, 32, 32, 32, 33, 34, 37, 40};
        System.out.println(lineærsøkSammeVerdierBakerstIndeks(a,10));
    }
    public static int lineærsøkSammeVerdierBakerstIndeks(int[] a, int verdi) {
        if (a.length == 0 || verdi > a[a.length - 1]) {
            return -(a.length + 1);  // verdi er større enn den største
        }
        int i = a.length-1;
        for (; a[i] > verdi; i--);   // siste verdi er vaktpost
        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }
}
