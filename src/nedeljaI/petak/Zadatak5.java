package nedeljaI.petak.zadaci;

import java.util.Scanner;

public class Zadatak5{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /* 5. Korisnik unosi jednocifren ceo broj
         * ispisati poruku "Paran" odnosno "Neparan" ako je unet
         * broj paran, odnosno neparan.
         * Uz zabranu koriscenja mod operatora (%)
         * */
        int x = sc.nextInt();
        switch (x){
            case 1, 3, 5, 7, 9:
                System.out.println("Neparan");
                break;
            case 0, 2, 4, 6, 8:
                System.out.println("Paran");
                break;
        }
    }
}
