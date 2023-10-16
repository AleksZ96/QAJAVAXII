package NedeljaII.Sreda.Domaci;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

       // Napraviti program gde cete uneti neki broj ponavljanja i tekst koji ce se toliko puta ispisati.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite zeljeni tekst");
        String tekst = sc.nextLine();
        System.out.println("Unesite broj ponavljanja");
        int n = sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println(tekst);
        }
    }
}
