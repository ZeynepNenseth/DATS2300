package Uke4;

public class oppg1415 {
    public static void main(String[] args) {
        String s = "bilde";
        String t = "Seng";

        System.out.println(s.compareTo(t));

        // s = A og t = B gir -1
        // s = A og t = a gir -32
        // s = Æ og t = Å gir 1
        // s = Ø og t = Å gir 19
        // s = Karianne og t = Kari gir 4
        // s = Bilde og t = Seng gir -17
        // s = bilde og t = Seng gir 15
    }
}
