package nedeljaI.petak.skener;

import java.util.Scanner;

public class Zadatak1 {

    /*
    * Zadatak 1:
        Korisnik unosi dva realna broja x i y sa tastature (standardni ulaz).
        Prikazati rezulate:
            x + y
            x - y
            x * y
            x / y
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva realna broja:"); //Prihvatice i ako ih navodimo u jednom redu
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Vrednost x + y = " + (x + y));
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);


    }


}