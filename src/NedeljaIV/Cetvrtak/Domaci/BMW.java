package NedeljaIV.Cetvrtak.Domaci;

import java.util.ArrayList;

public class BMW extends Automobil{
    public BMW(ArrayList<Tocak> listaTockova, int godisteAutomobila, double cena) {
        super(listaTockova, godisteAutomobila, cena);
    }

    @Override
    int vratiTrajanje(){
        return 100;
    }

}
