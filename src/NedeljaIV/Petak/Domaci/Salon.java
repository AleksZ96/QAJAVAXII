package NedeljaIV.Petak.Domaci;


import java.util.ArrayList;

public class Salon {
    //Napraviti klasu Salon koja ima samo listu Automobila
    private ArrayList<Automobil> listaAutomobila;

    public Salon(ArrayList<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public ArrayList<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    public void setListaAutomobila(ArrayList<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    //-vratiNajstariji() - koja ce vratiti najstariji automobil po godistu.

    Automobil vratiNajstariji(){
        Automobil max = listaAutomobila.get(0);
        for (Automobil automobil : listaAutomobila){
            if(max.getGodisteAutomobila() < automobil.getGodisteAutomobila()){
                max = automobil;
            }
        }
        return max;

    }

    //-vratiNajskuplji() - vraca najskuplji auto
    Automobil vratiNajskuplji(){
        Automobil max = listaAutomobila.get(0);
        for (Automobil automobil : listaAutomobila){
            if(max.getCena() < automobil.getCena()){
                max = automobil;
            }
        }
        return max;

    }

    @Override
    public String toString() {
        return listaAutomobila.toString();
    }
}
