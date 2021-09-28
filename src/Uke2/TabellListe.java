package Uke2;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TabellListe<T> implements Liste<T> {
    private T[] a;
    private int antall;



    // konstruktører og metoder kommer her
    @SuppressWarnings("unchecked")            // pga. konverteringen: Object[] -> T[]
    public TabellListe(int størrelse) {       // konstruktør
        a = (T[]) new Object[størrelse];       // oppretter tabellen
        antall = 0;                            // foreløpig ingen verdier
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

    @Override
    public T oppdater(int indeks, T verdi) {
        return null;
    }

    @Override
    public boolean leggInn(T verdi) {
        return false;
    }

    @Override
    public void leggInn(int indeks, T verdi) {

    }

    public boolean inneholder(T verdi) {
        return indeksTil(verdi) != -1;
    }

@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        if (tom()) {
            sb.append("]");
            return sb.toString();
        }
        for (int i = 0; i < a.length-1; i++){
            sb.append(a[i]).append(", ");
        }
        sb.append(a[a.length-1]);
        sb.append("]");

        return sb.toString();
    }

    public boolean fjern(T verdi) {
        Objects.requireNonNull(verdi, "null er ulovlig!");
        System.out.println("fjerner " + verdi);
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

    @Override
    public T fjern(int indeks) {
        return null;
    }

    public void nullstill() {
        if (a.length > 10) { // > antall??
            a = (T[])new Object[10];
        }

        for (int i = 0; i < 10; i++) {
            a[i] = null;
            antall = 0;
        }
    }



    @Override
    public Iterator<T> iterator() {
        return new TabellListeIterator();
    }

    private class TabellListeIterator implements Iterator<T>
    {
        private int denne = 0;       // instansvariabel
        private boolean fjernOK = false;   // ny instansvariabel i TabellListeIterator

        public boolean hasNext() {    // sjekker om det er flere igjen
            return denne < antall;     // sjekker verdien til denne
        }

        public T next() {              // returnerer aktuell verdi
            if (!hasNext())
                throw new NoSuchElementException("Tomt eller ingen verdier igjen!");

            T denneVerdi = a[denne];   // henter aktuell verdi
            denne++;                   // flytter indeksen
            fjernOK = true;            // nå kan remove() kalles

            return denneVerdi;         // returnerer verdien
        }

        public void remove() {        // ny versjon
            if (!fjernOK) throw
                    new IllegalStateException("Ulovlig tilstand!");

            fjernOK = false;           // remove() kan ikke kalles på nytt

            // verdien i denne - 1 skal fjernes da den ble returnert i siste kall
            // på next(), verdiene fra og med denne flyttes derfor en mot venstre
            antall--;           // en verdi vil bli fjernet
            denne--;            // denne må flyttes til venstre

            System.arraycopy(a, denne + 1, a, denne, antall - denne);  // tetter igjen
            a[antall] = null;   // verdien som lå lengst til høyre nulles
        }
    }

    public boolean fjernHvis(Predicate<? super T> p) {  // betingelsesfjerning
        Objects.requireNonNull(p);                       // kaster unntak
        boolean fjernet = false;
        for (int i = 0; i < antall-1; i++) {
            if (p.test(a[i])) {
                antall--;// betingelsen
                fjern(a[i]);

                fjernet = true;                  // fjerner
            }
        }
        return fjernet;
    }
    public void forEach(Consumer<? super T> action) {
        /* n Java, the Collection interface has Iterable as its super interface*/
        /*orEach states that it “performs the given action for each element of the Iterable until all elements have been
        processed or the action throws an exception.” */

        for (int i = 0; i < antall; i++) {
            action.accept(a[i]);
            System.out.println("h");
        }
    }

   /* public void forEachRemaining(Consumer<? super T> action) {   // traversering
        while (denne < antall)
        {
            action.accept(a[denne++]);
        }
    }*/
}
