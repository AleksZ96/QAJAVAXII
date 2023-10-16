package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadataka10 {
    public static void main(String[] args) {
        //10. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Unesite broj meseca rodjenja");
            int mesec = sc.nextInt();
            System.out.println("Unesite broj dana rodjenja");
            int dan = sc.nextInt();

            if (mesec == 1) {
                if (dan <= 23) {
                    System.out.println("Jarac");
                }
                else {
                    System.out.println("Vodolija");
                }
            }
        }


    }
}
