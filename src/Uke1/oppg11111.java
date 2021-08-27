package Uke1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
// Array klassen har ikke metoder for å beregne min/max
// man kan bruke stream fordi Arrays klassen har metoden stream som tar i mot an array
public class oppg11111 {
    public static void main(String ... args) {
        int[] a = {8, 3, 5, 7, 9, 6, 10, 2, 1, 4}; // en heltallstabell
        int[] b = {}; // tom array
        IntStream s = Arrays.stream(a); // fra int-tabell til IntStream
        IntStream s1 = Arrays.stream(a); // fra int-tabell til IntStream
        IntStream s2 = Arrays.stream(b); // kjøring gir
        OptionalInt resultat = s.max(); // kaller max-metoden
        OptionalInt resultat1 = s1.min();
        OptionalInt resultat2 = s2.max();

        if (resultat.isPresent()) {
            System.out.println(resultat.getAsInt());
        } else {
            System.out.println("Ingen verdi!");
        }

        if (resultat1.isPresent()) {
            System.out.println(resultat1.getAsInt());
        } else {
            System.out.println("Ingen verdi!");
        }

        if (resultat2.isPresent()) {
            System.out.println(resultat2.getAsInt());
        } else {
            System.out.println("Ingen verdi!");
        }
    }
}
