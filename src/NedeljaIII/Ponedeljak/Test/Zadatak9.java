package NedeljaIII.Ponedeljak.Test;

import java.util.Arrays;

public class Zadatak9 {
    static int vratiNajveciElementNiza(int[] niz){
        Arrays.sort(niz);
        int max = niz[niz.length-1];
        return max;
    }
    static int vratiMaksOdTriNiza(int[] niz1, int[] niz2, int[]niz3){
        int max1 = vratiNajveciElementNiza(niz1);
        int max2 = vratiNajveciElementNiza(niz2);
        int max3 = vratiNajveciElementNiza(niz3);
        int maksOdDva = Math.max(max1, max2);
        int maksodTri = Math.max(maksOdDva, max3);
        System.out.println(maksodTri);
        return maksodTri;
    }
    public static void main(String[] args) {
        // 9. Napisati funkciju koja vraca najveci element niza.
       vratiNajveciElementNiza(new int[]{1, 2, 3, 8, 7, 150, 6});


        //Napraviti funkciju koja prima dva niza celih brojeva i kao rezultat vraca najveci broj.
        vratiMaksOdTriNiza(new int[]{1, 5, 6}, new int[] { 7, 1, 3}, new int[]{100});
    }

}
