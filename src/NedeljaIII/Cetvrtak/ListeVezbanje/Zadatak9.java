package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak9 {
    static int vratiProizvodSvihElemenataListe(ArrayList<Integer> lista){
        int proizvod = 1;
        for (Integer element : lista){
            proizvod *= element;
        }
        return proizvod;
    }
    static ArrayList<Integer> vratiListuSvihElemenataUvecanihZaTri(ArrayList<Integer> lista){
        int sum = 3;
        int brojac = 0;
        for (Integer element : lista) {
            lista.set(brojac, element + sum);
            brojac ++;
        }
        return lista;
    }
    static int vratiProizvodSvihELemenataUvecanihZaTri(ArrayList<Integer> lista){
        ArrayList<Integer> lista1 = vratiListuSvihElemenataUvecanihZaTri(lista);
       int proizvod =  vratiProizvodSvihElemenataListe(lista1);
       return proizvod;
    }
    public static void main(String[] args) {
        //9. Napisati funkciju koja vraca proizvod svih elemenata uvecanih za 3 iz ArrayListe.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        int proizvod = vratiProizvodSvihELemenataUvecanihZaTri(lista1);
        System.out.println(proizvod);
    }
}
