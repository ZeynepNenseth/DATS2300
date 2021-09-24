package Uke5;

public class oppg1531 {
    public static void main(String[] args) {
        int[] a = {2, 7, 13, 5, 21, 18, 4, 1, 26, 14};
        sum(a, 4);
    }
    public static int sum(int[] a, int n) { // summen av de n første
        System.out.println("sum(" + n + ") starter!");
        if (n == 1) return a[0];       // summen er verdien selv
        int resultat = sum(a,n-1) + a[n-1];    // summen av de n-1 første + a[n-1]
        System.out.println("sum(" + n + ") er ferdig!");
        return resultat;
    }
}
// Krav 1 er oppfyllt siden metoden kaller til seg selv en gang i linje 6.
// Krav 2 er oppfyllt siden metoden jobber mot et basistilfelle i linje 5.
// Maksimal rekursjonsdybden er n siden det blir n lag på programstakken. Total antall av kall 2 * n?
/**
 * sum(4) starter!
 * sum(3) starter!
 * sum(2) starter!
 * sum(1) starter!
 * sum(2) er ferdig!
 * sum(3) er ferdig!
 * sum(4) er ferdig!
 */
