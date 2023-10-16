package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        /*1.
Korisnik unosi dva cela broja a i b; Ispisati odgovarajucu poruku:
- "Oba su pozitivna"; ako su oba broja pozitivna
- "Oba su negativna"; ako su oba broja negativna
- "Jedan je pozitivan a drugi negativan"; ako je jedan pozitivan, a drugi negativan */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dva cela broja");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        if (x1 > 0) {
            if(x2> 2) {
                System.out.println("Oba su pozitivna");
            }
            else if (x2 < 0 || x1 < 0) {
                System.out.println("Jedan je pozitivan a drugi negativan");

            }
            else {
                System.out.println("Oba su negativna");
            }



        }


/*
* 2.
Korisnik unosi cenu artikla (double) i raspolozivo stanje svog racuna.(double)
Ispisati poruku:
- "Ne mozete kupiti artikal"; ukoliko korisnik nema dovoljno novca na racunu
 - "Kupili ste artikal"; ukoliko korisnik ima dovoljno novca na racunu
 Ispisati poruku "Preostalo stanje na racunu: <stanje_na_racunu>"
* */

/*
* 3.
Korisnik unosi broj svojih godina (int), svoju visinu u metrima (double) i
* minimalnu potrebnu visinu za ulazak u luna park(double).
Ispisati poruku:
- "Dobro dososli" - ukoliko je korisnik strogo stariji od 16 godina
                  ili visi od minimalne visine.
- "Ne mozete prisustvovati luna parku" - inace
* */

/*4.
 Korisnik unosi ceo broj x.
Ispisati apsolutnu vrednost broja x
Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost
*/

        /* 5. Korisnik unosi jednocifren ceo broj
         * ispisati poruku "Paran" odnosno "Neparan" ako je unet
         * broj paran, odnosno neparan.
         * Uz zabranu koriscenja mod operatora (%)
         * */

        /*6.
         * Korisnik unosi koliko ima zlatnih novcica (1, 2 ili 3)
         * Treba ispisati sta sve moze da kupi od stvari:
         * - Mac kosta 1 zlatnik
         * - Stit kosta 2 zlatnika
         * - Konj kosta 3 zlatnika
         *
         * */

    }
}
