package NedeljaII.Petak.Vezbanje;

import java.util.Scanner;

public class Zadatak2 {

    static void ispisiSvakiDrugiElement(int[] nizBrojeva){

        for (int i = 0; i < nizBrojeva.length; i += 2) {

            System.out.println(nizBrojeva[i]);

        }

    }
    public static void main(String[] args) {
       // 2. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
      //  Primer: [1, 2, 3, 4, 5] -> 1 3 5
       // b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da bude u nizu");
        int n = sc.nextInt();
        int[] nizBrojeva = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            nizBrojeva[i] = sc.nextInt();

        }
        ispisiSvakiDrugiElement(nizBrojeva);




    }
}
