package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public class Informatika extends Departman{
    public Informatika(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }


        @Override
        double finansije() {
            double zarada = 0;
                if (getListaStudenata().size() % 2 == 0) {
                    zarada = getListaStudenata().size() / 2 * 5000;
                } else {
                    zarada = (Math.ceilDiv(getListaStudenata().size(), 2)) * 5000;
                }

            return zarada;
        }
}
