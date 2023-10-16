package NedeljaV.Ponedeljak.Dopunska;

import java.util.ArrayList;

public class Prodavnica {
    //Napraviti klasu Prodavnica koja ima listu Artikla i naziv. Ova klasa takodje ima metodu:
    private String naziv;
    private ArrayList<Artikl> listaArtikla;

    //-zarada() - koja vraca ukupnu zaradu od svih artikala


    public Prodavnica(String naziv, ArrayList<Artikl> listaArtikla) {
        this.naziv = naziv;
        this.listaArtikla = listaArtikla;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Artikl> getListaArtikla() {
        return listaArtikla;
    }

    public void setListaArtikla(ArrayList<Artikl> listaArtikla) {
        this.listaArtikla = listaArtikla;
    }

    double zarada(){
        double zarada = 0;
        for (Artikl art : listaArtikla){
            zarada += art.getCenaArtikla();
        }
        return zarada;
    }

    void izlistajArtikle(){
        for (Artikl art : listaArtikla){
            System.out.println(art);
        }
    }

    @Override
    public String toString() {
        return "Prodavnica{" +
                "naziv='" + naziv + '\'' +
                ", listaArtikla=" + listaArtikla +
                '}';
    }
}
