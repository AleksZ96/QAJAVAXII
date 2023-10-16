package NedeljaII.Petak.Vezbanje;

import java.util.Scanner;

public class Zadatak5 {

    static int vratiProizvod (int nizBrojeva[]){
        int proizvod = 1;
        for (int i = 0; i < nizBrojeva.length; i++) {
            proizvod *= nizBrojeva[i];
        }
        System.out.println(proizvod);
        return proizvod;

    }
    public static void main(String[] args) {
        //5. -//-. Izracunati proizvod elemenata tog niza.
        //Primer: [2, 4] -> 8
        //b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da bude u nizu");
        int n = sc.nextInt();
        int[] nizBrojeva = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            nizBrojeva[i] = sc.nextInt();

        }
        vratiProizvod(nizBrojeva);

    }
}
