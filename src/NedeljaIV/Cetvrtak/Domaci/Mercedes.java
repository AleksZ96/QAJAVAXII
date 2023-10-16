package NedeljaIV.Cetvrtak.Domaci;

import java.util.ArrayList;

public class Mercedes extends Automobil{
    public Mercedes(ArrayList<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }

    @Override
    int vratiTrajanje(){
        return 100;
    }
    @Override
    double baznaCenaTocka(){
        return 120;
    }

}
