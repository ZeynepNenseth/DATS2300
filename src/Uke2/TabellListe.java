package Uke2;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.StringJoiner;

public class TabellListe<T> implements Liste<T> {
    private T[] a;
    private int antall;

    String[] s = {"Per", "Kari", "Ole", "Azra"};
    TabellListe navn = new TabellListe(s);

    // konstruktører og metoder kommer her
    @SuppressWarnings("unchecked")            // pga. konverteringen: Object[] -> T[]
    public TabellListe(int størrelse) {       // konstruktør
        a = (T[])new Object[størrelse];       // oppretter tabellen
        antall = 0;                           // foreløpig ingen verdier
    }

    public TabellListe(T[] b) {                    // en T-tabell som parameter
        this(b.length);                            // kaller den andre konstruktøren

        for (T verdi : b) {
            if (verdi != null) a[antall++] = verdi;  // hopper over null-verdier
        }
    }

    public TabellListe() {       // standardkonstruktør
        this(10);        // startstørrelse på 10
    }

    public int antall() {
        return antall;          // returnerer antallet
    }

    public boolean tom() {
        return antall == 0;     // listen er tom hvis antall er 0
    }

    public T hent(int indeks) {
        indeksKontroll(indeks, false);   // false: indeks = antall er ulovlig
        return a[indeks];                // returnerer er tabellelement
    }

    public int indeksTil(T verdi) {
        for (int i = 0; i < antall; i++)
        {
            if (a[i].equals(verdi)) return i;   // funnet!
        }
        return -1;   // ikke funnet!
    }

    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;
    }
@Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        return;
    }

    public boolean fjern(T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!");
       /* I denne klassen tillates duplikater, men ikke null-verdier. Vi kan sjekke parameterverdien ved
        hjelp av metoden requireNonNull() i klassen Objects.*/
        for (int i = 0; i < antall; i++) {
            if (a[i].equals(verdi)) {
                antall--;
                System.arraycopy(a, i+1, a, i, antall-1);
                a[antall] = null;
                return true;
            }
        }
        return false;
    }

    public void nullstill() {
        if (a.length > 10) {
            a = (T[])new Object[10];
        }
    }
}
