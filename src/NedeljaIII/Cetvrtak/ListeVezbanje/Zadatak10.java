package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak10 {

    static ArrayList<Integer> vratiNeparneBrojeve(ArrayList<Integer> lista){
        ArrayList<Integer> listaNeparnihBrojeva = new ArrayList<>();
        for (Integer element : lista){
            if( element % 2 != 0){
                listaNeparnihBrojeva.add(element);
            }
        }
        return listaNeparnihBrojeva;
    }
    public static void main(String[] args) {
        //10. Napisati funkciju koja vraca sve neparne brojeve iz ArrayListe.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        ArrayList<Integer> neparniBrojevi = vratiNeparneBrojeve(lista1);
        System.out.println(neparniBrojevi);
    }
}
