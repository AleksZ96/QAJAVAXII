package NedeljaV.Ponedeljak.Dopunska;

import java.util.ArrayList;

public abstract class TrzniCentar implements Usluge{
    //Napraviti klasu TrzniCentar koja ima listu prodavnica i sledece metode:
    //-ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
    //-najskuplji() - vraca najskuplji artikl u celoj prodavnici
    private ArrayList<Prodavnica> listaProdavnica;

    public TrzniCentar(ArrayList<Prodavnica> listaProdavnica) {
        this.listaProdavnica = listaProdavnica;
    }

    public ArrayList<Prodavnica> getListaProdavnica() {
        return listaProdavnica;
    }

    public void setListaProdavnica(ArrayList<Prodavnica> listaProdavnica) {
        this.listaProdavnica = listaProdavnica;
    }

    // //-ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
    double ukupnaZarada(){
        double suma = 0;
        for (Prodavnica p : listaProdavnica){
            suma += p.zarada();
        }
        return suma;
    }

    //    //-najskuplji() - vraca najskuplji artikl u celoj prodavnici
    Artikl najskuplji(){
        Artikl a = new Artikl();
        for (Prodavnica p : listaProdavnica){
            for (Artikl art : p.getListaArtikla()){
                if(art.getCenaArtikla() > a.getCenaArtikla()){
                    a=art;
                }
            }
        }
        return a;
    }



    @Override
    public String toString() {
        return "TrzniCentar{" +
                "listaProdavnica=" + listaProdavnica +
                '}';
    }
}
