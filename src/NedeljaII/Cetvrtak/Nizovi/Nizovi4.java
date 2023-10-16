package nedeljaII.cetvrtak.nizovi;

import java.util.Scanner;

public class Nizovi4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Informacije o nizovima
         *
         * length - duzina niza (int)
         * <identifikator_niza>.length; <- (int) broj elementa niza
         *
         * int x = new int[5];
         * x.length; <- vrati ce broj 5.
         *
         *
         *
         * */
        int[] x = {1, 2, 3, 4, 5, 100, 101, 102};
        System.out.println("Duzina niza = " + x.length);

    }
}