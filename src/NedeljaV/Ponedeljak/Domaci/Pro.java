package NedeljaV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Pro extends Planinar{
    public Pro(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
        setMaksimalnaVisina(3000);
    }
}
