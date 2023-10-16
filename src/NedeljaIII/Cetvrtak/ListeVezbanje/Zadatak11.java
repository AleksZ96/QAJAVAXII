package NedeljaIII.Cetvrtak.ListeVezbanje;

import java.util.ArrayList;

public class Zadatak11 {
    static double vratiProsecnuVrednost(ArrayList<Integer> lista){
        int sum = 0;
        for(Integer element : lista){
            sum += element;
        }
        double prosek = sum / lista.size();
        return prosek;
    }
    public static void main(String[] args) {
        //11. Napisati funkciju koja vraca prosecnu vrednost iz ArrayListe.
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(0);
        lista1.add(0);
        lista1.add(0);
        double prosek = vratiProsecnuVrednost(lista1);
        System.out.println(prosek);
    }
}
