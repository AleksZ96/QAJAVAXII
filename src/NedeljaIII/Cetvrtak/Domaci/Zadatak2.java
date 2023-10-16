package NedeljaIII.Cetvrtak.Domaci;

import java.util.ArrayList;

public class Zadatak2 {
    static ArrayList<Integer> izbaciBrojeveDeljiveSaCetiri(ArrayList<Integer> lista){
        ArrayList<Integer> indeksiZaIzbacivanje = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 4 == 0){
                indeksiZaIzbacivanje.add(lista.get(i));
            }
        }
       lista.removeAll(indeksiZaIzbacivanje);

        return lista;
    }
    public static void main(String[] args) {
        //2.Napraviti funkciju koja prima listu celih brojeva i izbacuje iz nje sve elemente koji su deljivi sa 4.
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(4);
        lista.add(4);
       ArrayList<Integer> novaLista = izbaciBrojeveDeljiveSaCetiri(lista);
       for(Integer broj : novaLista){
           System.out.println(broj);
       }

    }
}
