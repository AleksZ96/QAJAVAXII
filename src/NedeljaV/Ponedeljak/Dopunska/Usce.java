package NedeljaV.Ponedeljak.Dopunska;

import java.util.ArrayList;

public class Usce extends TrzniCentar{

    public Usce(ArrayList<Prodavnica> listaProdavnica) {
        super(listaProdavnica);
    }
//Klasa Usce daje masovni popust samo na najskuplji artikl, i to 50% popusta.
    @Override
    public void masovniPopust() {
        Artikl a = najskuplji();
        for (Prodavnica p : getListaProdavnica()){
            for (Artikl art : p.getListaArtikla()){
                if(art.equals(a)){
                    a.setCenaArtikla(a.getCenaArtikla() / 2);
                }
            }
        }

    }
//nalaziSe(Artikl a) - vraca prodavnicu u kojoj se nalazi dati artikl
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
