package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak8 {
static int zbirSvihElemenataListe(ArrayList<Integer> lista){
    int sum = 0;
    for (Integer element : lista) {
        sum += element;
    }
    return sum;
}
    public static void main(String[] args) {
        //8. Napisati funkciju koja vraca zbir svih elemenata iz ArrayListe.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        int sum = zbirSvihElemenataListe(lista1);
        System.out.println(sum);
    }
}
