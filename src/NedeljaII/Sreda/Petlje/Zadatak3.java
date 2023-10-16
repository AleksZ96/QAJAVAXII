package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        /*
         *
         * * 3. Napisati program koji za uneti ceo broj n ispisuje brojeve:
         *   a) [1, n] --> 1 ... n
         *   b) [-14, 2n]
         *   c) [n, -n] -- opadajuci interval
         * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("a)");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nb)");
        for (int i = -14; i <= 2 * n; i++)
            System.out.print(i + " ");

        System.out.println("\nc)");
        for (int i = n; i >= -n; i--) //Ovde imamo petlju sa korakom od jedne dekrementacije
            System.out.print(i + " ");


    }
}
