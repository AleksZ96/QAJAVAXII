package NedeljaIV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Zadatak1 {
    /*
    Domaci Zadatak 1:
-Napraviti klasu Predmet koji kao atribute sadrzi ocenu i naziv predmeta.
-Klase Biologija, Matematika i Srpski nasledjuju klasu Predmet.
-Klasa Ucenik kao atribute ima listu predmeta   i godinu skolovanja, unutar te klase napisati metodu za:
* izracunavanje proseka iz svih predmeta.
-Klasa Skola ima listu Ucenika, napraviti metode:
*koja za prosledjenu godinu skolovanja vraca prosek svih ucenika koji su u toj godini.
* za prosledjeni predmet vraca prosek svih ucenika koji taj predmet pohadjaju
* vraca Ucenika sa najmanjim prosekom
     */

    public static void main(String[] args) {
        ArrayList<Predmet> predmetiUcenika1 = new ArrayList<>();
        predmetiUcenika1.add(new Matematika(5, "Matematika"));
        predmetiUcenika1.add(new Srpski(5, "Srpski"));
        predmetiUcenika1.add(new Biologija(5, "Biologija"));
        Ucenik ucenik1 = new Ucenik("Marko", predmetiUcenika1, 2014);
        System.out.println(ucenik1);
        ArrayList<Predmet> predmetiUcenika2 = new ArrayList<>();
        predmetiUcenika2.add(new Matematika(4, "Matematika"));
        predmetiUcenika2.add(new Srpski(4, "Srpski"));
        predmetiUcenika2.add(new Biologija(4, "Biologija"));
        Ucenik ucenik2 = new Ucenik("Strahinja", predmetiUcenika2, 2013);
        System.out.println(ucenik2);

        ArrayList<Ucenik> listaUcenika = new ArrayList<>();
        listaUcenika.add(ucenik1);
        listaUcenika.add(ucenik2);
        Skola skola = new Skola(listaUcenika);
       // System.out.println(listaUcenika);
       // System.out.println(skola.vratiProsekSvihUcenikaUGodini(2014));
        System.out.println(skola.vratiProsekSvihUcenikaKojiSlusajuPredmet(new Matematika("Matematika")));
        System.out.println(skola.vratiUcenikaSaNajmanjimProsekom());

    }
}
