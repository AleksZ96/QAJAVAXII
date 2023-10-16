package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /* 5. Korisnik unosi jednocifren ceo broj
         * ispisati poruku "Paran" odnosno "Neparan" ako je unet
         * broj paran, odnosno neparan.
         * Uz zabranu koriscenja mod operatora (%)
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jednocifren ceo broj");
        int x = sc.nextInt();
        if (x == 8 || x == 6 || x == 4 || x == 2 || x == 0) {
            System.out.println("Uneli ste paran broj" );
        }
        else {
            System.out.println("Uneli ste neparan broj");
        }



    }

}
