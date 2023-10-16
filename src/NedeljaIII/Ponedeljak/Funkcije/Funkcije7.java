package NedeljaIII.Ponedeljak.Funkcije;

import java.util.Scanner;

public class Funkcije7{


    static void ispisatiDuziString(String s1, String s2){
        if (s1.length() >= s2.length()) {
            System.out.println(s1);
        }
        else {
            System.out.println(s2);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         *
         * 1. Napisati funkciju koja prima dva Stringa i ispisuje na
         *    standardni izlaz duzi string. Ako su oba iste duzine ispisati prvi string.
         *
         *
         * */
        ispisatiDuziString("Neki string", "Neki drugi string");

        /*
         * void funkcije su one funkcije koje vracaju NISTA (tj. one koje ne vracaju nista).
         * Dakle, takve funkcije samo nesto RADE a povratne vrednosti nema (nije nam bitna)
         *
         * Npr:
         * 1. Ispisati poruku, Konektovati se na bazu, Zatvoriti fajl ... <- void funkcije
         *
         * 2. Vratiti ..., Izracunati ..., <- funkcije sa povratnom vrednoscu
         *
         * funkcija: "Izracunati zbir elemenata niza" <==> "Napisati funkciju koja vraca zbir elemenata niza".
         * */
    }
}