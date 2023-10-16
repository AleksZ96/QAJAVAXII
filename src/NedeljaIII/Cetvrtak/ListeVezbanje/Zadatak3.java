package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak3 {
    static boolean daLiSuListeIste(ArrayList <Integer> lista1, ArrayList<Integer> lista2 ){

    boolean daLiSuIste =  lista1.equals(lista2);
        return daLiSuIste;

    }
    public static void main(String[] args) {
        //3. Napisati funkciju koja proverava da li su dve double ArrayListe potpuno iste.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
     boolean daLiSu = daLiSuListeIste(lista1, lista2);
        System.out.println(daLiSu);
    }
}
