package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends UgostiteljskiObjekat{

    //Napisati klasu Hotel koja nasledjuje klasu UgostiteljskiObjekat i ima sledece atribute:
    //- final int brojSoba; //Oznacava koliko ukupno raspolozivih soba ima u hotelu. Pretpostaviti da su sve jednokrevetne (za jednu osobu)
    //- double cenaSobe; //Cena za iznajmljivanje sobe. Pretpostaviti da sve sobe kostaju isto
    //- double zarada; //Ukupna zarada hotela
    //- List<Osoba> gosti;

     private final int brojSoba;
     private double cenaSobe;
     private double zarada;

     private ArrayList<Osoba> gosti;

     //Za svaki nadkonstruktor napisati jedan konstruktor koji prima broj soba sa kojima raspolaze i cenu za iznajmljivanje sobe,
    // goste postavlja na novu praznu ArrayList-u a ukupnu zaradu postavlja na 0.0

    public Hotel(String naziv, ArrayList<Radnik> radnici, double cenaSobe) {
        super(naziv, radnici);
        this.brojSoba = 10;
        this.cenaSobe = cenaSobe;
        this.zarada = 0;
        gosti = new ArrayList<>();
    }

    public Hotel(String naziv, double cenaSobe) {
        super(naziv);
        this.brojSoba = 10;
        this.cenaSobe = cenaSobe;
        this.zarada = 0;
        gosti = new ArrayList<>();
    }

    public Hotel(ArrayList<Radnik> radnici, double cenaSobe) {
        super(radnici);
        this.brojSoba = 10;
        this.cenaSobe = cenaSobe;
        this.zarada =0;
        gosti = new ArrayList<>();
    }

    public int getBrojSoba() {
        return brojSoba;
    }

    public double getCenaSobe() {
        return cenaSobe;
    }

    public void setCenaSobe(double cenaSobe) {
        this.cenaSobe = cenaSobe;
    }

    public double getZarada() {
        return zarada;
    }

    public void setZarada(double zarada) {
        this.zarada = zarada;
    }

    public ArrayList<Osoba> getGosti() {
        return gosti;
    }

    public void setGosti(ArrayList<Osoba> gosti) {
        this.gosti = gosti;
    }
    //Implementovati sve metode na sledeci nacin:
    //- public double bruto() // Vraca bruto zaradu Hotela. Bruto zarada se racuna kao zbir svih soba koje su iznajmljene do tog momenta.
    @Override
    public double bruto() {
        double brutoZaradaHotela = gosti.size() * cenaSobe;
        return brutoZaradaHotela;
    }


    //- public double neto() // Vraca neto zaradu Hotela. Neto zarada se racuna kada se od bruto zarade oduzme
    // sve sto hotel treba da plati svojim zaposlenima (kada isplati plate svojim zaposlenima) i kada se oduzme porez od 10_000
    @Override
    public double neto() {
        double netoZaradaHotela = bruto() - ukupnaPlata() - 10000;
        return  netoZaradaHotela;
    }

    //- public void ugostiSve(List<Osoba> o) //Ubacuje SVE osobe iz prosledjene liste u listu gostiju ako je to moguce.
    // Ako nije moguce ubaciti SVE osobe iz prosledjene liste, ne ubacuje NI JEDNU osobu iz prosledjene liste
    @Override
    public void usluziSve(ArrayList<Osoba> osobe) {
        if(brojSoba - gosti.size() >= osobe.size()){
            for (Osoba osoba : osobe) {
                gosti.add(osoba);
            }
            zarada += cenaSobe;
        }
        else{
            return;
        }
    }
    //- public void ugostiSve(Osoba ... o) // Ubacuje osobe SVE DOK JE TO MOGUCE u listu gostiju.
    @Override
    public void usluziSve(Osoba... osobe) {
        if(brojSoba - gosti.size() >= osobe.length){
            for (Osoba osoba : osobe) {
                gosti.add(osoba);
            }
            zarada += cenaSobe;
        }

    }
    //Napisati metode:
    //- public void odjaviOsobu(Osoba o) // Izbacuje osobu o iz liste gostiju i oslobadja njegovu sobu ako je to moguce.
    // (Moguce je proslediti i duboku kopiju osobe koja je smestena u hotelu ili osobu koja uopste nije gost hotela)
    public void odjaviOsobu(Osoba o){
        if(gosti.contains(o)){
            gosti.remove(o);
        }
    }

    //- public void ugosti(Osoba o) //Ubacuje osobu o u listu gostiju ako je to moguce.
    @Override
    public void usluzi(Osoba o) {
        if(brojSoba > gosti.size()){
            gosti.add(o);
            zarada += cenaSobe;
        }

     }
     /*
     Serilizovati klasu na sledeci nacin:
"Hotel: <naziv>
 Broj slobodnih soba: <brojSlobodnihSoba>
 Cena sobe: <cenaSobe>"
      */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel: ").append(getNaziv()).append("\n");
        sb.append("Broj slobodnih soba: ").append(brojSoba -gosti.size()).append("\n");
        sb.append("Cena sobe").append(cenaSobe).append("\n");
        return sb.toString();
    }
}



