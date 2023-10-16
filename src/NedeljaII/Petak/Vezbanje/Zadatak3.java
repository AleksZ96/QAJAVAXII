package NedeljaII.Petak.Vezbanje;

import java.util.Scanner;

public class Zadatak3 {

    static int vratiSumu(int[] nizBrojeva){
        int sum = 0;
        for (int i = 0; i < nizBrojeva.length; i++) {
            sum += nizBrojeva[i];

        }
        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
       // 3. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
       // Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
      //  b) Napraviti funkciju koja vraca sumu prosledjenog niza.

        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva zelite da bude u nizu");
        int n = sc.nextInt();
        int[] nizBrojeva = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            nizBrojeva[i] = sc.nextInt();

        }
        vratiSumu(nizBrojeva);

    }
}
