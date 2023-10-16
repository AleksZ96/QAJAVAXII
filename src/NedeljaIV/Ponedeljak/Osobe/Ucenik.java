package NedeljaIV.Ponedeljak.Osobe;

public class Ucenik {
    /*
     * - String ime;
     * - String prezime;
     * - int brojGodina;
     * - double prosek;
     *
     * - toString():
     * "<ime> <prezime>\n
     *  broj godina: <brojGodina>\n
     *  prosek: <prosek>"
     *
     * */
    private String ime;
    private String prezime;
    private int brojGodina;
    private double prosek;

    public Ucenik(String ime, String prezime, int brojGodina, double Prosek){
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        this.prosek = prosek;
    }

    public Ucenik() {
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

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        if(prosek >= 1.0 && prosek <= 5.0)
        this.prosek = prosek;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append("\n");
        sb.append("Broj godina:").append(brojGodina).append("\n");
        sb.append("Prosek: ").append(prosek);
        return sb.toString();
    }
}
