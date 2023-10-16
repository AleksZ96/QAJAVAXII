package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * 5. Napisati program koji zahteva od korisnika da unese pozitivan ceo broj
         * n ispisuje poruku "Punoletan" ili "Maloletan".
         *
         * -13 -> hajde ponovo
         * -1 -> hajde ponovo
         * 0 -> hajde ponov
         * 3 -> "Maloletan"
         * */

        int brojGodina;
        do {
            System.out.println("Unesite pozitivan broj");
            brojGodina = sc.nextInt();
        } while (brojGodina <= 0);

        if (brojGodina >= 18)
            System.out.println("Punoletan");
        else
            System.out.println("Maloletan");


        System.out.println("===========");
        //Neprirodan nacin (nepregledno)
        int brojGodina2 = sc.nextInt();
        for (; brojGodina2 <= 0; ) {
            brojGodina2 = sc.nextInt();
        }
        System.out.println(brojGodina2);
    }
}
