package nedeljaII.petak.funkcije;

import java.util.Scanner;





public class Funkcije6 {

    //Definisem funkciju koja racuna prosek nekog int[] niza
    static double prosekNiza(int[] niz) {
        double prosek = 0.0;
        int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            sum += niz[i];
        }

        if (niz.length != 0)
            prosek = (double) sum / niz.length;
        return prosek;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * Izracunati prosek za zadata dva niza
         *
         * */
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {3, 5, 5, 5};

        double prosek1 = prosekNiza(niz1);
        double prosek2 = prosekNiza(niz2);

        System.out.println("Prosek 1. niza = " + prosek1);
        System.out.println("Prosek 2. niza = " + prosek2);
    }
}