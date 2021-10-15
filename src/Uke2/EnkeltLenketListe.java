package Uke2;

import java.util.Iterator;
import java.util.Objects;

public class EnkeltLenketListe<T> implements Liste<T> {
    private static final class Node<T> {      // en indre nodeklasse
        private T verdi;                       // nodens verdi
        private Node<T> neste;                 // den neste noden

        private Node(T verdi,Node<T> neste) {    // konstruktør
            this.verdi = verdi;
            this.neste = neste;
        }
    }  // Node

    private Node<T> hode, hale;  // pekere til første og siste node

    private int antall;          // antall verdier/noder i listen

    public EnkeltLenketListe(T[] a) {
        this();  // alle variabelene er nullet hode, hale, antall
        // Finner den første i a som ikke er null
        int i = 0;
        for (; i < a.length && a[i] == null; i++) ;
        if (i < a.length) {
            Node<T> p = hode = new Node<>(a[i], null);  // den første noden
            antall = 1;                                 // vi har minst en node

            for (i++; i < a.length; i++) {
                if (a[i] != null) {
                    p = p.neste = new Node<>(a[i], null);   // en ny node
                    antall++;
                }
            }
            hale = p;
        }

        /*
        Node<T> ny = new Node<>();
        ny.neste = a[1]
        Node<T> p = hode;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
            p.verdi = a[i];
            p = p.neste;
            }
        }
        hale = p;
    */
        }

    public EnkeltLenketListe() {   // standardkonstruktør
        hode = hale = null;        // hode og hale til null
        antall = 0;                // ingen verdier - listen er tom
    }

    @Override
    public boolean leggInn(T verdi)   // verdi legges bakerst
    {
        Objects.requireNonNull(verdi, "Ikke tillatt med null-verdier!");

        if (antall == 0)  hode = hale = new Node<>(verdi, null);  // tom liste
        else hale = hale.neste = new Node<>(verdi, null);         // legges bakerst

        antall++;        // en mer i listen
        return true;     // vellykket innlegging
    }

    @Override
    public void leggInn(int indeks, T verdi)    // verdi til posisjon indeks
    {
        Objects.requireNonNull(verdi, "Ikke tillatt med null-verdier!");

        indeksKontroll(indeks, true);        // true: indeks = antall er lovlig

        if (indeks == 0)                     // ny verdi skal ligge først
        {
            hode = new Node<>(verdi, hode);    // legges først
            if (antall == 0) hale = hode;      // hode og hale peker på samme node
        }
        else if (indeks == antall)           // ny verdi skal ligge bakerst
        {
            hale = hale.neste = new Node<>(verdi, null);  // legges bakerst
        }
        else
        {
            Node<T> p = hode;                  // p flyttes indeks - 1 ganger
            for (int i = 1; i < indeks; i++) p = p.neste;

            p.neste = new Node<>(verdi, p.neste);  // verdi settes inn i listen
        }

        antall++;                            // listen har fått en ny verdi
    }

    @Override
    public boolean inneholder(T t) {
        return indeksTil(t) != -1;
    }

    @Override
    public T hent(int indeks)
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public int indeksTil(T t) {
        if (t == null){
            return -1;
        }
        Node<T> p = hode;
        for (int i = 0; i < antall; i++) {
            if (p.verdi.equals(t)) {
                return i;
            }
            p = p.neste;
        }
        return -1;
    }

    @Override
    public T oppdater(int indeks, T t)
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    private Node<T> finnNode(int indeks) {
        Node<T> p = hode;
        for (int i = 0; i < indeks; i++) {
            p = p.neste;
        }
        return p;
    }

        @Override
    public T fjern(int indeks) {
        indeksKontroll(indeks, false);  // Se Liste, false: indeks = antall er ulovlig
        T temp;                              // hjelpevariabel
        if (indeks == 0) {                     // skal første verdi fjernes?
            temp = hode.verdi;                 // tar vare på verdien som skal fjernes
            hode = hode.neste;                 // hode flyttes til neste node
            if (antall == 1) hale = null;      // det var kun en verdi i listen
        } else {
            Node<T> p = finnNode(indeks - 1);  // p er noden foran den som skal fjernes
            Node<T> q = p.neste;               // q skal fjernes
            temp = q.verdi;                    // tar vare på verdien som skal fjernes

            if (q == hale) {
                hale = p;           // q er siste node
            }
            p.neste = q.neste;                 // "hopper over" q
        }

        antall--;                            // reduserer antallet
        return temp;
    }

    @Override
    public boolean fjern(T t)
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public int antall() {
        return antall;
    }

    @Override
    public boolean tom() {
        if (antall == 0) {
            return true;
        } else return false;
        // return antall == 0;
    }

    @Override
    public void nullstill() {
        Node<T> p = hode;
        Node<T> q = null;
        while (p != null) {
            q = p.neste;
            p.neste = null;
            p.verdi = null;
            p = q;
        }
        /*for (Node<T> p = hode; p != null; p = q) {
            q = p.neste;
            p.verdi = null;
            p.neste = null;

        }
        hode = hale = null;
        antall = 0;*/
    }

    @Override
    public Iterator<T> iterator()
    {
        throw new UnsupportedOperationException("Ikke laget ennå!");
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append('[');
        if (!tom()) {
            Node<T> p = hode;
            s.append(p.verdi);
            p = p.neste;

            while (p != null) {  // tar med resten hvis det er noe mer
                s.append(',').append(' ').append(p.verdi);
                p = p.neste;
            }
        }
        s.append(']');
        return s.toString();

        /*Node<T> p = hode;
        if (antall == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (antall == 1) {
            sb.append(p.verdi).append("]");
        } else {
            for (int i = 0; i < antall; i++) {
                sb.append(p.verdi);
                if (p.neste != null) {
                    sb.append(", ");
                    p = p.neste;
                }

            }
            sb.append("]");
        }
        return sb.toString();*/
    }

}  // EnkeltLenketListe

