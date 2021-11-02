package forelesningskode;

import java.util.Arrays;

import static Uke2.Tabell.bytt;

public class RecursivePermutation {
    public static void main(String[] args) {
        System.out.println("Recursive permutations!");

        int values[] = {1, 2, 3};
        recursive_permutation(values, 0);
    }



    public static void recursive_permutation(int[] values, int k) {
        if (k == values.length - 1) {
            System.out.println(Arrays.toString(values));
        }

        for (int i = k; i < values.length; ++i) {
            bytt(values, i, k);
            recursive_permutation(values, k + 1);
            bytt(values, k, i);
        }
    }
}
