package nedeljaII.cetvrtak.petlje;

import java.util.Scanner;

public class Petlje11{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         *
         * 1. Korisnik unosi neki nenegativan ceo broj n, a zatim i n double brojeva.
         *  Izracunati prosek tih brojeva.
         * */

        /*int n = sc.nextInt();

        //prosek = sum/<broj_brojeva>
        double prosek = 0;
        double sum = 0;
        int brojac = 0;
        while (brojac < n){
            sum += sc.nextDouble();
            brojac++;
        }

        if (n != 0)
            prosek = sum / n;

        System.out.println("Prosek = " + prosek); */

        /*
         *
         * 2. Korisnik unosi double brojeve sve dok ne unese 0 (tj. 0.0)
         *    Izracunati proesk tih brojeva (ne racunajuci tu 0.0)
         *
         * */

        /*
         *
         * break - komanda
         *
         * Kada kod dodje do komande break; izazi iz petlje i nastavlja dalje. (zautvlja rad petlje)
         *
         * while (...) {
         *   //linija 1
         *   break;
         *   //ostatak
         * }
         * ....
         *
         *
         * Beskonacne petlje:
         * while (true) {
         *   ...
         * }
         *
         * for (; true; ){
         *   ...
         * }
         *
         * Ovakve petlje se vrte beskonacno.
         * Prilikom kreiranja ovakvih petlji moramo da obezbedimo neki nacin (preko break-a)
         * da kad-tad izadjemo iz nje.
         *
         * */

        double prosek = 0;
        double sum = 0;

        int brojUnosa = 0;
        while (true) {
            double trenutniBroj = sc.nextDouble();
            if (trenutniBroj == 0)
                break;
            sum += trenutniBroj;
            brojUnosa++;
        }

        if (brojUnosa != 0)
            prosek = sum / brojUnosa;
        System.out.println(prosek);

    }
}
