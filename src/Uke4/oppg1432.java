package Uke4;

public class oppg1432 {
    public static void main(String[] args) {
        System.out.println(Integer.compare(-1, 1));
        // Compares two int values numerically
        // returnerer -1, fordi -1 < 1

        System.out.println(Integer.compareUnsigned(-1, 1));
        // Compares two int values numerically treating the values as unsigned.
        // returnerer 1, unsigned betyr at a variable that can hold only positive numbers
        // "signed" in computer code indicates that a variable can hold negative and positive values.
    }
}
