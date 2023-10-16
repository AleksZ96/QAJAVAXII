package NedeljaIII.Petak.Vezbanje.Zadatak8;

import java.util.ArrayList;

public class Putovanje {

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> prijavljeneOsobe;

    public Putovanje( Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        if(udaljenostUKm < 0){
            System.out.println("Greska");
            return;
        }
        prijavljeneOsobe = new ArrayList<>();
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        this.udaljenostUKm = udaljenostUKm;

    }

    public Putovanje( Grad destinacija, Osoba vodjaPuta, Automobil vozilo, double udaljenostUKm) {
        if(udaljenostUKm < 0){
            System.out.println("Greska");
            return;
        }
        prijavljeneOsobe = new ArrayList<>();
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        this.udaljenostUKm = udaljenostUKm;
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        if(udaljenostUKm < 0){
            System.out.println("Greska");
            return;
        }
        this.udaljenostUKm = udaljenostUKm;

    }

    public ArrayList<Osoba> getPrijavljeneOsobe() {
        return prijavljeneOsobe;
    }

    public void setPrijavljeneOsobe(ArrayList<Osoba> prijavljeneOsobe) {
        this.prijavljeneOsobe = prijavljeneOsobe;
    }

    double vratiVremeKojeJePotrebno(double prosecnaBrzina){
        double vremePuta = udaljenostUKm / prosecnaBrzina;
        return vremePuta;

    }

    /*
    napisati metodu prijava, koja prima kao argument osobu koja se prijavljuje na putovanje
	napisati metodu odjava, koja prima kao argument osobu koja se odjavljjuje sa putovanja (opciono)
     */
    void prijava(Osoba a){
        prijavljeneOsobe.add(a);
    }

    void odjava(Osoba a){
        prijavljeneOsobe.remove(a);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Destinacija: ").append(destinacija.getGrad()).append(", ").append(destinacija.getDrzava()).append("\n");
        if(vodjaPuta != null){
            sb.append("Vodja puta je ").append(vodjaPuta.getImeIPrezime()).append("\n");
        }

        sb.append("Putuje se automobilom: ").append(vozilo.getMarka()).append(vozilo.getGodinaProizvodnje()).append(vozilo.getKilometraza()).append("\n");
        sb.append("Udaljenost do destinacije u kilometrima je: ").append(udaljenostUKm).append("\n");
        sb.append("Prijavljene osobe:").append("\n");
        for(Osoba osoba : prijavljeneOsobe){
            sb.append(osoba.getImeIPrezime()).append("\n");
        }

        return sb.toString();
    }
}
