package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //4. Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka, a poruku "Suprotnog znaka",
        // ako nisu istog znaka.


        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(true) {
            System.out.println("Unesite ceo broj");
            a = sc.nextInt();
            b = sc.nextInt();

            if ((a >= 0 && b >= 0) || (a < 0 && b < 0)){
                System.out.println("Istog znaka");
            } else{
                System.out.println("Suprotnog znaka");
            }
        }


    }
}
