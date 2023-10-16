package NedeljaIII.Petak.Vezbanje.Zadatak13;

import NedeljaV.Ponedeljak.Domaci.Pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Prodavnica {
    //Napisati klasu Prodavnica koja ima atribute
    //- String ime
    //- ArrayList<Namirnica> namirnice
    private String ime;
    private ArrayList<Namirnica> namirnice;
    //Napisati konstruktore:
    //1. Jedan koji prima sve argumente i Arraylistu namirnica duboko kopira
    //2. Jedan koji prima ime i postavlja Arraylistu na novu praznu ArrayListu.
    //3. Jedan koji prima ime i niz Namirnica preko ...

    public Prodavnica(String ime, ArrayList<Namirnica> namirnice) {
        this.ime = ime;
        this.namirnice = (ArrayList<Namirnica>) namirnice.clone();
    }

    public Prodavnica(String ime) {
        this.ime = ime;
        this.namirnice = new ArrayList<>();
    }
    public Prodavnica(String ime, Namirnica... namirnice) {
        this.ime = ime;
        Collections.addAll(this.namirnice, namirnice);
    }


    //Napisti sve settere i gettere

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    //Napisati metode:
    //1. dodajNamirnicu - koja dodaje namirnicu u listu namirnica
    void dodajNamirnicu(Namirnica a){
        namirnice.add(a);
    }

    //2. ukoloniNamirnicu - koja uklanja namirnicu iz liste namirnica
    void ukloniNamirnicu(Namirnica a){
        namirnice.remove(a);
    }
    //Overridovati toString() metod na sledeci nacin:
    //"Prodavnica <ime> ima sledece namirnice:
    // <imeNamirnice1> | <cenaNamirnice1>
    // ...
    // <imeNamirniceN> | <cenaNamriniceN>"


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prodavnica ").append(ime).append(" ima sledece namirnice:").append("\n");
        for (Namirnica namirnica : namirnice) {
            sb.append(namirnica).append("\n");
        }
        return sb.toString();
    }
}
