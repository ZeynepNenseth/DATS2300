package Uke5;

public class oppg1522 {
    public static void main(String[] args) {
        System.out.println("main() starter!");
        System.out.println(sum(4));
        System.out.println("main() er ferdig!");
    }
    public static int sum(int n) {       // summen av tallene fra 1 til n
        System.out.println("sum(" + n + ") starter!");
        if (n == 1) return 1;            // summen av 1 er lik 1
        int resultat = sum(n - 1) + n;        // summen av de  n – 1 første + n
        System.out.println(resultat);
        System.out.println("sum(" + n + ") er ferdig!");
        return resultat;
    }
}
//sout må komme før return
/*main() starter!
sum(4) starter!
sum(3) starter!
sum(2) starter!
sum(1) starter!
3
sum(2) er ferdig!
6
sum(3) er ferdig!
10
sum(4) er ferdig!
10
main() er ferdig!*/
