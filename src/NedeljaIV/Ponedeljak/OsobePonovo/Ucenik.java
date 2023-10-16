package NedeljaIV.Ponedeljak.OsobePonovo;

public class Ucenik extends Osoba{
    private double prosek;
    /*
    Prilikom kreacije objekta podklase, prvo mora da se kreira objekat nadklase
    Kljucna rec super se odnosi na direktnu nadklasu
     */

    public Ucenik(String ime, String prezime, int brojGodina, double prosek) {
        super(ime, prezime, brojGodina);
        this.prosek = prosek;
    }

    public Ucenik() {
        // ne moramo da navodimo prazan konstruktor, on ce se po difoltu pozvati
    }


    // prazan konstruktor za ucenika ali pun za osobu

    public Ucenik(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
    }

    //pun konstruktor za iucenika ali prazan za osobu
    public Ucenik(double prosek) {
        this.prosek = prosek;
    }


    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }
    //ostale getere i setere smo nasledili od klase jer su oni sa public modifikatorom


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Prosek: ").append(prosek);
        return sb.toString();

    }
}
