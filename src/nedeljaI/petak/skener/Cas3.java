package nedeljaI.petak.skener;

import java.util.Scanner;

public class Cas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prvo unesite neki broj, a zatim neku poruku");
        double x = sc.nextDouble(); //[3.14, '\n']
        sc.nextLine();
        String poruka = sc.nextLine();
        System.out.println("Broj = " + x);

        System.out.println("Poruka = " + poruka);

    }
}