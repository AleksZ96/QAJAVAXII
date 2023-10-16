package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public interface Studije {

    //-void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz Departmana.
    void dodajSudenta(Departman d, Student s);

    //-void izbaciStudenta(Departman d, Student s) - Izbacuje studenta iz liste za odredjen Departman
    void izbaciStudenta(Departman d, Student s);

    //-Departman najvecaZarada() - Vraca departman koji donosi najvise para fakultetu

    Departman najvecaZarada();
    //-List<Student> sviApsolventi() - Vraca listu studenata koji su cetvrta godina
    ArrayList<Student> sviApsolventi();
}
