package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public class Fakultet implements Studije{
    private ArrayList<Departman> listaDepartmana;

    public Fakultet(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    @Override
    public void dodajSudenta(Departman d, Student s) {
        if(listaDepartmana.contains(d)){
            d.getListaStudenata().add(s);
        }
    }

    @Override
    public void izbaciStudenta(Departman d, Student s) {
        if(listaDepartmana.contains(d)){
            d.getListaStudenata().remove(s);
        }
    }

    @Override
    public Departman najvecaZarada() {
        Departman maks = listaDepartmana.get(0);
        for (Departman departman : listaDepartmana){
           if(departman.finansije() > maks.finansije()){
               maks = departman;
            }
        }
        return maks;
    }

    @Override
    public ArrayList<Student> sviApsolventi() {
        ArrayList<Student> apsolventi = new ArrayList<>();
        for (Departman departman : listaDepartmana){
            for(Student student : departman.getListaStudenata()){
                if(student.getTrenutnaGodinaStudiranja() == 4){
                    apsolventi.add(student);
                }
            }


        }
        return apsolventi;
    }
}
