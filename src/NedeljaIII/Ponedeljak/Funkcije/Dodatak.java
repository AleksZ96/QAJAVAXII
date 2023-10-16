package NedeljaIII.Ponedeljak.Funkcije;

import java.util.Scanner;

public class Dodatak{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * Metode nad Stringovi
         *
         * STRINGOVI SU IMUTABILNI OBJEKTI (ne mogu se menjati!)
         *
         * */

        String s1 = "abcd";
        int x = s1.length();

        /*
         *
         * .length() - vraca duzinu string
         *
         * */

        /*
         *
         * .charAt(int index) - vraca karakter na prosledjenom indeksu
         *
         * */

        /*
         *
         * .toCharArray() - vraca String pretvoren u niz karaktera char[]
         *
         * */

        /*
         *
         * .toLowerCase() - vraca String sa istim karakterima kao i string nad kojim se poziva
         *                   osim sto su sva velika slova transformisana u mala
         *
         * .toUpperCase() - -//- sva mala slova transformisana u velika
         *
         * */

        /*
         *
         * s1.equals(s2) - vraca odgovor na pitanje da li su s1 i s2 isti karakter-po-karakter
         * s1.equalsIgnoreCase(s2) - vraca odgovor na pitanje da li su s1 i s2 isti karakter-po-karakter zanemarujuci velika od malih slova
         *
         * "aBc".equals("abc") -> false
         * "aBc".equalsIgnoreCase("abc") -> true
         *
         * */

        s1 = "abcdefg"; // u pozadini ovo je niz karaktera ['a', 'b', 'c', 'd', 'e', 'f', 'g']
        //s1.charAt(0) -> a, s1.charAt(3) -> d
        //Napisati funkciju koja odgovara na pitanje da li dva proslednje string pocinju sa istim slovom.





    }
}
