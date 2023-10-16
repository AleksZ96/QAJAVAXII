package NedeljaIV.Cetvrtak.Domaci;

import java.util.ArrayList;

public class Audi extends Automobil {

    public Audi(ArrayList<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }
    @Override
    double baznaCenaTocka(){
        return 110;
    }

}
