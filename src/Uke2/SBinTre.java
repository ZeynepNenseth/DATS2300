package Uke2;

import Uke8.Stakk;
import Uke8.TabellStakk;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;

public class SBinTre<T> // implements Beholder<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi;                 // nodens verdi
        private Node<T> venstre, høyre;  // venstre og høyre barn

        private Node(T verdi, Node<T> v, Node<T> h)  // konstruktør
        {
            this.verdi = verdi; venstre = v; høyre = h;
        }

        private Node(T verdi)  // konstruktør
        {
            this(verdi, null, null);
        }
    } // class Node

    private Node<T> rot;                       // peker til rotnoden
    private int antall;                        // antall noder
    private final Comparator<? super T> comp;  // komparator

    public SBinTre(Comparator<? super T> c)    // konstruktør
    {
        rot = null; antall = 0; comp = c;
    }

    public static <T extends Comparable<? super T>> SBinTre<T> sbintre(Stream<T> s)
    {
        return sbintre(s, Comparator.naturalOrder());  // naturlig ordning
    }

    public static <T> SBinTre<T> sbintre(Stream<T> s, Comparator<? super T> c)
    {
        SBinTre<T> tre = new SBinTre<>(c);             // komparatoren c
        s.forEach(tre::leggInn);                       // bygger opp treet
        return tre;                                    // treet returneres
    }

    public static <T> SBinTre<T> balansert(T[] a, Comparator<? super T> c)
    {
        SBinTre<T> tre = new SBinTre<>(c);          // oppretter et tomt tre
        tre.rot = balansert(a, 0, a.length - 1);    // bruker den rekursive metoden
        tre.antall = a.length;                      // setter antallet
        return tre;                                 // returnerer treet
    }

    public static <T extends Comparable<? super T>> SBinTre<T> balansert(T[] a)
    {
        return balansert(a, Comparator.naturalOrder());
    }

    public int antall()        // antall verdier i treet
    {
        return antall;
    }

    private static int høyde(Node<?> p)  // ? betyr vilkårlig type
    {
        if (p == null) return -1;          // et tomt tre har høyde -1

        return 1 + Math.max(høyde(p.venstre), høyde(p.høyre));
    }

    public int høyde()
    {
        return høyde(rot);                 // kaller hjelpemetoden
    }

    public boolean tom()       // er treet tomt?
    {
        return antall == 0;
    }

    public boolean inneholder(T verdi)     // skal ligge i klassen SBinTre
    {
        if (verdi == null) return false;            // treet har ikke nullverdier

        Node<T> p = rot;                            // starter i roten
        while (p != null)                           // sjekker p
        {
            int cmp = comp.compare(verdi, p.verdi);   // sammenligner
            if (cmp < 0) p = p.venstre;               // går til venstre
            else if (cmp > 0) p = p.høyre;            // går til høyre
            else return true;                         // cmp == 0, funnet
        }
        return false;                               // ikke funnet
    }

    public int antall(T verdi) {
        Node<T> p = rot;
        int teller = 0;
         while(p != null) {
             int cmp = comp.compare(verdi, p.verdi);
             if (cmp < 0) {
                 p = p.venstre;
             } else {
                 if (cmp == 0) {
                     teller++;
                 }
                 p = p.høyre;
             }
         }
         return teller;
    }

    public final boolean leggInn(T verdi) {    // skal ligge i class SBinTre
        Objects.requireNonNull(verdi, "Ulovlig med nullverdier!");

        Node<T> p = rot, q = null;               // p starter i roten
        int cmp = 0;                             // hjelpevariabel

        while (p != null) {       // fortsetter til p er ute av treet
            q = p;                                 // q er forelder til p
            cmp = comp.compare(verdi,p.verdi);     // bruker komparatoren
            p = cmp < 0 ? p.venstre : p.høyre;     // flytter p
        }

        // p er nå null, dvs. ute av treet, q er den siste vi passerte
        p = new Node<>(verdi);                   // oppretter en ny node

        if (q == null) {
            rot = p;                  // p blir rotnode
        }
        else if (cmp < 0) {
            q.venstre = p;         // venstre barn til q
        }
        else {
            q.høyre = p;                        // høyre barn til q
        }

        antall++;                                // én verdi mer i treet
        return true;                             // vellykket innlegging
    }

    public Liste<T> intervallsøk(T fraverdi, T tilverdi) {
        Liste<T> tabell = new TabellListe<T>();
        Stakk<Node<T>> s = new TabellStakk<>();

        Node<T> p = rot;

        while (p != null) {    // leter etter fraverdi
            int cmp = comp.compare(fraverdi, p.verdi);

            if (cmp < 0) {
                s.leggInn(p); p = p.venstre;
            } else if (cmp > 0) p = p.høyre;
            else break;                      // vi har funnet verdien
        }

        if (p == null) p = s.taUt();  // neste i inorden = fjern verdien

        while (p != null && comp.compare(p.verdi, tilverdi) < 0) {
            tabell.leggInn(p.verdi);
            if (p.høyre != null)
            {
                p = p.høyre;
                while (p.venstre != null)
                {
                    s.leggInn(p); p = p.venstre;
                }
            }
            else if (!s.tom()) p = s.taUt();
            else p = null;
        }
        return tabell;
    }

    public T maks() {
        if (tom()) {
            throw new NoSuchElementException("treet er tomt");
        }

        Node<T> p = rot;
        while (p.høyre != null) {
            p = p.høyre;
        }
        return p.verdi;
    }

    public T maksFirst() {
        if (tom()) {
            throw new NoSuchElementException("treet er tomt");
        }

        Node<T> p = rot;
        Node<T> q = null;
        while (p.høyre != null) {
            p = p.høyre;
            if (comp.compare(p.verdi, q.verdi) > 0) {
                q = p;
            }
        }
        return q.verdi;
    }

    private static <T> Node<T> balansert(T[] a, int v, int h)  // en rekursiv metode
    {
        if (v > h) return null;                       // tomt intervall -> tomt tre

        int m = (v + h)/2;                            // midten
        T verdi = a[m];                               // midtverdien

        while (v < m && verdi.equals(a[m-1])) m--;    // til venstre

        Node<T> p = balansert(a, v, m - 1);           // venstre subtre
        Node<T> q = balansert(a, m + 1, h);           // høyre subtre

        return new Node<>(verdi, p, q);               // rotnoden
    }

    public void nullstill()
    {
        rot = null; antall = 0;
    }
} // class SBinTre
