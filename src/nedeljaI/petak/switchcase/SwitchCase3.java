package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class SwitchCase3 {

    public static void main(String[] args) {
        /*
         * Posledice:
         * 1. defualt - ne mora na kraj
         * 2. Ulancavanje
         * switch (vrednost){
         *   case v1:
         *   case v2:
         *   case v3:
         *       ....
         *       break;
         *   ...
         * }
         *
         * |
         * |
         * |
         * V
         *
         * switch (vrednost){
         *   case v1, v2, v3:
         *       ....
         *       break;
         *   ....
         * }
         *
         * 3. Unapredjeni switch-case: (Enhanced switch case):
         * switch(vrednost){
         *   v1 -> {
         *       ...
         *       break;
         *   }
         *   v2 -> {
         *       ....
         *       break;
         *   }
         *   ...
         *   default -> {
         *       ...
         *   }
         * }
         * Unapredjeni switch-case nam omogucava da
         * imamo promenjive sa istim imenom u
         * razlicitim casevima. Ovo nije moguce
         * u obicnom switch-case-u
         *
         * */

        /*
         * Korisnik unosi neki od karaktera '+', '-', '*', '/'
         * Ispisati poruku "+/-" za karaktere '+' i '-'
         * A poruku "* podeljeno" - za ostala dva
         * */
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        switch (c) {
            case '+':
            case '-':
                System.out.println("+/-");
                break;
            case '*', '/':
                System.out.println("* /");
                break;
        }
    }
}