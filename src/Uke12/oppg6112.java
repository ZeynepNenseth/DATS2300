package Uke12;

public class oppg6112 {
    public static void main(String[] args) {
        int[] a = {1,2,3}, b = a, c = {1,2,3};
        boolean lik1 = (a == b), lik2 = (a == c), lik3 = a.equals(c);

        System.out.println(lik1);   // true
        System.out.println(lik2);   // false
        System.out.println(lik3);   // false
    }
}
