package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * 2. Do-While petlja - "Radi sve dok"
         *
         * do {
         *   //linija 1
         *   //linija 2
         *   //...
         *   //linija N
         * } while (<neki_logicki_uslov>);
         * */

        /*
         * 1. Korisnik unosi neki nenegativan ceo broj n.
         * Ispisati poruku "Zdravo svete" n broj puta.
         * */

        //Ovaj kod ne radi kako treba ((samo) ne radi za 0)
        int n = sc.nextInt();
        int i = 0;
        do {
            System.out.println("Zdravo svete");
            i++;
        } while (i < n);

        System.out.println("Kraj programa");

        /*
         * Posledice:
         * Do-While petlja ce se izvrsiti UVEK BAREM JEDNOM, dok kod while petlje to ne mora da znaci
         *
         * - Ako zelimo da garantujemo barem jedan prolazak kroz petlju -> onda koristimo do-while
         *
         * Q: Da li su while i do-while ekvivalentni?
         * A: Nisu, zbog redosleda proveravanja uslova
         *
         * Q: Da li mozemo da napravimo da while i do-while rade isto?
         * A:
         * */
    }
}