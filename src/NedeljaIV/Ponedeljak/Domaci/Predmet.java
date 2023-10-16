package NedeljaIV.Ponedeljak.Domaci;

public class Predmet {
    private int ocena;
    private String nazivPredmeta;

    public Predmet(int ocena, String nazivPredmeta) {
        this.ocena = ocena;
        this.nazivPredmeta = nazivPredmeta;
    }
    public Predmet( String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }


    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ocena: ").append(ocena).append("\n");
        sb.append("Naziv predmeta: ").append(nazivPredmeta).append("\n");
        return sb.toString();
    }
}
