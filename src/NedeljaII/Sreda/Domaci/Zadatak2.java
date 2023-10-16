package NedeljaII.Sreda.Domaci;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
       // Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1).
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int n = sc.nextInt();
        int proizvod = 1;
        for (int i = 1; i <=n ; i++) {
            proizvod *= i;
        }
        System.out.println("Faktorijal ovog broja je :" + " " +proizvod);
    }
}
