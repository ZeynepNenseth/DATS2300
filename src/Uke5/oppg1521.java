package Uke5;

public class oppg1521 {
    public static void main(String... args) {
        System.out.println("main() starter!");
        int sum = tverrsumPrint(172958);
        System.out.println("main() er ferdig!");
    }

    public static int tverrsumPrint(int n) {
        System.out.println("tverrsum(" + n + ") starter!");
        int sum = (n < 10) ? n : tverrsumPrint(n / 10) + (n % 10);
        System.out.println("tverrsum(" + n + ") er ferdig!");
        return sum;
    }
}
/*main() starter!
tverrsum(172958) starter!
tverrsum(17295) starter!
tverrsum(1729) starter!
tverrsum(172) starter!
tverrsum(17) starter!
tverrsum(1) starter!
tverrsum(1) er ferdig!
tverrsum(17) er ferdig!
tverrsum(172) er ferdig!
tverrsum(1729) er ferdig!
tverrsum(17295) er ferdig!
tverrsum(172958) er ferdig!
main() er ferdig!*/
