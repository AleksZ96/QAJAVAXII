package NedeljaIII.Ponedeljak.Funkcije;

import java.util.Scanner;

public class Funkcije8{

    static int veciOdDva(Scanner sc) {
        //Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b) {
            return a;
        }
        else {
            return b;
        }
    }

    static int vratiJednocifrenBrojDeljivSa3(){
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                return i;
            }
        }
        return  -1; //Funckija ne zna da li ce ikada uslov i % 3 biti ispunjen, pa od nas trazi return naredbu ukoliko nikada nije ispunjen.
        // -1 jer je nesto NEMOGUCE; ja znam da postoji barem jedan jednocifren broj deljiv sa 3 pa znam da ce mi se izvrsiti ono "gornje" return
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         *
         * Napisati funkciju trazi od korisnika da unese dva broja
         * preko standaradnog ulaza i vraca veci broj od ta dva zadata.
         *
         * */
        int povratnaVrednost = veciOdDva(sc);
        System.out.println(povratnaVrednost);

        /*
         * Ideja povratnih vrednosti je da mozemo dalje da ih koristimo. Za
         * neke nove i druge svrhe.
         *
         * Funkcija moze da ima vise return naredbi ali tada moraju da se zadovolje naredni uslovi:
         * - Samo jedna i TACNO JEDNA return naredba se izvrsava pri pozivanju funkcije
         * - SVE return naredbe vracaju isti tip podatka (onaj koji odogovara tipu funkcije)
         * - Svaka funkcija MORA DA GARANTUJE BAREM JEDNU povratnu vrednost.
         *
         * */
        //int x = vratiJednocifrenBrojDeljivSa3();
        //System.out.println(x);
    }
}