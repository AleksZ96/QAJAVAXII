package NedeljaII.Petak.Vezbanje;

import java.util.Scanner;

public class Zadatak4 {

    static void ispisiSvakiTreciElementUnazad (int nizBrojeva[]){
        for (int i = nizBrojeva.length - 1; i >= 0; i -= 3) {
            System.out.println(nizBrojeva[i]);
        }
    }

    public static void main(String[] args) {
        //4. -//-. Ispisati svaki treci element u obrnutom redosledu.
        //Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        //b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da bude u nizu");
        int n = sc.nextInt();
        int[] nizBrojeva = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            nizBrojeva[i] = sc.nextInt();
        }
        ispisiSvakiTreciElementUnazad(nizBrojeva);












    }
}
