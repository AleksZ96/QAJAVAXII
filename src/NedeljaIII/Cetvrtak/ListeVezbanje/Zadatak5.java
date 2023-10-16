package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Zadatak5 {
    static ArrayList<Integer> obrisiDuplikate(ArrayList<Integer> lista){
        ArrayList<Integer> listaBezDuplikata = new ArrayList<>();
        for(Integer element : lista){
            if(!listaBezDuplikata.contains(element)){
                listaBezDuplikata.add(element);
            }
        }
        return listaBezDuplikata;
    }
    static int vratiDrugiNajmanjiElement(ArrayList<Integer> lista){
        lista = obrisiDuplikate(lista);
        Collections.sort(lista);

       return lista.get(1);
    }
    public static void main(String[] args) {
        //5. Napisati funkciju koja vraca drugi najmanji element iz ArrayListe. (Pretpostaviti da ce prosledjena ArrayLista uvek da ima barem 3
        //	elemenata).
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        int min = vratiDrugiNajmanjiElement(lista);
        System.out.println(min);
    }
}
