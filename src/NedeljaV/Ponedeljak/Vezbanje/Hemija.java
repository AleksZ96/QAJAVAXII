package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public class Hemija extends Departman{
    public Hemija(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    @Override
    double finansije() {
        double zarada = 0;
            if (getListaStudenata().size() % 2 == 0) {
                zarada = getListaStudenata().size() / 2 * 4000;
            } else {
                zarada = (Math.ceilDiv(getListaStudenata().size(), 2)) * 4000;
            }
        return zarada;
    }
}
