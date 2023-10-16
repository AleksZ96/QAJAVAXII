package NedeljaIII.Cetvrtak.Liste;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadaci {


    /*
     *
     * Napisati funkciju koja omogucava korisniku da unosi brojeve
     * sve dok ne unese 0 (intovi)
     * a) Smestiti te brojeve u niz
     * b) Smestiti te brojeve u listu
     *
     * */

    static int[] kreirajNiz() {
        Scanner sc = new Scanner(System.in);

        int finalnaDuzinaNiza = 0;
        int trenutnaDuzinaNiza = 10;

        int[] niz = new int[trenutnaDuzinaNiza];

        int n = sc.nextInt();
        while (n != 0) {
            niz[finalnaDuzinaNiza] = n;
            finalnaDuzinaNiza++;

            if (finalnaDuzinaNiza == trenutnaDuzinaNiza) {
                trenutnaDuzinaNiza *= 2;
                int[] noviNiz = new int[trenutnaDuzinaNiza];
                for (int i = 0; i < niz.length; i++) {
                    noviNiz[i] = niz[i];
                }
                niz = new int[trenutnaDuzinaNiza];
                for (int i = 0; i < niz.length; i++) {
                    niz[i] = noviNiz[i];
                }
            }

            n = sc.nextInt();
        }

        int[] povratniNiz = new int[finalnaDuzinaNiza];
        for (int i = 0; i < finalnaDuzinaNiza; i++) {
            povratniNiz[i] = niz[i];
        }

        return povratniNiz;
    }


    static ArrayList<Integer> kreirajListu(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        while (n != 0) {
            al.add(n);
            n = sc.nextInt();
        }
        return al;
    }

    //Kreirati funkciju koja izbacuje sva pojavljivanja elementa n iz liste
    //{a, b, c, n, k, l, n, q}, n -> {a, b, c, k, l, q}
    static void izbaciUljeza(ArrayList<Integer> al, int n) {
        //Za domaci! <- potrebna je samo jedna for-i petlja
    }


    public static void main(String[] args) {
        int[] niz = kreirajNiz();
        System.out.println(Arrays.toString(niz));
    }






}
