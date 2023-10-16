package NedeljaII.Petak.Vezbanje;

import java.util.Scanner;

public class Zadatak20 {

    static int[] kreirajNizOdUnetihBrojevaDoNule(){
        Scanner sc = new Scanner(System.in);

        int brojac = 0;
        int[] y = new int []{};
            System.out.println("Unesite broj");
            int poslednjiBroj = -1;
          while(true) {
              poslednjiBroj = sc.nextInt();
              if(poslednjiBroj == 0)
                  break;
              y[brojac] = poslednjiBroj;
              brojac++;
        }
            return y;
    }

    static int[] kreirajNizBrojeva() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Unesite koliko brojeva zelite da unesete");
            int x = sc.nextInt();
        int[] y = new int[x];
        for (int i = 0; i < y.length; i++) {
            System.out.println("Unesite broj");
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }

        return y;
    }
    public static void main(String[] args) {
        //20.** Napisati funkciju koja kreira niz od brojeva koji korisnik unosi sa konzole sve dok ne unese 0.
        //Npr: 1 2 3 3 4 5 0 -> [1, 2, 3, 4, 4, 5]

        kreirajNizOdUnetihBrojevaDoNule();
    }

    }


