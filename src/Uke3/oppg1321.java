package Uke3;

public class oppg1321 {
    public static void main(String[] args) {
        int[] a = {3, 5, 4, 7, 6, 8, 1, 2, 9, 10};
        //For {1, 2, 4, 3, 6, 7, 9, 5, 8, 10} er svaret 5
        System.out.println(antallInversjoner(a));
        // a er svaret 14
    }

    public static int antallInversjoner(int[] a) {
        int antall = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) { // hvis den starter fra 1 blir det helt feil
                if (a[i] > a[j]) {
                    antall++;
                }
            }
        }
        return antall;
    }
}
