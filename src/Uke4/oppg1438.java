package Uke4;

public class oppg1438 {

    public static void main(String[] args) {
        Integer a = 1;
        int b = 1;
        f(a,b);
    }
    public static void f(int a, Integer b) {
        System.out.println("Skriver " + a + " og " + b);
    }
    public static void f(Integer a, int b) {
        System.out.println("Skriver " + b + " og " + a);
    }
//ambiguous method call
}
