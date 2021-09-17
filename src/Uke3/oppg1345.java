package Uke3;

public class oppg1345 {
    public static void main(String[] args) {
        //int[] b = {15, 8, 21, 16, 5, 19, 7, 23, 10, 14, 3, 11, 6, 17, 4};
        int n = 1000, antall = 200; // tabellstørrelse og gjentagelser
        long tid = 0;
        int a[] = Uke2.Tabell.randPerm(n);

        tid = System.currentTimeMillis();    // leser av klokken
        for (int i = 0; i < antall; i++) selectionsort(a);  // Programkode 1.1.2
        tid = System.currentTimeMillis() - tid;     // medgått tid
        System.out.println("selection sort-metoden w/o hjelpemetoder: " + tid + " millisek");
        // for n = 1000; antall = 200, det tar 47 ms
    }
    public static void selectionsort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minverdi = a[i]; // minste verdi oppdateres
            int m = i;
            // Tabell.bytt(a, i, Tabell.min(a, i, a.length));
            //finner min
            for (int j = i + 1  ; j < a.length; j++) {
                if (a[j] < minverdi) {
                    m = j; // indeks til minste verdi oppdateres
                    minverdi = a[j]; // minste verdi oppdateres
                }
            }
            int temp = a[i];
            a[i] = a[m];
            a[m] = temp;
        }
        // m representerer index til minsteverdi nå


    }
}
