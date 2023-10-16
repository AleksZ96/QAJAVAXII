package NedeljaV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Amater extends Planinar{

    public Amater(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
        setMaksimalnaVisina(1000);
    }

}
