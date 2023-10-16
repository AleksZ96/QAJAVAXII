package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.println("Unesite ceo broj");
            n = sc.nextInt();


            if (n % 2 == 0) {
                System.out.println("Paran");
            } else if (n % 2 != 0) {
                System.out.println("Neparan");
            }
        }





    }
}
