package Uke2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] values = {1, 7, 8, 2, 4, 6, 9, 5};

        //Outer loop: counts the number of cards we have sorted so far
        for (int i=0; i<values.length-1; ++i) {
            //Print out values
            System.out.println("Skal finne kort på plass " + i);
            System.out.println("Array før vi starter: " + Arrays.toString(values));
            //Inner loop: loops from end of the deck and forward through the
            //unsorted cards, and bubbles up
            for (int j=values.length-1; j>i; --j) {
                //Swap the cards if they are out of order
                if (values[j] > values[j-1]) {
                    int temp = values[j];
                    values[j] = values[j-1];
                    values[j-1] = temp;
                    System.out.println("Bytter " + values[j] + " med " + values[j-1] + ": " + Arrays.toString(values));
                }
            }
        }
        //Print out final sorted
        System.out.println("Ferdig sortert array:");
        System.out.println(Arrays.toString(values));
    }
    /*Skal finne kort på plass 0
Array før vi starter: [1, 7, 8, 2, 4, 6, 9, 5]
Bytter 6 med 9: [1, 7, 8, 2, 4, 9, 6, 5]
Bytter 4 med 9: [1, 7, 8, 2, 9, 4, 6, 5]
Bytter 2 med 9: [1, 7, 8, 9, 2, 4, 6, 5]
Bytter 8 med 9: [1, 7, 9, 8, 2, 4, 6, 5]
Bytter 7 med 9: [1, 9, 7, 8, 2, 4, 6, 5]
Bytter 1 med 9: [9, 1, 7, 8, 2, 4, 6, 5]
Skal finne kort på plass 1
Array før vi starter: [9, 1, 7, 8, 2, 4, 6, 5]
Bytter 4 med 6: [9, 1, 7, 8, 2, 6, 4, 5]
Bytter 2 med 6: [9, 1, 7, 8, 6, 2, 4, 5]
Bytter 7 med 8: [9, 1, 8, 7, 6, 2, 4, 5]
Bytter 1 med 8: [9, 8, 1, 7, 6, 2, 4, 5]
Skal finne kort på plass 2
Array før vi starter: [9, 8, 1, 7, 6, 2, 4, 5]
Bytter 4 med 5: [9, 8, 1, 7, 6, 2, 5, 4]
Bytter 2 med 5: [9, 8, 1, 7, 6, 5, 2, 4]
Bytter 1 med 7: [9, 8, 7, 1, 6, 5, 2, 4]
Skal finne kort på plass 3
Array før vi starter: [9, 8, 7, 1, 6, 5, 2, 4]
Bytter 2 med 4: [9, 8, 7, 1, 6, 5, 4, 2]
Bytter 1 med 6: [9, 8, 7, 6, 1, 5, 4, 2]
Skal finne kort på plass 4
Array før vi starter: [9, 8, 7, 6, 1, 5, 4, 2]
Bytter 1 med 5: [9, 8, 7, 6, 5, 1, 4, 2]
Skal finne kort på plass 5
Array før vi starter: [9, 8, 7, 6, 5, 1, 4, 2]
Bytter 1 med 4: [9, 8, 7, 6, 5, 4, 1, 2]
Skal finne kort på plass 6
Array før vi starter: [9, 8, 7, 6, 5, 4, 1, 2]
Bytter 1 med 2: [9, 8, 7, 6, 5, 4, 2, 1]
Ferdig sortert array:
[9, 8, 7, 6, 5, 4, 2, 1]*/
}
