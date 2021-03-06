package eksempelklasser;

import Uke2.Tabell;

import java.util.Arrays;

public final class Heltall implements Comparable<Heltall> {
    public static void main(String[] args) {
        int[] a = {5,2,7,3,9,1,8,10,4,6};          // en int-tabell
        Heltall[] h = new Heltall[a.length];       // en Heltall-tabell

        for (int i = 0; i < h.length; i++) h[i] = new Heltall(a[i]);
        Tabell.innsettingssortering(h);           // generisk sortering
        System.out.println(Arrays.toString(h));   // utskrift

    }
    private final int verdi;    // et heltall som instansvariabel
// Heltall h1 = new Heltall(3);
    // Heltall h2 = new Heltall(5);
    // h1.compareTo(h2);
    public Heltall(int verdi) { this.verdi = verdi; }   // konstruktør

    public int intVerdi() { return verdi; }             // aksessor

    public int compareTo(Heltall h) { // Heltall som parameter
        // return verdi < h.verdi ? -1 : (verdi == h.verdi ? 0 : 1);
            if (verdi < h.verdi) return -1;
            else if (verdi == h.verdi) return 0;
            else return 1;
    }

    public boolean equals(Object o)
    {
        if (o == this) return true;   // sammenligner med seg selv
        if (!(o instanceof Heltall)) return false;  // feil datatype
        return verdi == ((Heltall)o).verdi;
    }

    public boolean equals(Heltall h) { return verdi == h.verdi; }

    public int hashCode() { return 31 + verdi; }

    public String toString() { return Integer.toString(verdi); }
}
