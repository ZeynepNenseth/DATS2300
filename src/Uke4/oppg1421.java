package Uke4;

import Uke2.Tabell;

public class oppg1421 {
    public static void main(String[] args) {
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh
    }
}
/* Vi har 2 maks metoder som kan utføre denne koden:
 1) public static int maks(String[] a)
 2) public static <T extends Comparable<? super T>> int maks(T[] a)
 */
