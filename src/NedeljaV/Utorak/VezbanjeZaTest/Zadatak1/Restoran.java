package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

import java.util.ArrayList;

public class Restoran extends UgostiteljskiObjekat{

    //Napisati klasu Restoran koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
    //- final int brojStolova; //Oznacava koliko ukupno raspolozivih stolova ima u restoranu. Pretpostaviti da su svi za jednu osobu
    //- double cenaRucka; //Cena rucka. Pretpostaviti da je to jedina stavka na meniju
    //- double zarada; //Ukupna zarada restorana
    //- List<Osoba> gosti;
    private final int brojStolova;
    private double cenaRucka;
    private double zarada;
    private ArrayList<Osoba> gosti;
    //Za svaki nadkonstruktor napisati jedan konstruktor koji prima broj stolova sa kojima raspolaze i cenu zrucka,
    // goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0

    public Restoran(String naziv, ArrayList<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(naziv, radnici);
        this.brojStolova = 10;
        this.cenaRucka = cenaRucka;
        this.zarada = 0;
        this.gosti = new ArrayList<>();
    }

    public Restoran(String naziv, int brojStolova, double cenaRucka) {
        super(naziv);
        this.brojStolova = 10;
        this.cenaRucka = cenaRucka;
        this.zarada = 0;
        this.gosti = new ArrayList<>();
    }

    public Restoran(ArrayList<Radnik> radnici, int brojStolova, double cenaRucka) {
        super(radnici);
        this.brojStolova = 10;
        this.cenaRucka = cenaRucka;
        this.zarada = 0;
        this.gosti = new ArrayList<>();
    }


    //Enkapsulirati sve podatke i napisati gettere i settere za sva polja

    public int getBrojStolova() {
        return brojStolova;
    }

    public double getCenaRucka() {
        return cenaRucka;
    }

    public void setCenaRucka(double cenaRucka) {
        this.cenaRucka = cenaRucka;
    }

    //Implementovati sve metode na sledeci nacin:
    //- public void ugosti(Osoba o) //Ubacuje osobu o u listu gostiju ako je to moguce.
    //- public void ugostiSve(List<Osoba> o) //Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce.
    // Ako nije moguce ubaciti SVE osobe iz prosledjene liste, ne ubacuje NI JEDNU osobu iz prosledjene liste
    //- public void ugostiSve(Osoba ... o) // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.
    //- public double bruto() // Vraca bruto zaradu Restorana. Bruto zarada se racuna kao zbir svih ruckova napravljenih do tog momenta.
    //- public double neto() // Vraca neto zaradu Restorana.
    // Neto zarada se racuna kada se od bruto zarade oduzme sve sto restoran treba da plati svojim zaposlenima
    // (kada isplati plate svojim zaposlenima) i kada se oduzme porez od 1_000

    @Override
    public double bruto() {
        return zarada;
    }

    @Override
    public double neto() {
        return zarada - ukupnaPlata() - 1000;
    }

    @Override
    public void usluzi(Osoba o) {
        if (brojStolova > gosti.size()) {
            gosti.add(o);
            zarada += cenaRucka;
        }

    }

    @Override
    public void usluziSve(ArrayList<Osoba> osobe) {
        if(brojStolova - gosti.size() >= osobe.size()){
            for (Osoba osoba : osobe) {
                gosti.add(osoba);
            }
            zarada += cenaRucka;
        }
        else {
            return;
        }

    }

    @Override
    public void usluziSve(Osoba... osobe) {
        if(brojStolova - gosti.size() >= osobe.length){
            for (Osoba osoba : osobe) {
                gosti.add(osoba);
            }
            zarada += cenaRucka;
        }
    }

    //Napisati metode:
    //- public void odjaviOsobu(Osoba o) // Izbacuje osobu o iz liste gostiju i oslobadja njegov sto ako je to moguce.
    // (Moguce je proslediti i duboku kopiju osobe koja ruca u restoranu ili osobu koja uopste nije gost restorana)
    public void odjaviOsobu(Osoba o){
        if(gosti.contains(o)){
            gosti.remove(o);
        }
    }

    //Serilizovati klasu na sledeci nacin:
    //"Restoran: <naziv>
    // Meni: Rucak | <cenaRucka>"


    @Override
    public String toString() {
        return "Restoran: " + getNaziv() + "\n" + "Meni: Rucak | " + cenaRucka;
    }
}
