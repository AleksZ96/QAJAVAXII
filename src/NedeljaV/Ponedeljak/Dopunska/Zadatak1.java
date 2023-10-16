package NedeljaV.Ponedeljak.Dopunska;

import NedeljaV.Ponedeljak.Domaci.Pro;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Napraviti klasu Artikl koja ima atribute za naziv i cenu artikla.
Napraviti klasu Prodavnica koja ima listu Artikla i naziv. Ova klasa takodje ima metodu:
-zarada() - koja vraca ukupnu zaradu od svih artikala
Napraviti klasu TrzniCentar koja ima listu prodavnica i sledece metode:
-ukupnaZarada() - vraca ukupnu zaradu Trznog centra iz svih prodavnica
-najskuplji() - vraca najskuplji artikl u celoj prodavnici
Kreirati interfejs Usluge koja ima sledece metode:
-masovniPopust() - dodeljuje 20% popusta na sve artikle u svim prodavnicama
-nalaziSe(Artikl a) - vraca prodavnicu u kojoj se nalazi dati artikl
-eleminisi(Artikl a) - izbacuje dati artikl iz ponude
Klasa TrzniCentar implementira interfejs Usluge.
Klase Usce, Promenada i Galerija nasledjuju klasu TrzniCentar.
Klasa Usce daje masovni popust samo na najskuplji artikl, i to 50% popusta.
Klasa Promenada od ukupne zarade odbija 20% zbog poreza.
Kreirati sve potrebne getere i setere, kao i konstruktor i toString.
         */

        Artikl artikl1 = new Artikl("Patike", 5000);
        Artikl artikl2 = new Artikl("Jakna", 10000);
        Artikl artikl3 = new Artikl("Farmerke", 3000);
        Artikl artikl4 = new Artikl("Duks", 2000);
        Artikl artikl5 = new Artikl("Prsluk", 5000);
        System.out.println(artikl1);
        System.out.println("---------");
        ArrayList<Artikl> artikli = new ArrayList<>();
        artikli.add(artikl1);
        artikli.add(artikl2);
        artikli.add(artikl3);
        artikli.add(artikl4);
        artikli.add(artikl5);
        Prodavnica zara = new Prodavnica("Zara", artikli);
        System.out.println("---------");
        System.out.println(artikli);
        zara.izlistajArtikle();
        Prodavnica bershka = new Prodavnica("Bershka", artikli);
        ArrayList<Prodavnica> tc1 = new ArrayList<>();
        tc1.add(zara);
        tc1.add(bershka);
        TrzniCentar usce = new Usce(tc1);
        System.out.println(usce.ukupnaZarada());
        System.out.println(usce.najskuplji());
        System.out.println();
        usce.masovniPopust();
        System.out.println(usce.najskuplji());





    }
}
