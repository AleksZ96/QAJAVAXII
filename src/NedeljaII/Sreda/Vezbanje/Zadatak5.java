package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        //5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara.


        Scanner sc = new Scanner(System.in);
        String cetvorocifrenBroj;
        while (true) {
            System.out.println("Unesite cetvorocifreni broj");
            cetvorocifrenBroj = sc.next();
            if (cetvorocifrenBroj.length() != 4) {
                continue;
            }
            String prviBroj = cetvorocifrenBroj.substring(0, 1);
            String drugiBroj = cetvorocifrenBroj.substring(1, 2);
            String treciBroj = cetvorocifrenBroj.substring(2, 3);
            String cetvrtiBroj = cetvorocifrenBroj.substring(3);

            int prviBrojKaoInt = Integer.parseInt(prviBroj);
            int drugiBrojKaoInt = Integer.parseInt(drugiBroj);
            int treciBrojKaoInt = Integer.parseInt(treciBroj);
            int cetvrtiBrojKaoInt = Integer.parseInt(cetvrtiBroj);

            System.out.println(((prviBrojKaoInt * drugiBrojKaoInt) - (treciBrojKaoInt + cetvrtiBrojKaoInt)));
        }
           }


    }

