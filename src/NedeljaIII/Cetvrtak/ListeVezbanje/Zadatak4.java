package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak4 {
    static int vratiNajveciElement(ArrayList<Integer> lista){
      int max = lista.get(0);
      for (Integer element : lista){
          if(element > max){
              max = element;
          }
      }
      return max;
    }
    public static void main(String[] args) {
        //4. Napisati funkciju koja vraca najveci element iz ArrayListe.
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        int max = vratiNajveciElement(lista);
        System.out.println(max);
    }
}
