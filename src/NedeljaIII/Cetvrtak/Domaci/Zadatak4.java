package NedeljaIII.Cetvrtak.Domaci;

import java.util.ArrayList;

public class Zadatak4 {
    static ArrayList<Integer> vratiListuBezN(ArrayList<Integer> lista, int n){
        ArrayList<Integer> zaBrisanje = new ArrayList<>();
        zaBrisanje.add(n);
        lista.removeAll(zaBrisanje);
        return lista;
    }
    public static void main(String[] args) {
        //Zadatak 4: Napraviti funkciju koja izbacuje svako pojavljivanje n u listi
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);

        for (Integer broj : vratiListuBezN(lista, 2)) {
            System.out.println(broj);
        }
    }

}
