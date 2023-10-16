package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

import org.w3c.dom.ls.LSOutput;

public class Zadatak1 {
    public static void main(String[] args) {


    /*
    Napisati klasu Osoba koja ima atribute:
- String ime, prezime;
- int brojGodina;

Napisati jedan potpun konstruktor koji prima sve argumente i jedan prazan konstruktor koji postavlja ime i prezime na prazan String a brojGodina na 18

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Napisati metode:
- public boolean jednaki(Osoba o) // Vraca true ako je prosledjena osoba jednaka ovoj (this) osobi. Dve osobe su jednake ako su im svi atributi isti

Serilizovati klasu na sledeci nacin:
"<ime> <prezime> (<brojGodina>)"

------------------------------------------------------------------------

Napisati klasu Radnik koja prosiruje klasu Osoba i ima atribute:
- int id
- double plata

Zagarantovati da svaki Radnik ima svoj jedinstveni id broj!

Napisati za svaki nadkonstrukor jedan konstruktor koji prima double platu. Uzeti da je podrazumevana plata 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Ovveridovati metode:
- public boolean jednaki(Osoba o) // Vraca true ako je prosledjena osoba ista kao ovaj (this) radnik. Ovaj radnik je isti kao Osoba o ako je o instanca klase Radnik i ako imaju isti id.

Serilizovati klasu na sledeci nacin:
"<ime> <prezime> (<brojGodina>) [<id>]"

------------------------------------------------------------------------

Napisati interfejs Ugostljivo koji ima naredne metode:
- void usluzi(Osoba o); // Usluzava osobu o
- void usluziSve(List<Osoba> osobe); //Usluzava citavu listu osoba
- void usluziSve(Osoba ... osobe); //Prima promenjiv broj osoba


------------------------------------------------------------------------

Napisati abstraktnu klasu UgostiteljskiObjekat koji implementira interfejs Ugostljivo i ima naredne metode:
- String naziv
- List<Radnik> radnici

Napisati konstruktore:
- Jedan potpun konstruktor koji prima sve argumente
- Jedan konstruktor koji prima String naziv a radnike postavlja na novu praznu ArrayList-u
- Jedan konstruktor koji prima Listu radnika a naziv postavlja na prazan String

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Napisati metode:
- public String ispisiRadnike() //Za svakog radnika vrsi njegovu serilizaciju. Serilizaciju svakog radnika vrsiti u novom redu po principu:
"<Serilizacija 1. radnika>
 <Serilizacija 2. radnika>
 ....
 <Serilizacija N. radnika>"
- public double ukupnaPlata() //Vraca ukupnu platu svih svojih radnika

Napisati abstraktne metode:
- public abstract double bruto(); //Vraca bruto zaradu UgostiteljskogObjekta
- public abstract double neto(); //Vraca neto zaradu UgostiteljskogObjekta

Serilizovati klasu na sledeci nacin:
"<naziv> | brojZaposlenih: <brojZaposlenihRadnika>"

------------------------------------------------------------------------

Napisati klasu Hotel koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
- final int brojSoba; //Oznacava koliko ukupno raspolozivih soba ima u hotelu. Pretpostaviti da su sve jednokrevetne (za jednu osobu)
- double cenaSobe; //Cena za iznajmljivanje sobe. Pretpostaviti da sve sobe kostaju isto
- double zarada; //Ukupna zarada hotela
- List<Osoba> gosti;

Za svaki nadkonstruktor napisati jedan konstruktor koji prima broj soba sa kojima raspolaze i cenu za iznajmljivanje sobe, goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Implementovati sve metode na sledeci nacin:
- public void ugosti(Osoba o) //Ubacuje osobu o u listu gostiju ako je to moguce.
- public void ugostiSve(List<Osoba> o) //Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce. Ako nije moguce ubaciti SVE osobe iz prosledjene liste, ne ubacuje NI JEDNU osobu iz prosledjene liste
- public void ugostiSve(Osoba ... o) // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.
- public double bruto() // Vraca bruto zaradu Hotela. Bruto zarada se racuna kao zbir svih soba koje su iznajmljene do tog momenta.
- public double neto() // Vraca neto zaradu Hotela. Neto zarada se racuna kada se od bruto zarade oduzme sve sto hotel treba da plati svojim zaposlenima (kada isplati plate svojim zaposlenima) i kada se oduzme porez od 10_000

Napisati metode:
- public void odjaviOsobu(Osoba o) // Izbacuje osobu o iz liste gostiju i oslobadja njegovu sobu ako je to moguce. (Moguce je proslediti i duboku kopiju osobe koja je smestena u hotelu ili osobu koja uopste nije gost hotela)

Serilizovati klasu na sledeci nacin:
"Hotel: <naziv>
 Broj slobodnih soba: <brojSlobodnihSoba>
 Cena sobe: <cenaSobe>"

------------------------------------------------------------------------

Napisati klasu Restoran koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
- final int brojStolova; //Oznacava koliko ukupno raspolozivih stolova ima u restoranu. Pretpostaviti da su svi za jednu osobu
- double cenaRucka; //Cena rucka. Pretpostaviti da je to jedina stavka na meniju
- double zarada; //Ukupna zarada restorana
- List<Osoba> gosti;

Za svaki nadkonstruktor napisati jedan konstruktor koji prima broj stolova sa kojima raspolaze i cenu zrucka, goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Implementovati sve metode na sledeci nacin:
- public void ugosti(Osoba o) //Ubacuje osobu o u listu gostiju ako je to moguce.
- public void ugostiSve(List<Osoba> o) //Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce. Ako nije moguce ubaciti SVE osobe iz prosledjene liste, ne ubacuje NI JEDNU osobu iz prosledjene liste
- public void ugostiSve(Osoba ... o) // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.
- public double bruto() // Vraca bruto zaradu Restorana. Bruto zarada se racuna kao zbir svih ruckova napravljenih do tog momenta.
- public double neto() // Vraca neto zaradu Restorana. Neto zarada se racuna kada se od bruto zarade oduzme sve sto restoran treba da plati svojim zaposlenima (kada isplati plate svojim zaposlenima) i kada se oduzme porez od 1_000

Napisati metode:
- public void odjaviOsobu(Osoba o) // Izbacuje osobu o iz liste gostiju i oslobadja njegov sto ako je to moguce. (Moguce je proslediti i duboku kopiju osobe koja ruca u restoranu ili osobu koja uopste nije gost restorana)

Serilizovati klasu na sledeci nacin:
"Restoran: <naziv>
 Meni: Rucak | <cenaRucka>"

 ------------------------------------------------------------------------

Napisati klasu Kafic koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
- double zarada; //Ukupna zarada kafica

Za svaki nadkonstruktor napisati jedan konstruktor koji postavlja ukupnu zaradu na 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja

Implementovati sve metode na sledeci nacin:
- public void ugosti(Osoba o) //Prodaje kafu osobi. Cena kafe iznosi 20 * <k>, gde je k zbir duzine karaktera u imenu i prezimenu osobe kojoj se prodaje kafa
- public void ugostiSve(List<Osoba> o) //Prodaje kafu svim osobama iz liste na isti nacin kao gore definisan
- public void ugostiSve(Osoba ... o) //Prodaje kafu svim prosledjenim osoba na isti nacin kao gore definisan.
- public double bruto() // Vraca bruto zaradu Kafica. Bruto zarada se racuna kao zbir svih kafa prodatih do tog momenta.
- public double neto() // Vraca neto zaradu Kafica. Neto zarada se racuna kada se od bruto zarade oduzme porez od 1_000.

Serilizovati klasu na sledeci nacin:
"Kafic: <naziv>
 Do sada prodato: <brojKafaProdatih>"
     */



    }
}
