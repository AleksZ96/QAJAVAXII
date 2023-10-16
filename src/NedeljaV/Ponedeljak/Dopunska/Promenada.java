package NedeljaV.Ponedeljak.Dopunska;

import java.util.ArrayList;

public class Promenada extends TrzniCentar{
    public Promenada(ArrayList<Prodavnica> listaProdavnica) {
        super(listaProdavnica);
    }
//-masovniPopust() - dodeljuje 20% popusta na sve artikle u svim prodavnicama
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
}
