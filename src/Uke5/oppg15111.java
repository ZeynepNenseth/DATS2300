package Uke5;

public class oppg15111 {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    public static int fib(int n) {         // det n-te Fibonacci-tallet
        if (n <= 1) return n;              // fib(0) = 0, fib(1) = 1
        else return fib(n-1) + fib(n-2);   // summen av de to foregående
    }
}
//fib(20) = 6765
//fib(30) = 832040
//fib(40) = 102334155

//fib(50) = programmet klarer ikke å beregne