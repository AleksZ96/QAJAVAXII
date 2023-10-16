package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Vezbanje {

    static void ispisiObrnuto(int[] nizBrojeva){
        for (int i = nizBrojeva.length - 1; i >= 0 ; i--) {
            System.out.println(nizBrojeva[i]);

        }
    }

    static int[] obrniNiz(int[] nizBrojeva){
        int[] obrnutiNiz = new int [nizBrojeva.length];
        int brojac = 0;
        for (int i = nizBrojeva.length - 1; i >= 0 ; i--){
            obrnutiNiz[brojac] = nizBrojeva[i];
            brojac ++;
        }
        return obrnutiNiz;
    }

    public static void main(String[] args) {

        //16. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
/*
       String konacanString = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                konacanString += (i * j) + "\t";
            }
            konacanString += "\n";

        }
        System.out.println(konacanString);

 */
        //1. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
        //Primer: [4, 2, 3, 5] -> 5 3 2 4
        //b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);
        System.out.println("koliko brojeva zelite da unesete");
        int n = sc.nextInt();
        int[] nizBrojeva = new int[n];

        for (int i = 0; i < n ; i++) {
            System.out.println("Unesite broj");
            nizBrojeva[i] = sc.nextInt();
        }
        nizBrojeva = obrniNiz(nizBrojeva);
        for (int i = 0; i < n ; i++) {
            System.out.println(nizBrojeva[i]);
        }

        //ispisiObrnuto(nizBrojeva);









        //KRAJ VEZBANJA


    }
}
