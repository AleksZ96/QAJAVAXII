package nedeljaI.petak.skener;

import java.util.Scanner;

public class Zadatak2 {

    /*
     * Korisnik unosi jedan broj x, jedan karakter c i jos jedan broj y sa standardnog ulaza.
     * Na standardni izlaz ispisati string "x c y"
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        char c = sc.next().charAt(0); //Prikuplja string i uzima samo prvi karakter
        double y = sc.nextDouble();
        System.out.print(x);
        System.out.print(" ");
        System.out.print(c);
        System.out.println(" " + y);
    }
}