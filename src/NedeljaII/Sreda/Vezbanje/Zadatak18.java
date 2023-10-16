package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak18 {

    static double izracunatiSumuUnetihBrojeva(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da unesete");
        int a = sc.nextInt();
        double sum = 0;
        for (double i = 0; i < a; i++) {
            System.out.println("Unesite brojeve");
            double b = sc.nextDouble();
            sum += b;


        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        //18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).
        izracunatiSumuUnetihBrojeva();
    }
}
