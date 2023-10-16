package NedeljaIII.Cetvrtak.Liste;

import java.util.Arrays;
import java.util.List;

public class Liste3 {


    public static void main(String[] args) {
        /*
         * Klasa Arrays
         * - Klasa za rad nad nizovima
         *
         *
         *
         * */

        int[] x = new int[]{1, 2, 3, 4, 5};
        //Ispisisavnje niza:
        System.out.println(Arrays.toString(x));

        //Poredjenje nizova
        int[] y = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(x, y));


        //Sortiranje nizova
        int[] z = {-4, 3, - 15, 1, -2, 5, 6, 7, 9, 8};
        Arrays.sort(z);
        System.out.println(Arrays.toString(z));

        //Kreacija liste
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(lista);


    }
}