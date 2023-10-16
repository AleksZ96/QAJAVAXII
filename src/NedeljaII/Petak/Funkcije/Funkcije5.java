package nedeljaII.petak.funkcije;

import java.util.Scanner;

public class Funkcije5{
    /*
     * Zadatak 3:
     * - Napisati funkciju koja sabira dva double broja
     * - Napisati funkciju koja oduzima dva double broja
     * - Napisati funkciju koja nadovezuje dva Stringa
     * - Napisati funkciju koja vraca duzinu prosledjenog stringa uvecanu za 3
     * - Napisati funkciju koja vraca duzinu prsledjenog stringa uvecanu za neki prosledjen broj
     * */

    static double sabiranje(double a, double b) {
        return a + b;
    }

    static double oduzimanje(double a, double b) {
        return a - b;
    }

    static String nadovezivanjeDvaString(String a, String b){
        return a + b;
    }

    static int duzinaUvecanaZaTri(String a) {
        return a.length() + 3;
    }

    //- Napisati funkciju koja vraca duzinu prosledjenog stringa uvecanu za neki prosledjen broj
    static int stringUvecanZaNekiBroj(String s, int k) {
        return s.length() + k;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*int a = 2;
        int b = 3;
        System.out.println(sabiranje(a, b));
        System.out.println(oduzimanje(a, b)); //Bitan je redosled prosledjivanja argumenta
        System.out.println(oduzimanje(b, a)); // Ovo nije isto kao i a, b */

        int x = 2;
        int y = 3;
        System.out.println(sabiranje(x, y));
        System.out.println(oduzimanje(x, y)); //Bitan je redosled prosledjivanja argumenta
        System.out.println(oduzimanje(y, x)); // Ovo nije isto kao i a, b

        String s1 = "Zdravo ";
        String s2 = "svete!";
        String s3 = nadovezivanjeDvaString(s1, s2);
        System.out.println(s3);
        System.out.println(duzinaUvecanaZaTri(s2));
        System.out.println(stringUvecanZaNekiBroj("abc", 4));


    }
}