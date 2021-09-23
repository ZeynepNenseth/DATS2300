package Uke5;

public class oppg1518 {
    public static void main(String[] args) {
        System.out.println(sum(10,15));
    }
    public static int sum(int k, int n) {
        if (k == n) {
            return n;
        }
        int m = (n + k)/2;
        return sum(k, m) + sum(m + 1,n);

    }
}
