package Uke5;

public class oppg1517 {
    public static void main(String[] args) {
        System.out.println(sumKvadrat(3));
    }
    public static int sumKvadrat(int n) {
        double a = n;
        double b = 2;
        if (a == 1) return 1;
        return (int) Math.pow(a,b) + sumKvadrat(n - 1);
        // return sumKvadrat(n-1) + n * n;
    }
}
