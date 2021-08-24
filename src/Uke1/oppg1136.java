package Uke1;

public class oppg1136 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fak(n));
    }
    public static long fak(int n) {
        int fakultet = 1;
        for (int i = n; i > 0; i--) {
            fakultet *= i;
        }
        return fakultet;
    }
}
