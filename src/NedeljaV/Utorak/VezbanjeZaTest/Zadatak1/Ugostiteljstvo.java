package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

import java.util.ArrayList;
import java.util.List;

public interface Ugostiteljstvo {
    //Napisati interfejs Ugostljivo koji ima naredne metode:
    //- void usluzi(Osoba o); // Usluzava osobu o
    //- void usluziSve(List<Osoba> osobe); //Usluzava citavu listu osoba
    //- void usluziSve(Osoba ... osobe); //Prima promenjiv broj osoba

    void usluzi(Osoba o);

    void usluziSve(ArrayList<Osoba> osobe);

    void usluziSve(Osoba ... osobe);

}
