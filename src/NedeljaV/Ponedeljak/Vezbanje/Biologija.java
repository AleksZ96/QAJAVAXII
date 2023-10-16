package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public class Biologija extends Departman{

    public Biologija(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    @Override
    double finansije() {
        double zarada = 0;
            zarada = getListaStudenata().size() * 3000;
        return zarada;
    }
}
