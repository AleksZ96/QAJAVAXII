package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {
        /*
         * switch(vrednost){
         *   case vrednost1:
         *       ...
         *   case vredno2:
         *       ....
         *   case vrednos3:
         *       ....
         *       break;
         * }
         *
         *
         *
         * */

        /*
         * Korisnik unosi jednocifren broj mani ili jednak od 5,
         * ispisati sve brojeve od tog broja do 5, inkluzivno
         *
         * npr: 2 -> 2, 3, 4, 5
         * */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
                //break; //samo za ilustraciju
            case 5: //default:
                System.out.println("5");
                //break; //nema potrebe jer svakako izlazi iz switch-a
        }
    }
}