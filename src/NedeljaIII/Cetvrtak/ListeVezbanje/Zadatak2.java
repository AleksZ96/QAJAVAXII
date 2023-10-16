package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak2 {
    static ArrayList<Integer> vratiDupliraneElemente(ArrayList<Integer> lista){

        for (int i = 0; i < lista.size(); i++) {
            int broj = lista.get(i) * 2;
            lista.set(i, broj);
        }
        return lista;
    }
    public static void main(String[] args) {
        //2. Napisati funkciju koja prima ArrayListu integera i vraca ArrayListu ciji su elementi duplirani u odnosu na
        // 	proslednjenju ArrayListu.
        ArrayList<Integer> listaIntova = new ArrayList<>();
        listaIntova.add(1);
        listaIntova.add(2);
        listaIntova.add(3);
        listaIntova.add(4);
        ArrayList<Integer> izmenjenaLista =  vratiDupliraneElemente(listaIntova);
        System.out.println(izmenjenaLista);

    }
}
