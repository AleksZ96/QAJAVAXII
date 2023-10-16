package nedeljaII.petak.nizovi;

import java.util.Scanner;

public class Nizovi8{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Kopiranje nizova
         *
         * */
        double d = 3;
        double copyD = d;
        d = 4;
        System.out.println(d);
        System.out.println(copyD);

        int[] x = {1, 2, 3, 4};
        int[] copyX = x; //Plitko kopiranje (shallow copy)
        x[0] = -123;
        copyX[1] = 555;

        System.out.println("x:");
        for(int e : x){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("copyX:");
        for(int e : copyX){
            System.out.print(e + " ");
        }
        System.out.println();

        /*
         * Plitko kopiranje je kopiranje refernce (niza).
         *
         *
         * */

        System.out.println("==============");
        /*
         * Duboko kopiranje (deep copy)
         *
         * 1. Kreiramo NOVI niz iste duzine kao i originalni (moramo da koristimo kljucnu rec new)
         * 2. Kopirali bi element-po-element iz originala u kopiju
         * */

        int[] pravaKopijaX = new int[x.length]; // 1.
        //2.
        for (int i = 0; i < pravaKopijaX.length; i++) {
            pravaKopijaX[i] = x[i];
        }

        x[0] = 0;
        System.out.println("x:");
        for(int e : x){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("pravaKopijaX:");
        for(int e : pravaKopijaX){
            System.out.print(e + " ");
        }
        System.out.println();

        /*
         * Kod objektnih tipva, ako imamo kopiranje bez kljucne reci new <- plitko kopiranje
         * a ako imamo kreaciju NOVOG objekta (npr niza) pa kopiranje elementa-po-element <- duboko kopiranje
         *
         *
         * */



        /*
         *
         * String ~ char[]
         * */

        String s = "abc";
        //Elementima stringa (tj karakterima) ne pristupamo pomocu uglastih zagrada: dakle ne s[0]
        //vec pomocu metode .charAt(index)

        //Pristupanje 0. karakteru string-a
        char nulti = s.charAt(0); //nulti = 'a';

        //s.length() - ono sto je .length za obicne nizove




    }
}