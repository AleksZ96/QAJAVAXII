package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class SwitchCase1 {

    public static void main(String[] args) {
        /*
         * switch(neka_vrednost){
         *   case vrednost1:
         *       ...
         *       ..kod1...
         *       ....
         *       break;
         *   case vrednost2:
         *       ...
         *       ...kod2...
         *       ....
         *       break;
         *   ...
         *   case vrednostN:
         *       ....
         *       break;
         *   default:
         *       ....
         *       ....
         *       break;
         * }
         *
         * */

        /*
         * Korisnik unosi broj 0 ili 1.
         * Ispisati poruku "Jedan" ako je unet broj 1.
         * Ispisati poruku "Nula" ako je unet broj 0.
         * */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case 0:
                System.out.println("Nula");
                break;
            case 1:
                System.out.println("Jedan");
                break;
            default:
                System.out.println("Nisi uneo ni 0 ni 1");
        }

        /*
         * Q: Da li je switch-case isti kao if-else <==>
         *    Da li sve sto moze switch-case moze i if-else i obrnuto
         *
         * A: switch-case ==> if-else
         *    if-else =/=> switch-case
         *
         *    Ukoliko imamo samo "==" uslove ==> onda su jednaki
         *    Ukoliko imamo neke intervale za koje treba da vaze nasi uslovi ==> onda nisu jednaki
         *
         *
         *
         * */
    }
}