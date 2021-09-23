package Uke5;

public class oppg15110 {
    public static void main(String[] args) {
        System.out.println(rekursivFakultet(5));
    }
    public static int rekursivFakultet(int n) {
        if (n == 1) {
            return 1;
        }
        return n * rekursivFakultet(n-1);
    }
}
