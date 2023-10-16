package NedeljaIII.Ponedeljak.Funkcije;

import java.util.Scanner;

public class Funkcije11{

    static int proizvod(int x, int y){
        return x * y;
    }

    static int zbir(int x, int y) {
        return x + y;
    }

    static int razlika(int x, int y) {
        return x - y;
    }

    static int cudnaRazlika(int x1, int x2, int x3, int x4) {
        //return proizvod(x1, x2) - zbir(x3, x4);
        return razlika(proizvod(x1, x2), zbir(x3, x4));
    }



    static int zadatak5(int x) {
        // x = abcd
        /*
         * Kako izvuci cifru d? -> x % 10
         * Kako izvuci cifru c? -> x % 100 -> cd / 10 -> c
         *                      -> x / 10 -> abc % 10 -> c
         * Kako izvuci cifru b -> x / 10 -> abc / 10 -> ab % 10 -> b
         * Kako izvuci cifru a -> x / 10 -> abc / 10 -> ab / 10 -> a
         *
         *
         *
         * */
        int d = x % 10;
        x /= 10; //odsecam cifru d -> x = abc
        int c = x % 10;
        x /= 10; //odsecam cifru c -> x = ab
        int b = x % 10; // b
        int a = x / 10;// a

        return cudnaRazlika(a, b, c, d);
    }



    /* Ekvivalentno resenje
    *
    *    int prvaCifra = n / 1000;
        int drugaCifra = (n / 100) % (prvaCifra * 10);
        int trecaCifra = (n / 10) % (prvaCifra * 100 + drugaCifra * 10);
        int cetvrtaCifra = n % (prvaCifra * 1000 + drugaCifra * 100 + trecaCifra * 10);
        int rezultat = (prvaCifra * drugaCifra) - (trecaCifra + cetvrtaCifra);
    *
    *
    * */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         *
         * Napisati funkciju koja prima 4 broja
         * i vraca razliku proizvoda prva dva broja od zbira druga dva broja.
         * x1, x2, x3, x4
         *  (x1 * x2) - (x3 + x4)
         *
         * Kompozicija funkcija - mozemo da pozivamo jednu funkciju iz neke druge
         * f (x)
         * g (x)
         * f(g(x))
         *
         *
         * */
        int rezultat = cudnaRazlika(5, 4, 5, 5);
        System.out.println(rezultat);

        /*
         *
         * Nadovezivanje na pastebin 5*
         * Napisati funkciju koja prima jedan cetvorocifreni pozitivan broj i vraca
         * razliku proizvoda njegovih prvih dveju cifara od zbira drugih dveju cifara.
         *
         * 1234 -> (1*2) - (3+4) = -5
         *
         * 1. Resavamo laksu varijanut : imamo cifre (ovo sto smo vec odradili)
         *
         *
         *
         * */
    }
}