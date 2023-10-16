package NedeljaIII.Cetvrtak.Domaci;

import java.util.ArrayList;

public class Zadatak1 {
    static ArrayList<Integer> vratiTridesetParnihBrojeva(){
        ArrayList<Integer> listaTridesetParnihBrojeva = new ArrayList<Integer>();

        for (int i = 2; i < 61 ; i += 2) {
            listaTridesetParnihBrojeva.add(i);

        }
        return listaTridesetParnihBrojeva;
    }
    public static void main(String[] args) {

        //1.Napraviti funkciju koja kreira i vraca listu od 30 parnih brojeva.
        ArrayList<Integer> lista = vratiTridesetParnihBrojeva();
        for (Integer integer : lista) {
            System.out.println(integer);
        }
    }
}
