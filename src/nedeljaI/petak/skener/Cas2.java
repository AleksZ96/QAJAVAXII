package nedeljaI.petak.skener;

import java.util.Scanner;

public class Cas2 {

    public static void main(String[] args) {
        //Kada inicijalizujemo skener, on nema tokene (ima 0 tokena)
        Scanner sc = new Scanner(System.in);

        /*
         * Varijanta: sc.next()
         * Prikuplja naredni token
         * Ako unesmo recenicu: "Zdravo svete!"
         * Scanner : ["Zdravo", "svete!"] <- 2 tokena
         *
         * Space odvaja tokene iz inputa
         * */
        //Unosimo bas poruku "Zdravo svete!"
        String token1 = sc.next();
        String token2 = sc.next();
        String token3 = sc.next();
        System.out.println("Token 1 : " + token1);
        System.out.println("Token 2 : " + token2);
        System.out.println("Token 2 : " + token3);

        /*
         * Ukoliko zelimo da ispraznimo skenere, da nema vise tokene
         * dovoljno je da uradimo jednu "praznu" instrukciju:
         * sc.nextLine();
         * */
        sc.nextLine();
    }
}