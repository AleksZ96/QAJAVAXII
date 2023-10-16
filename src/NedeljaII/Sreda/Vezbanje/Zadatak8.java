package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {


        // 8. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan broj");
        int n = sc.nextInt();
        for (int i = -14; i <= (n * 2); i++) {
            System.out.println(i);

        }



    }
}
