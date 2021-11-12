package Uke12;

public class oppg6111 {
    public static void main(String[] args) {
        String[] s = {"A"};
        String a = "A", b = "A", c = new String("A"), d = s[0];

        boolean lik1 = (a == b), lik2 = (a == c), lik3 = (a == d);
        boolean eq1 = a.equals(b), eq2 = a.equals(c), eq3 = a.equals(d);
        int h1 = a.hashCode(), h2 = b.hashCode(), h3 = c.hashCode(), h4 = d.hashCode();

        System.out.println(lik1);  // true
        System.out.println(lik2);  // false
        System.out.println(lik3);  // true
        System.out.println(h1);    // 65
        System.out.println(h2);    // 65
        System.out.println(h3);    // 65
        System.out.println(h4);    // 65
    }
}
