package NedeljaIII.Ponedeljak.Vezbanje;

import java.util.Scanner;

public class Zadatak1 {

    // Napisati funkciju koja od korisnika prima dva double broja i vraca povrsinu pravougaonika
    // cije su duzine stranica jednake tim unetim brojevima
    // (stranica a = prvi broj; stranica b = drugi broj)

    static double porvsina(Scanner sc) {
        double a = sc.nextInt();
        double b = sc.nextInt();
        return a * b;
    }
}