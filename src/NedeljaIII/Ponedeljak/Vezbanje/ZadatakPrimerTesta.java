package NedeljaIII.Ponedeljak.Vezbanje;

import java.util.Scanner;

public class ZadatakPrimerTesta {

    /*
    * Napisati funkciju **int[] kreirajNiz** koja prima dva niza integera istih duzina a i b, i vraca novi niz integera iste te duzine.
      Element niza a na poziciji i predstavlja indeks u nizu kojeg treba vratiti na koji treba smestiti broj koji se nalazi na poziciji i u nizu b.
      * a[i] = brojX | rez[brojX] = b[i]; rez[a[i]] = b[i]
      Pretpostaviti da u nizu a nemaju elementi koji ukazuju na indekse van granica niza kojeg treba vratiti kao i da nema ponavljanja elemenata u nizu a.
      Pretpostaviti da su nizovi a i b barem jednoclani nizovi. nemoze da se desi -> [], null

      Npr
      Input: [4, 3, 2, 1, 0], [-10, -20, -30, -40, -50]
      Output: [-50, -40, -30, -20, -10]

      Input: [0], [123]
      Output: [123]

      Input: [0, 2, 4, 1, 3, 5], [1, 2, 3, 4, 5, 6]
      Output: [1, 4, 2, 5, 3, 6]
    *
    *
    *
    *
    * */

    /*
     * 1. Hocu samo da kreiram niz odgovarajuce duzine kojeg necu popunjavati i njega cu vratiti i proveriti da li je sve ok.
     * 2. Hocu samo da popun "prvi element" niza kako treba | hocu samo da prikupim a[0], b[0] i da smestim na odgovarajuce mesto u rezultujucem nizu.
     * 3. Hocu sada da zavrsim zadatak, i uopstim korak 2.
     * */
    static int[] kreirajNiz(int[] a, int[] b) {
        int[] rez = new int[a.length];

        for (int i = 0; i < rez.length; i++) {
            int index = a[i];
            int broj = b[i];
            rez[index] = broj;
            //rez[a[i]] = b[i];
        }

        return rez;
    }

    static void ispisiNiz(int[] a) {
        for (int e : a)
            System.out.print(e + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] testA1 = {4, 3, 2, 1, 0};
        int[] testB1 = {-10, -20, -30, -40, -50};
        int[] rezultat = kreirajNiz(testA1, testB1);
        ispisiNiz(rezultat);
        System.out.println("==============");
        int[] testA2 = {0};
        int[] testB2 = {123};
        rezultat = kreirajNiz(testA2, testB2);
        ispisiNiz(rezultat);
        System.out.println("==============");
        int[] testA3 = {0, 2, 4, 1, 3, 5};
        int[] testB3 = {1, 2, 3, 4, 5, 6};
        rezultat = kreirajNiz(testA3, testB3);
        ispisiNiz(rezultat);
    }
}