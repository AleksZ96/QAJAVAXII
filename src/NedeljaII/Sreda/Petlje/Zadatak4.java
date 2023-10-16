package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Zadatak4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * 4. Napisati program koji za uneti ceo broj n racuna proizvod svih brojeva od 1...n
         *
         * (ovo je faktorijel, n! = n * (n-1) * ... * 2 * 1  (0! = 1))
         * */

        int n = sc.nextInt();
        int prod = 1;
        //I nacin
        /*for (int i = 1; i <= n; i++)
            prod *= i;
        */
        //II nacin
        int brojac = 1;
        while (brojac <= n){
            prod *= brojac;
            brojac++;
        }
        System.out.println(prod);
    }
}
