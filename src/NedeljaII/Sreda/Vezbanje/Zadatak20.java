package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak20 {
    static double izracunatiProsekUnetihBrojeva(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da unesete");
        int a = sc.nextInt();
        double sum = 0;
        for (double i = 0; i < a; i++) {
            System.out.println("Unesite brojeve");
            double b = sc.nextDouble();
            sum += b;

        }
        double prosek = sum / a;
        System.out.println(prosek);
        return prosek;
    }
    public static void main(String[] args) {
        //20. Uneti pozitivan ceo broj n. Zatim izracunati prosek unetih narednih n brojeva (double).
        izracunatiProsekUnetihBrojeva();
    }
}
