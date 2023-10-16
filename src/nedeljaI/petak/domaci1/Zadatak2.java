package nedeljaI.petak.domaci1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        /*2. Zadatak:
Napisati program gde korisnik unosi ceo broj, ukoliko je broj paran, promeniti ga u neparan i
istampati, ukoliko je neparan, samo ispisati poruku da je u pitanju neparan broj.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj:");
        int x = sc.nextInt();
        if ( x % 2 == 0) {
            System.out.println(x + 1);
        }
        else {
            System.out.println("U pitanju je neparan broj");
        }
    }
}
