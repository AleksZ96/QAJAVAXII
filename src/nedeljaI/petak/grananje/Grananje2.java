package nedeljaI.petak.grananje;

import java.util.Scanner;

public class Grananje2 {

    public static void main(String[] args) {
        /*
         * if naredbe
         * if (<neki_logicki_uslov>){
         *   //linija 1
         *   //linija 2
         *   // ...
         *   //linija N
         * }
         * //...
         * */

        //Korisnik unosi neki broj. Ispisati poruku
        //"Uneli ste negativan broj" ukoliko korisnik unese negativan broj.
        //Ispisati taj broj uvecan za 5
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0){
            System.out.println("Uneli ste negativan broj");
        }
        System.out.println(x + 5);

    }
}