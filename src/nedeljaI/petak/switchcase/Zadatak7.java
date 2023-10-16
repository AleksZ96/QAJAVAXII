package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        /*1. Olimpijske medalje
Korisnik unosi imena 3 drzava koje su se takmicile na olimpijskim igrama
u Tokiju 2021. Nakon toga unosi redom po 3 cela broja za svaku (ukupno 9 brojeva)
koje redom oznacavaju broj osvojenih zlatnih medalja,
broj osvojenih srebrnih medalja, broj osvojenih bronzanih medalja.
Na standardni izlaz ispisati ime pobednicke drzave. Pobednicka drzava je ona
koja ima vise zlatnih medalja u odnosu na ostale dve. Ukoliko neke 2 drzave
imaju isti broj osvojenih zlatnih medalja, onda je pobedila ona koja ima najvise
srebrnih medalja. Ukoliko dve drzave takodje imaju isti broj osvojenih
srebrnih medalja, onda se gledaju bronzane, a ukoliko imaju isti broj svih medalja
ispisati poruku "Nereseno".
------------------------------------------------------------------------------------
Primer 1:
Input:
"Engleska" "Srbija" "Nemacka"
3 4 1
5 1 1
2 2 2
Output:
"Srbija"

Primer 2:
Input:
"Japan" "USA" "Francuska"
1 2 3
1 2 1
0 0 0
Output:
"Japan"

Primer 3:
Input:
"Belgija" "Italija" "Egipat"
1 2 3
1 2 3
1 2 2
Output:
"Nereseno"
    }
}
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite imena 3 drzava");
        String drzava1 = sc.next();
        String drzava2 = sc.next();
        String drzava3 = sc.next();

        System.out.println("Unesite broj zlatnih medalja za svaku drzavu");
        int zlatnaMedalja1 = sc.nextInt();
        int zlatnaMedalja2 = sc.nextInt();
        int zlatnaMedalja3 = sc.nextInt();

        System.out.println("Unesite broj srebrnih medalja za svaku drzavu");
        int srebrnaMedalja1 = sc.nextInt();
        int srebrnaMedalja2 = sc.nextInt();
        int srebrnaMedalja3 = sc.nextInt();

        System.out.println("Unesite broj bronzanih medalja za svaku drzavu");
        int bronzanaMedalja1 = sc.nextInt();
        int bronzanaMedalja2 = sc.nextInt();
        int bronzanaMedalja3 = sc.nextInt();

        if (zlatnaMedalja1 > zlatnaMedalja2 && zlatnaMedalja1 > zlatnaMedalja3){
            System.out.println("Pobednik je:" + " " + drzava1);
        }
        else if (zlatnaMedalja2 > zlatnaMedalja1 && zlatnaMedalja2 > zlatnaMedalja3) {
            System.out.println("Pobednik je:" + " " + drzava2);
        }
        else if (zlatnaMedalja3 > zlatnaMedalja1 && zlatnaMedalja3 > zlatnaMedalja2) {
            System.out.println("Pobednik je:" + " " + drzava3);
        }

        if (srebrnaMedalja1 > srebrnaMedalja2 && srebrnaMedalja1 > srebrnaMedalja3){
            System.out.println("Pobednik je:" + " " + drzava1);
        }
        else if (srebrnaMedalja2 > srebrnaMedalja1 && srebrnaMedalja2 > srebrnaMedalja3){
            System.out.println("Pobednik je:" + " " + drzava2);
        }
        else if (srebrnaMedalja3 > srebrnaMedalja1 && srebrnaMedalja3 > srebrnaMedalja2){
            System.out.println("Pobednik je:" + " " + drzava3);
        }

        if (bronzanaMedalja1 > bronzanaMedalja2 && bronzanaMedalja1 > bronzanaMedalja3) {
            System.out.println("Pobednik je:" + " " + drzava1);
        }
        else if (bronzanaMedalja2 > bronzanaMedalja1 && bronzanaMedalja2 > bronzanaMedalja3) {
            System.out.println("Pobednik je:" + " " + drzava2);
        }
        else if (bronzanaMedalja3 > bronzanaMedalja1 && bronzanaMedalja3 > bronzanaMedalja2) {
            System.out.println("Pobednik je:" + " " + drzava3);
        }
        else {
            System.out.println("Nereseno je");
        }


        }
}
