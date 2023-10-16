package nedeljaI.petak.switchcase;

import java.util.Locale;
import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
      /*  2.Crveni kamion sive boje
        Mirko treba da preveze odredjenu robu iz Beograda u neki drugi grad.
        Napisati program koji preracunava koliko ce kostati takav put, uzimajuci u obzir koji kamion Mirko izabere,
        koju robu prenosi i do kog grada ide:

        -Crveni kamion trosi 7L/100km
        -Sivi kamion trosi 5L/100km
        a)Jedan litar goriva kosta 123.25 dinara.
        b)Korisnik unosi koliko litar goriva kosta.

        -Jabuke su teske 120kg
        -Banane su teske 150kg
        -Mandarine su teske 75kg
        Svaki kilogram dodaje 0.01L/100km potrosnje

        -Novi Sad je udaljen 100km od Beograda
        -Nis je udaljen 333km od Beograda
        -Subotica je udaljena 220km od Beograda

        Korisnik unosi 3 niske. Nisku "Crveni" ili "Sivi", zatim Nisku "Jabuke", "Banane" ili
        "Mandarine" a na kraju i Nisku "Novi Sad", "Nis", ili "Subotica".
                Ukoliko radite varijantu b) onda nakon toga korisnik unosi i jedan double broj.
        Ispisati koliko dinara ce kostati put.
        Pretpostaviti da je unos uvek validan
        ------------------------------------------------------------------------------------
                Primer 1a)
        Input:
        "Crveni" "Jabuke" "Novi Sad"
        Output:
        1010.65

        Primer 2a)
        Input:
        "Sivi" "Banane" "Subotica"
        Output:
        1762.475
       */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite boju kamiona:");
        String kamion = sc.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Koju robu prenosite?");
        String roba = sc.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Do kog grada idete?");
        String grad = sc.nextLine().toLowerCase(Locale.ROOT);


        if (kamion.equals("crveni") && roba.equals("jabuke") && grad.equals("novi sad") ) {
            System.out.println("Put ce kostati:" + " " + 1133.9);
        }
        else{
            System.out.println("nista");
        }






















        }
}
