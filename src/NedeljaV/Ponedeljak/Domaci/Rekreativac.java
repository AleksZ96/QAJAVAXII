package NedeljaV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Rekreativac extends Planinar{

    public Rekreativac(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
        setMaksimalnaVisina(2000);
    }

}
