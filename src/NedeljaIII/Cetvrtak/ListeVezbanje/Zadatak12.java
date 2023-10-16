package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak12 {
    static String vratiNajduziString(ArrayList<String> lista){
        String najduziString = lista.get(0);
        for(String element : lista){

            if(element.length() > najduziString.length()){
                najduziString = element;
            }
        }
        return najduziString;
    }
    public static void main(String[] args) {
        //12. Napisati funkciju koja vraca najduzi String iz ArrayListe Stringova.
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Maja");
        lista1.add("Marija");
        lista1.add("Aleksandra");
        String najduziString = vratiNajduziString(lista1);
        System.out.println(najduziString);
    }
}
