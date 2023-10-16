package nedeljaI.petak.grananje;

import java.util.Scanner;

public class Grananje5 {

    public static void main(String[] args) {
        /*
         * U svaki kod blok se moze upisati bilo sta (dok god pratimo pravila jave).
         *
         * Nestovanje if naredbi
         * if (<neki_uslov>){
         *   if (<neki_novi_uslove){
         *       ....
         *   }
         *   else{
         *       ....
         *   }
         * }
         * else{
         *    ...
         * }
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
        if (x >= 0){
            if (x > 0){ //1, 2, 3, ....
                System.out.println("Pozitivan");
            }
            else{ //x = 0
                System.out.println("Neutralan");
            }
        }// ..., -2, -1
        else{
            System.out.println("Negativan");
        }
    }
}