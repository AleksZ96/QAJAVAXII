package nedeljaI.petak.grananje;

import java.util.Scanner;

public class Grananje4 {

    public static void main(String[] args) {
        /*
         * Neke cinjenice o if-else grananju:
         *
         * 1.Negacija uslova obrce grane
         * if (uslov){
         *   kod1
         * }
         * else{
         *   kod2
         * }
         * |
         * |
         * v
         * if (!uslov){
         *   kod2
         * }
         * else{
         *   kod1
         * }
         *
         * Negacija vs Suprotnost
         * Izraz: "Svi nose kape"
         * Negacija izraza: "Neko ne nosi kapu"
         * Suprotnost izraza: "Svi ne nose kapu"
         *
         * x nije strogo veci od 5 ==> x je 5 ili je x strogo manji od 5
         *
         * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0){ //mogli smo i if (!(x >= 0))
            System.out.println("Uneli ste negativan broj");
        }
        else{
            System.out.println("Uneli ste pozitivan broj");
        }


        /*
         * 2.Ukoliko imamo praznu else granu, nju mozemo samo da obrisemo
         * if (uslov){
         *   ...
         * }
         * else{}
         * |
         * |
         * v
         * if (uslov){
         *   ...
         * }
         *
         * */
        //Korisnik unosi broj z. Ako je uneo broj veci od 10, ispisati poruku "Uneliste visecifreni broj"
        //Inace, neodraditi nista
        int z = sc.nextInt();
        if (z >+ 10){
            System.out.println("Uneliste visecifreni broj");
        }
        //else{}

        /*
         * 3.Ukoliko imamo praznu if-granu mozemo da je "obrisemo" uz preraspodelu koda
         * if (uslov){}
         * else{
         *   ....
         * }
         * |
         * | 1
         * |
         * v
         * if (!uslov){
         *   ....
         * }
         * else{}
         * |
         * | 2
         * |
         * V
         * if (!uslov){
         *   ....
         * }
         *
         * */
        //Korisnik treba da unese broj strogo veci od 5
        //Ispisati poruku "Nije dobar unos" ako korisnik ne unese broj strogo veci od 5
        int y = sc.nextInt();
        /*
         * if (y < 5){}
         * else{
         *   System.out.println("Nije dobar unos");
         * }
         *
         * */
        if(!(y < 5)){ //(y >= 5)
            System.out.println("Nije dobar unos");
        }

        /*
         * 4.Brisanje trivijalnog if uslova
         * if (true){
         *   ...kod1...
         * }
         * ...kod2...
         * |
         * |
         * |
         * V
         * ... kod1...
         * ... kod2...
         *
         * */

    }
}