package NedeljaIV.Ponedeljak.Knjizara;

import java.util.ArrayList;

public class Knjiga {
    /*
    2. Knjiga
      - String naziv;
      - int brojStranica;
      - double cena;
      - Autor autor;
      (opciono - jedinstven ISBN)
     */
    private String naziv;
    private int brojStranica;

    private double cena;
    private Autor autor;

    private ArrayList<Knjiga> ostaleKnjigeKojeJeAutorNapisao;

    public Knjiga(String naziv, int brojStranica, double cena, Autor autor, ArrayList<Knjiga> ostaleKnjigeKojeJeAutorNapisao) {
        this.naziv = naziv;
        this.brojStranica = brojStranica;
        this.cena = cena;
        this.autor = autor;
        this.ostaleKnjigeKojeJeAutorNapisao = ostaleKnjigeKojeJeAutorNapisao;
    }

    public Knjiga(String naziv, int brojStranica, double cena, Autor autor) {
        this.naziv = naziv;
        this.brojStranica = brojStranica;
        this.cena = cena;
        this.autor = autor;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public void setBrojStranica(int brojStranica) {
        this.brojStranica = brojStranica;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Autor getAutor() {
        return autor;
    }

    public ArrayList<Knjiga> getOstaleKnjigeKojeJeAutorNapisao() {
        return ostaleKnjigeKojeJeAutorNapisao;
    }

    public void setOstaleKnjigeKojeJeAutorNapisao(ArrayList<Knjiga> ostaleKnjigeKojeJeAutorNapisao) {
        this.ostaleKnjigeKojeJeAutorNapisao = ostaleKnjigeKojeJeAutorNapisao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" - - ").append(autor).append("\n");
        sb.append("Cena: ").append(cena).append("\n");

        return this.naziv;
    }
}
