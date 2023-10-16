package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje8{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         *
         * Ugnjezdene petlje (nestovane petlje)
         *
         * Dozvoljeno je:
         * while () {
         *   ...
         *   for (...) {
         *       for (...) {
         *           ....
         *       }
         *   }
         * }
         *
         * Interpretacija koja uglavnom radi:
         * 1. petlja -> Jedna brojevna osa **
         * 2. petlje -> Ravan (kao neka matrica) *
         * 3. petlje -> Prostor *
         * 4. petlje -> ....
         *
         * Konvencija imenovanja brojaca:
         * [i, j (jot), k], l, m, n, r, s, t .....
         *
         * */

        /*
         *
         * Ispisati "sahovsku" tablu od 8x8 '.'
         *
         * . . . . . . . .
         * . . . . . . . .
         * . . . . . . . .
         * . . . . . . . .
         * . . . . . . . .
         * . . . . . . . .
         * . . . . . . . .
         * . . . . . . . .
         *
         *
         * */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }

        System.out.println("==============");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("(i, j) = (" + i + ", " + j + ") | ");
            }
            System.out.println();
        }



    }
}