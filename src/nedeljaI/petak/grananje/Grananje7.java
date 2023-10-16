package nedeljaI.petak.grananje;

import java.util.Scanner;

public class Grananje7 {

    public static void main(String[] args) {
        /*
         * if-else if (- else) grananje
         * if (uslov1){
         *   ...kod1...
         * }
         * else if (uslov2){
         *   ...kod2...
         * }
         * else if (uslov3){
         *   ...kod3...
         * }
         * ....
         * else if (uslovN){
         *   ...kodN...
         * }
         * //opcionalo
         * else{
         *   ...kodElse...
         * }
         *
         * Posledice:
         * - Izvrsice se PRVI kod blok ciji uslov je zadovoljen
         * - Ako nijedan uslov nije zadovoljen izvrsice se else grana (ako ona postoji)
         * - Else grana ==> barem jedan kod blok ce se izvrsiti (tj. tacno jedan)
         * - Ako nemamo else granu => moguce je da se ni jedan blok nece izvrsiti (ako nijedan uslov nije ispunjen)
         *
         * */

        /*
         * Korisnik unosi broj. Ispisati poruke:
         * "Pozitivan"; ako je korisnik uneo pozitivan broj
         * "Neutralan"; -//- uneo 0
         * "Negativan"; inace
         * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0){
            System.out.println("Pozitivan");
        }
        else if (x == 0){
            System.out.println("Neutralan");
        }
        else {
            System.out.println("Negativan");
        }
    }
}