package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak13 {
    static void vratiSumuPozitivnihBrojevaDoT(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int t = 1; t < n; t++) {

            sum += t;
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        //13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t, koji je strogo manji od njega (dakle t < n),
        // sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int t = 1; t < n; t++) {

            sum += t;
            System.out.println(sum);
        }

         */
vratiSumuPozitivnihBrojevaDoT();
    }
}
