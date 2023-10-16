package NedeljaIV.Petak.Domaci;

import java.util.ArrayList;

public class BMW extends Automobil{
    public BMW(ArrayList<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }

    public void ispisiNesto(){

    }
    @Override
    int vratiTrajanje(){
        return 100;
    }

    @Override
    double baznaCenaTocka() {
        return 100;
    }
}
