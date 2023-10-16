package nedeljaI.petak.skener;

//Ovde importujemo druge klase
// import <putanja_do_klase_preko_paketa>.<Ime kalse>
/*
 * Ukoliko zelimo da importujemo SVE iz klase
 * iz nekog paketa "paket"
 * import paket.*;
 * */

import java.util.Scanner;

public class Cas1 {

    public static void main(String[] args) {
        //Scanner
        /*
         * Scanner je klasa
         * koja nam sluzi da prikupljamo
         * nekakav unos i da sa njime dalje baratmo
         *
         * System.in - zahteva unos od korisnika preko kozole (tastature)
         *
         * */
        Scanner sc = new Scanner(System.in);

        /*
         * 1. sc.nextInt()
         * Zahteva od korisnika da unese neki ceo broj
         * */
        int x = sc.nextInt(); //Ova komanda prikuplja integer kojeg korisnik unese preko tastature i smesta ga u promenjivu x
        System.out.println(x);

        //Exit code 0 -> Program se samostalno zavrsio bez ikakvih problema
        //Inace postoji neka greska


        /*
         * 2. sc.nextDouble()
         * -//- da unese neki realan broj
         * */
        double y;
        //....
        y = sc.nextDouble();
        System.out.println("Uneli ste realan broj: " + y);

        /*
         * 3. sc.nextBoolean()
         * -//- neki boolean true/false
         * */

        /*
         * 4. sc.nextLine()
         * sc.nextLine() prikuplja sve podatke do narednog Entera kao String
         * */
        sc.nextLine();
        System.out.println("Unesite neku poruku");
        String poruka = sc.nextLine();
        System.out.println("Uneli ste poruku : " + poruka);

        //Unosenje karaktera radimo preko unosenja Stringova
    }
}