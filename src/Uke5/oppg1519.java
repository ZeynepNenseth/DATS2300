package Uke5;

public class oppg1519 {
    public static void main(String[] args) {
        int[] a = {8, 13, 7, 2, 21, 18, 5, 3};
        //System.out.println(finnMaks(a,1, 5));
        System.out.println(indeksStorst(a,0,a.length-1));
    }

    public static int indeksStorst(int[] a, int v, int h) {
        if (v == h) return v;
        int m = (v + h)/2;
        int m_v = indeksStorst(a,v,m);
        int m_h = indeksStorst(a, m+1,h);
        return a[m_v] >= a[m_h] ? m_v : m_h;
    }

    /*public static int finnMaks(int[] a, int fra, int til) {
        int m = fra;
        int maksimum = a[fra];
        for (int i = fra; i < til; i++) {
            if (a[i] > maksimum) {
                m = i;
                maksimum = a[m];
            }
        }
        return m;
    }*/
}
