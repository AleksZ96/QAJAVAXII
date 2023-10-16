package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak19 {
    static double izracunatiProizvodUnetihBrojeva(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da unesete");
        int a = sc.nextInt();
        double proizvod = 1;
        for (double i = 0; i < a; i++) {
            System.out.println("Unesite brojeve");
            double b = sc.nextDouble();
            proizvod *= b;


        }
        System.out.println(proizvod);
        return proizvod;
    }
    public static void main(String[] args) {
        //19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).
        izracunatiProizvodUnetihBrojeva();
    }
}
