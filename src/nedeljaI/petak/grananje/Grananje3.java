package nedeljaI.petak.grananje;

import java.util.Scanner;

public class Grananje3 {

    public static void main(String[] args) {
        /*
         * if-else grananje
         * if (<neki_logicki_uslov>){
         *   //linija 1
         *   //linija 2
         *   //...
         *   //linija N
         * }
         * else {
         *   //linija 1
         *   //linija 2
         *   //...
         *   //linije M
         * }
         * //....
         *
         *
         * Kada imamo if-else grananje
         * uvek se izvrsava SAMO JEDNA od tih grana:
         * ili if grana
         * ili else grana
         * NIKADA se nece izvrsiti obe
         * */

        /*
         * Korisnik unosi neki ceo broj.
         * Treba ispisati poruku
         * "Uneli ste pozitivan broj" ako je korisnik uneo pozitivan broj
         * "Uneli ste negativan broj" ako je to bio negativan broj
         * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 0){
            System.out.println("Uneli ste pozitivan broj");
        }
        else{
            System.out.println("Uneli ste negativan broj");
        }
    }
}