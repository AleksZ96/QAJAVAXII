package NedeljaIII.Utorak;

public class OsobaPonovo {
    private String ime;
    private String prezime;
    private int godine;
    private double visina;


    /*
     * 2 konstruktor:
     * - potpun konstruktor
     * - prazan konstruktor
     *
     *
     * */


    public OsobaPonovo(String ime, String prezime, int godine, double visina) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.visina = visina;
    }

    public OsobaPonovo() {
    }


    /*
     * Getteri i Setteri (metode)
     *
     * Get metode su one metode koje dalje prosledjuju nase enkapsulirane podatke.
     * Set moted su one metode koje omogucavaju drugim klasama da postavljaju nove
     *   vrednosti za nase enkapsulirane podatke.
     *
     * GET:
     * public <tip_enkapsuliranog_podatka> getImeTogPodatka() {
     *   return imeTogPodatka;
     * }
     *
     * SET:
     * public void setImeTogPodatka(<tip_enkapsuliranog_podatka> noviPodatak) {
     *   imeTogPodatka = noviPodatak;
     * }
     *
     *
     * */
    //Ime
    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        ime = novoIme;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        if (visina > 0)
            this.visina = visina;
    }

    public void stari() {
        godine++;
    }

    public void promeniIme(String novoIme) {
        ime = novoIme;
    }

    public void porasti(double visina) {
        this.visina += visina;
    }
}
