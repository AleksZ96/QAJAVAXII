package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        // 9. Ispisati proizvod prvih n celih brojeva [1, n].

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int n = sc.nextInt();
        int proizvod = 1;
        for (int i = 1; i <= n; i++) {
            proizvod *= i;


        }
        System.out.println(proizvod);


    }
}
