package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * 1. While petlja - "Sve dok" petlja
         * - Ova petlja radi sve dok je zadati uslov ispunje
         * */

        /*
         * while (<neki_logicki_uslov>) {
         *   //linija 1
         *   //linija 2
         *   //....
         *   //linija N
         * }
         *
         * //ostatak koda
         *
         *
         * Iteracija petlje = jedan prolazak korz blok petlje
         *
         * */

        /*
         *
         * Korisnik unosi neki nenegativan ceo broj n.
         * Ispisati poruku "Zdravo svete" n puta.
         *
         * */

        /*
         * Ideja:
         * Brojimo koliko puta smo do sada ispisali poruku.
         * U onom momentu kada to bude bilo n puta zavrsavamo program.
         * */
        int n = sc.nextInt();
        int i = 0; //definisemo brojac
        //Napomena: U programiranju sve se broji od 0.
        while (i < n) {
            System.out.println("Zdravo svete");
            //Update (mog uslova):
            i++; //Povecavamo i za 1, jer smo jednom ispisali poruku u trenutnoj iteraciji petlje
        }

        /*
         *
         * Prilikom "update-a" uslova, SVE promenjive koje
         * figurisu u uslovu moraju da se nadju i u update-u.
         *
         * */

        /*
         * Moramo da garantujemo
         * da se petlja NEKADA (KAD-TAD) zavrsi!
         *
         * */

    }
}