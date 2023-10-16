package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {


        // 7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite negativan broj");
        int n = sc.nextInt();
        for (int i = n; i <= 0 ; i++) {
            System.out.println(i);
        }


    }
}
