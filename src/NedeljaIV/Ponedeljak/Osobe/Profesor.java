package NedeljaIV.Ponedeljak.Osobe;

public class Profesor {
    /*
     * Svaki profesor ima:
     * - String ime;
     * - String prezime;
     * - int brojGodina;
     * - double plata;
     *
     * - toString():
     * "<ime> <prezime>\n
     *  broj godina: <brojGodina>\n
     *  plata: <plata>"
     *
     *
     * */
    private String ime;
    private String prezime;
    private int brojGodina;
    private double plata;

    public Profesor(String ime, String prezime, int brojGodina, double plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        this.plata = plata;

    }

    public Profesor() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime!= null && !ime.isBlank())
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        if(prezime!= null && !prezime.isBlank())
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        if(brojGodina >= 0);
        this.brojGodina = brojGodina;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        if(plata >= 0);
        this.plata = plata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append("\n");
        sb.append("Broj godina:").append(brojGodina).append("\n");
        sb.append("Plata: ").append(plata);
        return sb.toString();
    }
}
