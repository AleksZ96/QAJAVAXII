package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3. Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b.


        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(true) {
            System.out.println("Unesite dva cela broja");
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("a + b =" + (a + b));
            System.out.println("a - b =" + (a - b));
            System.out.println("a * b =" + (a * b));
            System.out.println("a / b =" + (a / b));
        }


    }
}
