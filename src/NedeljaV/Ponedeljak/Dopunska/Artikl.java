package NedeljaV.Ponedeljak.Dopunska;

public class Artikl {
    private String naziv;
    private double cenaArtikla;

    public Artikl(String naziv, double cenaArtikla) {
        this.naziv = naziv;
        this.cenaArtikla = cenaArtikla;
    }

    public Artikl() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaArtikla() {
        return cenaArtikla;
    }

    public void setCenaArtikla(double cenaArtikla) {
        this.cenaArtikla = cenaArtikla;
    }

    @Override
    public String toString() {
        return "Artikl{" +
                "naziv='" + naziv + '\'' +
                ", cenaArtikla=" + cenaArtikla +
                '}';
    }
}
