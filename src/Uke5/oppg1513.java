package Uke5;

public class oppg1513 {
    public static void main(String[] args) {
        System.out.println(tverrsum(359));
        System.out.println(interativTverrsum(359));
    }

    public static int tverrsum(int n) {      // n må være >= 0
        if (n < 10) return n;                        // kun ett siffer
        else return tverrsum(n / 10) + (n % 10);     // metoden kalles
    }

    // iterativ versjon av tverrsum
    public static int interativTverrsum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
