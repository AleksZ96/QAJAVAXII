package nedeljaI.petak.domaci1;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        /*1. Zadatak:
Napisati program gde korisnik unosi svoj broj godina. Ukoliko ima 18 ili vise godina, ispisati
poruku da korisnik sme da konzumira alkohol, u suprotnom ispisati neku drugu poruku.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj godina:");
        int brojGodina = sc.nextInt();
        if (brojGodina >= 18) {
            System.out.println("Imate dovoljno godina da konzumirate alkohol");
        }
        else {
            System.out.println("Nemate dovoljno godina da konzumirate alkohol");
        }
    }
}
