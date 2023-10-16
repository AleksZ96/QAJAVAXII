package nedeljaII.cetvrtak.nizovi;

import java.util.Scanner;

public class Nizovi6{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * Osnovne operacije nad nizovima (nastavak)
         *
         * */

        //2. Hocemo da unesemo sve elemente niza
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }


        for (int e : x)
            System.out.print(e + " ");

        System.out.println("\n==================");

        //3. Racunanje sume niza
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println("Suma = " + sum);

        System.out.println("\n==================");

        //4. Pisanje niza obrnuto
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] +  " ");
        }
        System.out.println();

        //5. Provera da li su dva niza identicna (ista)
        /*
         *
         * Dva niza su ista ako imaju isti broj elemenata i na svakom indeksu imaju istu vrednost
         *
         *
         * niz1 == niz2 <- poredi njihove reference <- ne mozemo tako
         * */
        System.out.println("\n==================");
        System.out.println("\n==================");
        double[] niz1 = new double[]{1, 2, 3, 4, 5};
        double[] niz2 = new double[]{1, 2, 3, 4}; //ovaj nije isti sa niz1 jer ima manje elemenata
        double[] niz3 = new double[]{0, 2, 3, 5, 404}; //ovaj nije isti sa niz1 jer nije isti element-po-element
        double[] niz4 = new double[]{1, 2, 3, 4, 5};

        boolean daLiSuIsti = true; // "Trik" - pretpostavka koju treba narusiti - flag "Zastavica"
        if (niz1.length == niz4.length) { //provera 1. uslova "iste duzine"
            for (int i = 0; i < niz1.length; i++) { // nebitno da li je niz1.len ili niz2.len jer znamo da su u tom momentu nizovi istih duzina
                //System.out.println("Poredim: " + niz1[i] + " i " + niz4[i]);
                if (niz1[i] != niz4[i]) { //provera 2. uslova "isti element-po-element"
                    daLiSuIsti = false;
                    break;
                }
            }
        }
        else {
            daLiSuIsti = false;
        }

        System.out.println("Nizovi su isti? " + daLiSuIsti);



    }
}