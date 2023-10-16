package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje6{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * For petlja - "Za" petlja
         *
         * for (<inicijalizacija_promenivih>; <uslov_petlje>; <update>) {
         *   //linija 1
         *   //linija 2
         *   //...
         *   //linija N
         * }
         *
         * */


        /*
         * 1. Korisnik unosi neki nenegativan ceo broj n.
         * Ispisati poruku "Zdravo svete" n broj puta.
         * */
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Zdravo svete");
        }

        System.out.println("Kraj programa");

        /*
         * 1. Incijalizacija se vrsi SAMO JEDNOM, pre svega
         * 2. Nakon inicijalizacije, vrsi se provera uslova. Ako je uslov zadovoljen radi se telo petlje.
         * 3. Nakon izvrsenja celog tela petlje, vrsi se update, a zatim se ponovo proverava uslov
         * 4. Kada uslov nije zadovoljen, petlja se okoncava.
         *
         * Q: Da li je for ekvivalentan sa while petljom? <==> Da li sve sto mogu da odradim while-petljom mogu i for
         * A: Jesu ekvivalente
         *
         * int i = 0;
         * while (i < n){...; i++;}
         *   ^
         *   |
         *   |
         *   v
         * for (int i = 0; i < n; i++) {...;}
         *
         * Jedina sustinska razlika je to sto brojac/brojaci su inicijalizovan i postoje VAN while petlje,
         * a kod for petlje postoje samo UNUTAR nje.
         *
         * "Syntax sugar"
         *
         *
         * Generalno:
         * For - kada unapred "znamo" koliko puta ce se obrnuti (npr n puta)
         * While - kada to ne znamo
         *
         * */

    }
}