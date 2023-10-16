package NedeljaIII.Ponedeljak.Funkcije;

import java.util.Scanner;

public class Funkcije10{


    static int saberi(int x, int y) {
        return x + y;
    }

    static double saberi(double x, double y) {
        return x + y;
    }

    static int saberi(int x, int y, int z) {
        return x + y + z;
    }

    static String saberi(String a, String b) {
        return a + b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         *
         * Napisati funkciju koja sabira dva cela broja. (i vraca njihovu vrednost)
         * Napisati funkciju koja sabira dva realna broja.
         *
         * Method overloading - osnazivanje metoda
         *
         * Dozvoljeno mi je:
         * Dozvolje je da imamo vise funkcija sa ISTIM imenom ako se oni razlikuju po barem jednom od:
         * -Imaju drugacije argumente (drugaciji tip argumenata ili drugaciji broj argumenata)
         * -Imaju drugaciju povratnu vrednost
         *
         * */
        System.out.println(saberi("Zdravo ", " svete"));
        System.out.println(saberi(2, 3)); // zna da treba da iskoristi "int saberi"
        System.out.println(saberi(2.5, 3.5));// zna da treba da iskoristi "double saberi"
        System.out.println(saberi(2.5, 3.0));// zna da treba da iskoristi "double saberi"
        System.out.println(saberi(2, 3, 4)); // zna da treba da iskoristi onu sa 3 argumenta jer smo joj prosledili 3 argumenta

    }
}
