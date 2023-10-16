package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak6 {
    static int najveciElementUListi(ArrayList<Integer> lista){
        int max = Integer.MIN_VALUE;
        for (Integer element : lista) {
            if( element > max){
                max = element;
            }
        }
        return max;
    }
    static int najveciELementUTriListe(ArrayList<Integer> lista1, ArrayList<Integer> lista2, ArrayList<Integer> lista3){
        int max1 = najveciElementUListi(lista1);
        int max2 = najveciElementUListi(lista2);
        int max3 = najveciElementUListi(lista3);
        ArrayList<Integer> konacnaLista = new ArrayList<>();
        konacnaLista.add(max1);
        konacnaLista.add(max2);
        konacnaLista.add(max3);
        int MAX = najveciElementUListi(konacnaLista);
        return MAX;
    }
    public static void main(String[] args) {
        //6.* Napisati funkciju koja trazi najveci element medju tri ArrayListe.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista1.add(4);
        lista1.add(5);
        lista1.add(6);
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista1.add(7);
        lista1.add(8);
        lista1.add(9);
      int max =  najveciELementUTriListe(lista1, lista2, lista3);
        System.out.println(max);

    }
}
