package NedeljaIV.Ponedeljak.Knjizara;

import java.util.ArrayList;

public class Knjizara {
    /*
    4. Knjizara
      - ArrayList<Knjige> knjigeKojeKojeSuNaStanju
      - ArrayList<Osobe> zaposleni;
     - ArrayList<Autor> autoreKojeIzdaju;
     */

    private ArrayList<Knjiga> knjigeKojeKojeSuNaStanju;
     private ArrayList<Osoba> zaposleni;
     private ArrayList<Autor> autoreKojeIzdaju;

    public Knjizara(ArrayList<Knjiga> knjigeKojeKojeSuNaStanju, ArrayList<Osoba> zaposleni, ArrayList<Autor> autoreKojeIzdaju) {
        this.knjigeKojeKojeSuNaStanju = knjigeKojeKojeSuNaStanju;
        this.zaposleni = zaposleni;
        this.autoreKojeIzdaju = autoreKojeIzdaju;
    }

  /*  public Knjizara() {
    }

   */

    public ArrayList<Knjiga> getKnjigeKojeKojeSuNaStanju() {
        return knjigeKojeKojeSuNaStanju;
    }

    public void setKnjigeKojeKojeSuNaStanju(ArrayList<Knjiga> knjigeKojeKojeSuNaStanju) {
        this.knjigeKojeKojeSuNaStanju = knjigeKojeKojeSuNaStanju;
    }

    public ArrayList<Osoba> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ArrayList<Osoba> zaposleni) {
        this.zaposleni = zaposleni;
    }

    public ArrayList<Autor> getAutoreKojeIzdaju() {
        return autoreKojeIzdaju;
    }

    public void setAutoreKojeIzdaju(ArrayList<Autor> autoreKojeIzdaju) {
        this.autoreKojeIzdaju = autoreKojeIzdaju;
    }

    double ukupnaCena(){
        double sum = 0;
        for (Knjiga knjiga : knjigeKojeKojeSuNaStanju){
            sum += knjiga.getCena();
        }
        return sum;
    }

    //- ArrayList<Knjige> knjigeOdAutora(Autor a); <- vraca listu svih knjiga koje SU NA STANJU i koje je napisao prosledjen autor; (one knjige autora koje se nalaze u knjizari.)
    ArrayList<Knjiga> knjigeOdAutora(Autor a){
        ArrayList<Knjiga> knjige = new ArrayList<>();
        for (Knjiga knjiga : knjigeKojeKojeSuNaStanju) {
            if (knjiga.getAutor() == a){
                knjige.add(knjiga);
            }
        }
        return knjige;
    }
}
