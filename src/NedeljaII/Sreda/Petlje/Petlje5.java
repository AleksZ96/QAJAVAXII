package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje5{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * 2. Do-While petlja
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
            if (i != 0) {
                System.out.println("Zdravo svete");
            }
            i++;
        } while (i <= n);

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
         * A: Mozemo, uz manipulaciju iteracija
         * */

        /*
         * Posledica:
         * Vrlo je bitno da li idu prvo petlja, pa grananje
         * ili
         * prvo grananje pa petlja
         *
         * */

        /*
         * Posledica:
         * Nekada ce jedna petlja biti "bolja", tj. laksa za rad od neke druge. (Zavisi od zadatka)
         *
         * */
    }
}
