package NedeljaII.Cetvrtak.Petlje;

import java.util.Scanner;

public class Petlje12{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * 1. Korisnik unosi neke ocene nekog osnovca. Ispisati prosek tog osnovca.
         *  - Sve dok se ne unese ocena 0
         *  - Sve ostale nevalidne ocene zanemariti.
         *
         * > 3 5 5 5 0 -> 4.5
         * > 3 5 6 5 5 -2 0 -> 4.5 (zanemarujemo 6 i zanemarujemo -2)
         *
         * //Za harbre: Isti ovaj zadatak ali se unos zaustavlja kada unesemo nesto sto nije broj (dakle, char String ili boolean)
         *
         *
         * continue; - vraca se na uslov petlje, ponov se pita da li je ispunjen ili ne
         *
         * while (...) {
         *   ....
         *   continue;
         *   ....
         * }
         * ....
         *
         * */

        double prosek = 0;
        int sum = 0;
        int brojBrojeva = 0;
        while (true) {
            int trenutniBroj = sc.nextInt();
            if (trenutniBroj == 0)
                break;
            if (trenutniBroj < 0 || trenutniBroj > 5)
                continue;
            sum += trenutniBroj;
            brojBrojeva++;
        }

        if (brojBrojeva != 0)
            prosek =  sum / (double)brojBrojeva; //kastovanje -> prebacivanje jednog tipa podatka u drugi | mogli smo i 1.0 * brojBrojeva

        /*
         * Ispravka, moja greska!
         * BITNO:
         * DOVOLJNO je da jedan operand bude double da bi resenje bilo double
         * */

        /*
         * Uopsteno kastovanje
         * (tip_u_koji_zelimo_da_prebacimo_promenjivu) <promenjiva>
         *
         * Kastovanje menja literal neke promenjive, a ne menja njen tip!
         *
         * */
        System.out.println(prosek);

    }
}