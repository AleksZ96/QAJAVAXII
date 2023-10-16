package NedeljaII.Petak.Vezbanje;

import java.util.Scanner;

public class Zadatak6 {
    static int vratiProizvod(int a, int b, int c){
        int proizvod = a * b * c;
        System.out.println(proizvod);
        return proizvod;
    }


    public static void main(String[] args) {
        //6. Napisati funkciju koja racuna proizvod 3 broja.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tri broja");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        vratiProizvod(2, 3, 4);



    }
}
