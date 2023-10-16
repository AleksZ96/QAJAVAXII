package NedeljaII.Sreda.Petlje;

import java.util.Scanner;

public class Petlje7 {
    public static void main(String[] args) {
        /*
         * 1. Napisati program koji ispisuje sve parne brojeve od 1 do 100
         * 2. Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100
         * 3. Napisati program koji za uneti ceo broj n ispisuje brojeve:
         *   a) [1, n]
         *   b) [-14, 2n]
         *   c) [n, -n]
         * 4. Napisati program koji za uneti ceo broj n racuna proizvod svih brojeva od 1...n
         * 5. Napisati program koji zahteva od korisnika da unese pozitivan ceo broj n ispisuje poruku "Punoletan" ili "Maloletan".
         * */



        //1. Napisati program koji ispisuje sve parne brojeve od 1 do 100

       /* for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println( i + ": Broj je paran");
            }

        }
        */


        //2. Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100
         /*   for (int i = 1; i <= 100 ; i++) {
            if(i % 3 == 0){
                System.out.println (i + " " + "Broj je deljiv sa 3");
            }
            else if (i % 4 == 0) {
                System.out.println( i + " " + "Broj je deljiv sa 4");
            }

        }
        */


        /*3. Napisati program koji za uneti ceo broj n ispisuje brojeve:
        a) [1, n]
        b) [-14, 2n]
        c) [n, -n]
         */
        //a
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo broj");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
         */

        //b
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo broj");
        int n = sc.nextInt();
        for (int i = -14; i <= (n * 2) ; i++) {
            System.out.println(i);
        }

         */
        //c
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo broj");
        int n = sc.nextInt();
        for (int i = n; i >= (-n) ; i--) {
            System.out.println(i);
        }

         */

        //4. Napisati program koji za uneti ceo broj n racuna proizvod svih brojeva od 1...n
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo broj");
        int n = sc.nextInt();
        int proizvod = 1;
        for (int i = 1; i <= n ; i++) {
            proizvod = proizvod * i;
        }
        System.out.println(proizvod);

         */




        //5. Napisati program koji zahteva od korisnika da unese pozitivan ceo broj n ispisuje poruku "Punoletan" ili "Maloletan"

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Uneti ceo broj");
            n = sc.nextInt();
        }
        while( n <= 0);

            if (n >= 18) {
                System.out.println("Punoletan");
            }
            else if (n < 18 && n > 0) {
                System.out.println("Maloletan");
            }
            System.out.println("kraj programa");





    }
}
