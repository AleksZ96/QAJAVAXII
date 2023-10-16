package NedeljaV.Ponedeljak.Dopunska;

import java.util.ArrayList;

public class Galerija extends TrzniCentar{

    public Galerija(ArrayList<Prodavnica> listaProdavnica) {
        super(listaProdavnica);
    }

    @Override
    public void masovniPopust() {
        for (Prodavnica p : getListaProdavnica()){
            for (Artikl a : p.getListaArtikla()){
                a.setCenaArtikla(a.getCenaArtikla() * 0.8);
            }
        }

    }

    @Override
    public Prodavnica nalaziSe(Artikl a) {
        for (Prodavnica p : getListaProdavnica()){
            for(Artikl art : p.getListaArtikla()){
                if(art.equals(a)){
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public void eliminisi(Artikl a) {
        ArrayList<Artikl> artikli = new ArrayList<>();
        for (Prodavnica p : getListaProdavnica()){
            for (Artikl art : p.getListaArtikla()){
                if(!(a.equals(art))){
                    artikli.add(a);
                }
            }
            p.setListaArtikla(artikli);
        }

    }

    //Klasa Promenada od ukupne zarade odbija 20% zbog poreza.

    @Override
    double ukupnaZarada() {
        double suma = 0;
        for (Prodavnica p : getListaProdavnica()){
            suma += p.zarada();
        }
        return suma * 0.8;
    }
}
