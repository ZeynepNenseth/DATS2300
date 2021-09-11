package Uke3;

public class oppg1343 {
    public static void main(String[] args) {
        int[] a = {7,5,9,2,10,4,1,8,6,3}; // en usortert heltallstabell
        Uke2.Tabell.utvalgssortering(a);  // stigende sortering
        Uke2.Tabell.snu(a);               // tabellen snus
        Uke2.Tabell.skriv(a);             // 10 9 8 7 6 5 4 3 2 1
    }
}
