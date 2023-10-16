package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak1 {
    static void ispisiSveElementeListe(ArrayList<Integer> lista){
        System.out.println(lista);
    }
    public static void main(String[] args) {
        //1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.
        ArrayList<Integer> listaIntova = new ArrayList<>();
        listaIntova.add(1);
        listaIntova.add(2);
        listaIntova.add(3);
        listaIntova.add(4);

      ispisiSveElementeListe(listaIntova);


    }
}
