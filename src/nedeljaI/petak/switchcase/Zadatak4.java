package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

         /*4.
 Korisnik unosi ceo broj x.
Ispisati apsolutnu vrednost broja x
Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int x = sc.nextInt();
        if (x >= 0) {
            System.out.println("Apsolutna vrednost ovog broja je:" + " " + x);
        }
        else {
            System.out.println("Apsolutna vrednost ovog broja je:" + " " + (-x));
            System.out.println("x-u je promenjen znak");
        }



    }
}
