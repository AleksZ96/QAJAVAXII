package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje9{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * * 21. zadatak sa pastebin-a
         * Korisnik unosi ceo broj n, a zatim i n celih brojeva. Ispisati najmanji i najveci
         * broj od tih unetih.
         *
         * Npr:
         * n = 5
         * 1 2 3 10 11
         * -> max = 11
         * -> min = 1
         *
         * Npr:
         * n = 5
         * 10 2 11 1 3
         * -> max = 11
         * -> min = 1
         * Npr:
         * n = 1
         * 5
         * -> max = 5
         * -> min = 5
         * */

        int n = sc.nextInt();

        /*
         * Ideja:
         * 1. Zapamtimu prvi broj kao da je on
         * i najmanji i najveci
         * 2. Za svaki sledeci broj
         * proveravamo da li je on manji od najmanjeg,
         * ako jeste, on je novi najmanji.
         * Isto to i za najveci, ako je trenutni broj
         * veci od najveceg onda je on novi najveci.
         * */

        int prviBroj = sc.nextInt();
        int min = prviBroj, max = prviBroj;

        int i = 1;
        while (i < n) {
            int trenutniBroj = sc.nextInt();
            if (trenutniBroj < min)
                min = trenutniBroj;
            if (trenutniBroj > max)
                max = trenutniBroj;

            i++;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
