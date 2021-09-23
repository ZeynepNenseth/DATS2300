package Uke5;

public class oppg1514 {
    public static void main(String[] args) {
        System.out.println(sifferrot(956847));
    }
    public static int sifferrot(int n) {
        while (n >= 10) {
            n = oppg1513.tverrsum(n);
            return n % 9;
        }
        return n;
    }
}
