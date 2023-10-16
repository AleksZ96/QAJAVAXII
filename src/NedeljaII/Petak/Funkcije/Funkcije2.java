package nedeljaII.petak.funkcije;

import java.util.Scanner;

public class Funkcije2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Izracunati prosek za zadata dva niza
         *
         * */
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2= {3, 5, 5, 5};

        double prosek = 0.0;

        int sum = 0;
        for (int i = 0; i < niz1.length; i++) {
            sum += niz1[i];
        }
        prosek = (double) sum / niz1.length;
        System.out.println("Prosek prvog niza je: " + prosek);

        sum = 0;
        for (int i = 0; i < niz2.length; i++) {
            sum += niz2[i];
        }
        prosek = (double) sum / niz2.length;
        System.out.println("Proske drugog niza je: " + prosek);

        /*
         * Funkcije nam stizu u pomoc
         * kada hocemo javu "da naucimo jedan postupak"
         * kako da radi, pa posle da moze da ga primenjuje
         * na sve slucajeve.
         *
         * */

    }
}