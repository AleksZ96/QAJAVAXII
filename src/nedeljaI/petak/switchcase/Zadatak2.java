package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*
* 2.
Korisnik unosi cenu artikla (double) i raspolozivo stanje svog racuna.(double)
Ispisati poruku:
- "Ne mozete kupiti artikal"; ukoliko korisnik nema dovoljno novca na racunu
 - "Kupili ste artikal"; ukoliko korisnik ima dovoljno novca na racunu
 Ispisati poruku "Preostalo stanje na racunu: <stanje_na_racunu>"
* */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cenu artikla:");
        double x = sc.nextDouble();
        System.out.println("Unesite raspolozivo stanje na racunu:");
        double y = sc.nextDouble();
        if (x > y) {
            System.out.println( "Ne mozete kupiti artikal");
        }
        else {
            System.out.println("Kupili ste artikal");
            System.out.println("Preostalo stanje na racunu:" + (y-x));
        }
    }
}
