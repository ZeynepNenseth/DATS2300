package eksempelklasser;

import Uke2.Tabell;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Person implements Comparable<Person> {
    public static void main(String[] args) {
        Person[] p = new Person[8];                   // en persontabell

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");        // Kari Pettersen
        p[5] = new Person("Donald", "Duck");
        p[6] = new Person("Hello", "Kitty");
        p[7] = new Person("Mickey", "Mouse");

        int m = Tabell.maks(p);                       // posisjonen til den største
        System.out.println(p[m] + " er størst");      // skriver ut den største

        // Boris Zukanovic er størst

        Tabell.innsettingssortering(p);               // generisk sortering
        System.out.println(Arrays.toString(p));       // skriver ut sortert

        // [Donald Duck, Ali Kahn, Hello Kitty, Mickey Mouse, Kari Pettersen, Kari Svendsen, Azra Zukanovic, Boris Zukanovic]

        Stream s = Arrays.stream(p);
        Optional<Person> resultat = s.max(Comparator.naturalOrder());
        resultat.ifPresent(System.out::println);

        //1.4.4.2g)
        boolean h = p[0].hashCode() == p[4].hashCode();
        System.out.println(h); // false
        // selv hvis fornavn og etternavn hadde vært det samme, så er det fortsatt false fordi de er forskellige objekter.
    }
    private final String fornavn;         // personens fornavn
    private final String etternavn;       // personens etternavn

    public Person(String fornavn, String etternavn) {  // konstruktør
        //if (fornavn != null) {
        //this.fornavn = fornavn;
        //} else throw new Null
        Objects.requireNonNull(fornavn, "fornavn er null");
        Objects.requireNonNull(etternavn, "etternavn er null");

        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String fornavn() {
        return fornavn; }       // aksessor
    public String etternavn() {
        return etternavn; }   // aksessor

    public int compareTo(Person p) {    // pga. Comparable<Person>
        int cmp = etternavn.compareTo(p.etternavn);     // etternavn
        if (cmp != 0) return cmp;             // er etternavnene ulike?
        return fornavn.compareTo(p.fornavn);  // sammenligner fornavn
    }

    public boolean equals(Object o) {// vår versjon av equals
        if ( o == this) return true;   // er det samme objekt?
        if (o == null) return false;   // null-argument
        if (getClass() != o.getClass()) return false;  // er det rett klasse?
        final Person p = (Person)o;  // typekonvertering
        return etternavn.equals(p.etternavn) && fornavn.equals(p.fornavn);
        /*if (o == this) return true;
        if (!(o instanceof Person)) return false;
        return compareTo((Person)o) == 0;*/
    }

    public int hashCode() {
        return Objects.hash(etternavn, fornavn); }

    public String toString() {
        return String.join(" ", fornavn, etternavn);
        //return fornavn + " " + etternavn;
    }

    public boolean equals(Person p) {
        if (p == this) return true;
        if (p == null) return false;
        return etternavn.equals(p.etternavn) && fornavn.equals(p.fornavn);
    }

}
