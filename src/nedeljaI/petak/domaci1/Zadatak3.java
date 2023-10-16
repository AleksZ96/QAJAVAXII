package nedeljaI.petak.domaci1;

import java.util.Locale;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        /* 3. Zadatak:
Napisati program gde korisnik unosi dva realna broja, zatim unosi naziv operacije koju zeli
da izvrsi nad tim brojevima(sabiranje, oduzimanje, mnozenje, deljenje), zatim istampati
rezultat date operacije.

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi realan broj:");
        double a = sc.nextDouble();

        System.out.println("Unesite drugi realan broj:");
        double b = sc.nextDouble();

        System.out.println("Unesite naziv operacije (sabiranje, oduzimanje, mnozenje, deljenje)");
        String c = sc.next().toLowerCase(Locale.ROOT);

        if (c.equals("sabiranje")) {
            System.out.println("Rezultat je:"  + " " + (a + b));

        }
        else if (c.equals("oduzimanje")) {
            System.out.println("Rezultat je:"  + " " + (a - b));
        }
        else if (c.equals("mnozenje")) {
            System.out.println("Rezultat je:"  + " " + (a * b));
        }
        else if (c.equals("deljenje")) {
            System.out.println("Rezultat je:"  + " " + (a / b));
        }








    }
}
