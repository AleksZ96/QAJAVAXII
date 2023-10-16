package nedeljaII.cetvrtak.nizovi;

import java.util.Scanner;

public class Nizovi3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Pristupanje elementima niza
         * int[] x = new int[5]; // 0..4
         *
         * <identifikator>[<indeks_elementa_kog_trazimo>]; --> vraca literal onog tipa kojeg je nas niz.
         *
         * x[0] <- pristupa 1. elementu niza
         * x[1] <- pristupa 2. elementu niza
         * ...
         * x[4] <- pristupa 5. i poslednjem elementu niza.
         *
         * Menjanje ELEMENTA NIZA:
         * x[0] = 12; <- ovo je dozvoljeno!
         *
         * Dozvoljeno je da menjamo vrednosti elemenata niza ali ne i njihov broj (ne duzinu niza)
         * */

        int[] x = new int[5];

        //Dodeljivanje vrednosti elementima niza
        x[0] = 10;
        x[1] = 11;
        x[2] = 50;
        x[3] = -100;
        x[4] = 4;

        //Pristupanje elementima niza
        int prviElement = x[0];
        System.out.println("Prvi element = " + prviElement);
        System.out.println("Drugi element = " + x[1]);
        System.out.println("Poslednji element = " + x[4]);


        //Sta se desi ako odstapamo samo x?
        System.out.println(x); // lokacija u memoriji - ovo je apsolutno beskorisno



    }
}
