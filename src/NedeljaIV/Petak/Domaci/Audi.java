package NedeljaIV.Petak.Domaci;


import java.util.ArrayList;

public class Audi extends Automobil{
    public Audi(ArrayList<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }

    @Override
    int vratiTrajanje(){
        return 60;
    }
    @Override
    double baznaCenaTocka(){
        return 110;
    }

}

