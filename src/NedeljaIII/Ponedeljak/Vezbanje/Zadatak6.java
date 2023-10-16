package NedeljaIII.Ponedeljak.Vezbanje;

import java.util.Scanner;

public class Zadatak6 {

    //Napisati funkciju koja prima nenegativan ceo broj n, trazi od korisnika da unese n double brojeva
    // i kreira niz od tih zadatih brojeva popunjen njima redom

    static double[] kreirajNiz(int n) {
        Scanner sc = new Scanner(System.in);
        double[] niz = new double[n];
        for (int i = 0; i < n; i++)
            niz[i] = sc.nextDouble();
        return niz;
    }
}