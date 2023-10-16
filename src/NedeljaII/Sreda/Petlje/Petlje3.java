package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Zadatak:
         * Korisnik unosi neki nenegativan ceo broj n.
         * Ispisati zbir brojeva:
         * 0 + 1 + 2 + 3 + ... + n
         *
         *
         * Npr:
         * n = 5 -> 15
         * n = 10 -> 55
         * */

        /*
         * 15
         * 0 + 1 + 2 + 3 + 4 + 5
         * 1 + 2 + 3 + 4 + 5
         * 3 + 3 + 4 + 5
         * 6 + 4 + 5
         * 10 + 5
         * 15
         *
         * */
        int n = sc.nextInt();
        int sum = 0; //ovo se zove akumulator
        int brojac = 0;
        while (brojac <= n) {
            sum += brojac;
            brojac++;
        }
        System.out.println("Suma je " + sum);

        /*
         * Posledica:
         * Sve sto hocu da koristim nakon petlje, moram da definisem pre petlje.
         *
         * Generalna ideja kod akumulator:
         * Uzima se za pocetnu vrednost ono sto je neutral za operaciju(e) koje
         * se vrse nad tim akumulatorom.
         *
         * */

    }
}