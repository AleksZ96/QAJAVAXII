package NedeljaII.Petak.Domaci3;

import java.util.Scanner;

public class Zadatak2 {
    static void pronadjiBrojUNizu(int[] nizBrojeva, int brojKojiLociramo){
        for (int i = 0; i < nizBrojeva.length; i++) {
            if( nizBrojeva[i] != brojKojiLociramo){
                System.out.println("Pogresan element!");
            }
            else {
                System.out.println("Element" + " " + brojKojiLociramo + " " + "se nalazi u nizu");
                return;
            }
        }
    }


    public static void main(String[] args) {
        /* Zadatak 2:
Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog
niza. Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan
element, cim naidjemo na zadati element, ispisati poruku da je pronadjen i zavrsiti funkciju
(Cim naidje na taj element, ne treba da ga trazi dalje).

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz celih brojeva");
        int[] nizBrojeva = new int[5];
        for (int i = 0; i < nizBrojeva.length; i++) {
            nizBrojeva[i] = sc.nextInt();
        }
        System.out.println("Koji broj zelite da locirate unutar niza?");
        int brojKojiLociramo = sc.nextInt();
        pronadjiBrojUNizu(nizBrojeva, brojKojiLociramo);




    }
}
