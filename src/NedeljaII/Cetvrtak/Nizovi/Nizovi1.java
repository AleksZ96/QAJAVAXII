package nedeljaII.cetvrtak.nizovi;

import java.util.Scanner;

public class Nizovi1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         *
         * Nizovi
         *
         * Nizovi su skup podataka istog tipa koji stoje u memoriji jedni do drugih.
         *
         *
         * */

        /*
         * Deklaracija nizova:
         * <tip_promenjive>[] <identifikator>;
         *
         * */

        //Deklaracija nizova integera, doublova, booleana, charova
        int[] nizIntova;
        double[] x;
        boolean[] nizBoooleana; //u praksi jako retko
        char[] nizKaraktera;
        String[] nizStringova;

        /*
         * Incijalizacija niza
         * 1. Eksplicitno:
         * <identifikator> = new int[]{<vrednost1>, <vrednost2>, ..., <vrednostN>};
         * */
        nizIntova = new int[]{1, 2, 3, 4, 5};
        x = new double[]{3.14, -2.71, 9.81};
        nizBoooleana = new boolean[]{true, false, false, true};
        nizKaraktera = new char[]{'z', 'd', 'r', 'a', 'v', 'o'};

        /*
         * 2. Implicitno:
         * <identifikator> = new int[<duzinu_niz>];
         * */
        int[] y;
        y = new int[5]; //Kreiram niz integera duzine 5.

        /*
         *
         * Deklarizacija sa inicijalizacijom
         *
         * */
        int[] nesto = {1, 2, 3, 4}; //eksplicitna inicijalizacija
        int[] nesto2 = new int[10]; //implictitna inicijalizacija


        /*
         * Ako implicitno zadamo niz, on ce se popuniti sa svojim podrazumevanim vrednostima
         * int -> 0
         * double -> 0.0
         * char -> '\u0000'
         * boolean -> false
         * */



    }
}
