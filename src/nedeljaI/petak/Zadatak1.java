package nedeljaI.petak.zadaci;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        /*1.
Korisnik unosi dva cela broja a i b; Ispisati odgovarajucu poruku:
- "Oba su pozitivna"; ako su oba broja pozitivna
- "Oba su negativna"; ako su oba broja negativna
- "Jedan je pozitivan a drugi negativan"; ako je jedan pozitivan, a drugi negativan */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //I nacin
        if (x > 0 && y > 0){
            System.out.println("Oba pozitivna");
        }
        else if (x <= 0 && y <= 0){
            System.out.println("Oba negativna");
        }
        //x > 0 && y < 0 || x < 0 && y > 0
        else{
            System.out.println("Jedan pozitivan, drugi negativan");
        }

        //II nacin - Koriscenje matematike
        if (x * y > 0){
            if (x > 0)
                System.out.println("Oba pozitivna");
            else
                System.out.println("Oba negativna");
        }
        else
            System.out.println("Jedan pozitivan, drugi negativan");

        /*
         * NAPOMENA:
         * Ukoliko posle neke naredbe grananja imamo samo 1 instrukciju
         * nije neophodno navoditi viticaste zagrade
         * */

    }
}
