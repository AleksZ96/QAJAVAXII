package nedeljaI.petak.switchcase;

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
        System.out.println("Unesite broj zlatnih novcica:");
        int x = sc.nextInt();
        if (x == 3){
            System.out.println("Konj kosta 3 zlatnika");
            System.out.println("Stit kosta 2 zlatnika");
            System.out.println("Mac kosta 1 zlatnik");
        }
        else if(x == 2) {
            System.out.println("Stit kosta 2 zlatnika");
            System.out.println("Mac kosta 1 zlatnik");
        }
        else if (x == 1){
            System.out.println("Mac kosta 1 zlatnik");
        }
    }
}
