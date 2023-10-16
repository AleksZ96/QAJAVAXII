package nedeljaI.petak.zadaci;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {
        /*6.
         * Korisnik unosi koliko ima zlatnih novcica (1, 2 ili 3)
         * Treba ispisati sta sve moze da kupi od stvari:
         * - Mac kosta 1 zlatnik
         * - Stit kosta 2 zlatnika
         * - Konj kosta 3 zlatnika
         *
         * */
        Scanner sc = new Scanner(System.in);
        int brojZlatnihNovcica = sc.nextInt();
        switch (brojZlatnihNovcica){
            case 3:
                System.out.println("Konji");
            case 2:
                System.out.println("Stit");
            case 1:
                System.out.println("Mac");
        }
    }
}
