package Uke5;

public class oppg1526 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {                       // med utskriftssetninger
        System.out.println("fib(" + n + ") starter!");
        int fib = n > 1 ? fib(n-1) + fib(n-2) : n;
        System.out.println("fib(" + n + ") er ferdig!");
        return fib;                                      // metoden er ferdig
    }
}
/**fib(5) starter!
fibf(4) starter!
fib(3) starter!
fib(2) starter!
fib(1) starter!
fib(1) er ferdig!
fib(0) starter!
fib(0) er ferdig!
fib(2) er ferdig!
fib(1) starter!
fib(1) er ferdig!
fib(3) er ferdig!
fib(2) starter!
fib(1) starter!
fib(1) er ferdig!
fib(0) starter!
fib(0) er ferdig!
fib(2) er ferdig!
fib(4) er ferdig!
fib(3) starter!
fib(2) starter!
fib(1) starter!
fib(1) er ferdig!
fib(0) starter!
fib(0) er ferdig!
fib(2) er ferdig!
fib(1) starter!
fib(1) er ferdig!
fib(3) er ferdig!
fib(5) er ferdig!
 5
 */