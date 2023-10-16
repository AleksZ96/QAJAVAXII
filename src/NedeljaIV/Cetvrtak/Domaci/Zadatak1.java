package NedeljaIV.Cetvrtak.Domaci;

import java.awt.*;
import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Domaci Zadatak 1:
Napraviti klasu Tocak koja od atributa ima trajanje tocka(u danima, znaci int) i cenu tocka(double).
Kreirati klasu Automobil koja od atributa ima listu tockova, godiste automobila i cenu.
Unutar ove klase kreirati metodu:
-vratiOstecene(Tocak t) - Proverava da li je dati tocak ostecen, vraca true ako jeste.
Tocak od Audi-a je ostecen ukoliko je stariji od 60 dana, dok za BMW i Mercedes za stariji od 100 dana.
-cenaTockova() - Vrati cenu svih tockova ako znamo da je cena po tocku za BMW 100, Mercedes
 120 i Audi 110.
-zameniTocak() - Tocak koji je stariji od granice zameniti novim tockom.
Napraviti klasu Salon koja ima samo listu Automobila i metode za:
-vratiNajstariji() - koja ce vratiti najstariji automobil po godistu.
-vratiNajskuplji() - vraca najskuplji auto
Klase Audi, BMW i Mercedes nasledjuju klasu Automobil.
Za sve klase potrebno kreirati get i set metode, kao i potrebne konstruktore i toString
         */
        Tocak tocak1 = new Tocak(30,150 );
        Tocak tocak2 = new Tocak(80,150 );
        Tocak tocak3 = new Tocak(80,150 );
        Tocak tocak4 = new Tocak(30,150 );
        ArrayList<Tocak> tockovi = new ArrayList<>();
        tockovi.add(tocak1);
        tockovi.add(tocak2);
        tockovi.add(tocak3);
        tockovi.add(tocak4);


        Audi auto1 = new Audi(tockovi, 2021, 15000);
        BMW auto2 = new BMW(tockovi, 2023, 20000);
        Mercedes auto3 = new Mercedes(tockovi, 2022, 25000);
       // System.out.println(auto1);
       // System.out.println(auto2);
       // System.out.println(auto3);

        ArrayList<Automobil> listaAutomobila = new ArrayList<>();
        listaAutomobila.add(auto1);
        listaAutomobila.add(auto2);
        listaAutomobila.add(auto3);

        Salon salon = new Salon(listaAutomobila);
        System.out.println(salon.vratiNajskuplji());
        System.out.println(salon.vratiNajstariji());



    }
}
