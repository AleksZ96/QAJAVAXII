package nedeljaII.petak.funkcije;

import java.util.Scanner;

public class Funkcije3{

    //static - jedini modifikator
    //int - tip povratne vrednosti

    static int f(int x) {
        int povratnaVrednost = 2 * x;
        return povratnaVrednost;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * Definisanje funkcija:
         * <modifikatori> <tip_povratne_vrednosti> <ime_funkcije>(<tip_argumenta1> <identifikator_argumenta1>, itd){
         *   //kod funkcije
         *   return <vrednost_koju_funkcija_vraca>;
         * }
         *
         * - Definisanje funkcija se radi unutar KLASE, a ne unutar drugih funkcija!
         * - Svaka funkcija mora da ima povratnu vrednost ciji tip odgovara tipu funkcije
         *
         * Funkcija ==sinonim== Metoda
         *
         * Funkcija moze da ima samo JEDNU povratnu vrednost.
         *
         * Funkcije nisu gradjani prve klase <- ovo znaci da ne mozemo da kreiramo promenjivu koja je funkcija.
         *
         * Funkcije prate istu konvenciju imenovanja kao i promenjive : camelCase sa prvim malim slovom
         * */

        //Zadatak 1: Napisati funkciju koja duplira ceo broj.
        /*
         * f(x) = 2 * x
         * */
        int zelimDaMeDupliras = 3;
        int dupliran = f(zelimDaMeDupliras); //poziv funkcije
        System.out.println(dupliran);

        int duplirajOpet = f(10); //poziv funkcije
        System.out.println(duplirajOpet);

        /*
         * Funkcije pozivamo
         * <ime_funkcije>(<argument1>, itd);
         * */
    }
}
