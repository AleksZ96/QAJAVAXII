package NedeljaIII.Petak.Vezbanje.Zadatak6;

public class Osoba {
    /*
     * Svaka osoba ima:
     * - String ime;
     * - String prezime;
     * - int brojGodina;
     *
     * toString():
     * "<ime> <prezime>\n
     * "broj godina: <brojGodina>"
     *
     * */
    private String ime;
    private String prezime;
    private int brojGodina;

    public Osoba(String ime, String prezime, int brojGodina){
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
    }
/*
    public Osoba() {
    }

 */

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime!= null && !ime.equalsIgnoreCase(""))
            this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        if(brojGodina >= 0);
        this.brojGodina = brojGodina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append("\n");
        sb.append("Broj godina:").append(brojGodina);
        return sb.toString();
    }
}