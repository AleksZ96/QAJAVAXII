package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Aleksandra", "Zivkovic", 27);
        Osoba osoba2 = new Osoba("Aleksandra", "Zivkovic", 28);
        System.out.println(osoba1.jednaki(osoba2));
        System.out.println("--------");
        System.out.println(osoba1);
        ArrayList<Radnik> radnici = new ArrayList<>();
        Radnik radnik1 = new Radnik("Aleksandra", "Zivkovic", 27);
        Radnik radnik2 = new Radnik("Aleksandra", "Zivkovic", 28);
        radnici.add(radnik1);
        radnici.add(radnik2);
        System.out.println(radnik1);
        System.out.println(radnik2);
        System.out.println(radnik1.jednaki(radnik1));
        System.out.println("--------");
        UgostiteljskiObjekat uo1 = new Hotel("Jugoslavija", radnici, 2000);
        System.out.println(uo1.ispisiRadnike());
        System.out.println("--------");
        radnik1.setPlata(50000);
        radnik2.setPlata(50000);
        System.out.println(uo1.ukupnaPlata());
        System.out.println("--------");
        uo1.usluzi(osoba1);
        System.out.println(uo1);
        System.out.println(uo1.bruto());
        System.out.println(uo1.neto());





    }
}
