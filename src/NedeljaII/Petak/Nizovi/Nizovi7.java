package nedeljaII.petak.nizovi;

import java.util.Scanner;

public class Nizovi7{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Osnovne operacije nad nizovima (nastavak II)
         *
         * */

        //6. Unosenje niza preko skenera
        /*
         * Korisnik unosi neki nenegativan ceo broj n, a zatim i n brojeva.
         * Smestiti te brojeve u niz.
         *
         * */
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        for(int e : niz){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("=======================");
        /*
         * Prazan niz = niz od 0 elemenata
         * oznaka: []
         * int[] x = new int[0];
         *
         *
         * */

        /*
         * null - niz
         *
         * null - nista
         *
         * int[] x = null; <- nista
         *
         * null je jedinstven!
         *
         * Primitivni tipovi ne mogu biti null.
         * Samo objektni tipovi mogu
         *
         * */
        int[] x = null;
        //System.out.println(x.length); //ovo je nemoguce jer x nema duzinu

        System.out.println("=======================");
        //7. Maximalan element niz
        int max = Integer.MIN_VALUE;
        // Double.NEGATIVE_INFINITY; Double.POSITIVE_INFINITY
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] > max)
                max = niz[i];
        }
        System.out.println("Maximum niza je : " + max);

        System.out.println("=======================");
        //8. Mininalni element niza
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] < min)
                min = niz[i];
        }
        System.out.println("Minimum niza je : " + min);

    }
}