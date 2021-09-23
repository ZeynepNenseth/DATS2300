package Uke5;

public class oppg1511 {
    public static void main(String[] args) {
        System.out.println(a(10));
        System.out.println(iterativSum(10));
    }

    public static int a(int n) {        // n må være et ikke-negativt tall
        if (n == 0) return 1;              // a0 = 1
        else if (n == 1) return 2;         // a1 = 2
        else return 2*a(n-1) + 3*a(n-2);   // to rekursive kall
    }

    // iterativ  måte å løse oppgaven

    public static int iterativSum(int n) {
        int sum = 0;
        int r = 1;
        int s = 0;
        for (int i = 0; i < n; i++) {
            sum = 2 * r + 3 * s;
            s = r;
            r = sum;
        }
        return sum;
    }

}
