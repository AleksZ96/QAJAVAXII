package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak7 {
    static ArrayList<Integer> vratiNadovezaneDveListe2(ArrayList<Integer> lista1, ArrayList<Integer> lista2 ) {
        lista1.addAll(lista2);
        return lista1 ;
    }
    static ArrayList<Integer> vratiNadovezaneDveListe(ArrayList<Integer> lista1, ArrayList<Integer> lista2 ){
        ArrayList<Integer> spojenaLista = new ArrayList<>();
        spojenaLista.addAll(lista1);
        spojenaLista.addAll(lista2);
        System.out.println(spojenaLista);
        return spojenaLista;

    }
    public static void main(String[] args) {
        //7. Napisati funkciju koja prima dve ArrayListe i vraca listu dobijenu nadovezivanjem druge liste na prvu.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(4);
        lista2.add(5);
        lista2.add(6);
        vratiNadovezaneDveListe(lista1, lista2);

        System.out.println(lista1);
        System.out.println(lista2);

        vratiNadovezaneDveListe2(lista1, lista2);
        System.out.println(lista1);
        System.out.println(lista2);
    }
}
