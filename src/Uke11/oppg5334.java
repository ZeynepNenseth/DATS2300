package Uke11;

import java.util.Arrays;

public class oppg5334 {
    public static void main(String[] args) {
        int[] a = {-99,3,5,4,10,5,8,18,12,17,11,10,14,9};

        int[] b = {-99,18,5,14,10,11,8,3,12,17,5,10,4,9};
        for (int i = 1; i < b.length; i++) {
            int denne = i;
            int forelder = i / 2;

            while (forelder > 0 && b[forelder] > b[denne]) {
                int temp = b[forelder];
                b[forelder] = b[denne];
                b[denne] = temp;
                denne = forelder;
                forelder = denne / 2;
            }
        }
        System.out.println(Arrays.toString(b));  // [-99, 3, 5, 4, 12, 10, 5, 8, 18, 17, 11, 10, 14, 9]
    }
}
