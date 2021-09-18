package Uke4;

public class oppg1414 {
    public static void main(String[] args) {
        Integer a = 4;
        Integer b = 9;
        System.out.println(sammenlign(a,b));
    }
    /* -1 fordi a.compareTo(b) betyr at metoden returnerer -1 hvis a < b.
    4 < 9 derfor er c = -1
    a < b, så er a.compareTo(b) < 0
    a > b. så er a.compareTo(b) > 0
    a == b. så er a.compareTo(b) = 0*/

    public static int sammenlign(Integer a, Integer b) {
        int c = a.compareTo(b);
        return c;
    }
}
