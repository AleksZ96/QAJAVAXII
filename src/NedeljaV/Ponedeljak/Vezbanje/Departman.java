package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public abstract class Departman {
    /*
    Napraviti abstraktnu klasu Departman koja ima sledece atribute:
-(List<Student>) Listu studenata
-(String) naziv
     */
    private ArrayList<Student> listaStudenata;
    private String naziv;

    public Departman(ArrayList<Student> listaStudenata, String naziv) {
        this.listaStudenata = listaStudenata;
        this.naziv = naziv;
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /*
    Kreirati metode:
List<Student> vredni(int prosek) - Metoda koja vraca listu Studenata koji imaju veci prosek
od prosledjenog.
     */
    ArrayList<Student> vredni(int prosek){
        ArrayList<Student> listaStudenataSaVecimProsekom = new ArrayList<>();
        for (Student student : listaStudenata){
            if(student.prosek() > prosek){
                listaStudenataSaVecimProsekom.add(student);
            }
        }
        return listaStudenataSaVecimProsekom;
    }

    //double prosekSvih() - Metoda koja vraca prosek svih Studenata sa Departmana.

    double prosekSvih(){
        double sum = 0;
        for (Student student : listaStudenata){
            sum += student.prosek();

        }
        return sum / listaStudenata.size();
    }

    /*
    double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
Departmanu za Biologije gde nema ni jedno budzetsko mesto.
     */

    abstract double finansije();
}
