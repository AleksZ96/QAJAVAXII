package NedeljaIV.Petak.poredjenjeObjekata;

public class Covek {
    private String ime, prezime;
    private int brojGodina;

    public Covek(String i, String p, int brG) {
        ime = i;
        prezime = p;
        brojGodina = brG;
    }

    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public int getBrojGodina() {
        return brojGodina;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }



    /*
     * HashCode
     * 
     * Hash funkcija je bilo koja funkcija koja slika neki skup u neki broj (String)
     * 
     * Hash funkcije bi trebalo da budu:
     * - Jako brze za izracunavnanje
     * - Da budu "1-1", tj. da razliciti hashCodivi odgovaraju razlicitim originalima (objektima)
     * - Da ne budu invertibilni, tj. da iz hashCoda ne mozemo da prikupimo informacije o objektu
     * 
     * - Hash funkcije uglavnom NISU "1-1" i tada dolazi do hash kolizija ...
     * 
     * Posledica:
     * 
     * 
     * 
     * 
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    //Ova metoda vraca odogovor na pitanje da li je prosledjen objekat jednak ovom nasem
    @Override
    public boolean equals(Object o) {
        if (this == o) // da li dele isti memorijski prostor
            return true;


        if (!(o instanceof Covek)) //Ako objekat o nije instanca klase Covek onda nisu isti
            return false;

        //Znamo da je objekat o instanca klase Cove, tako da mozemo da ga kastujemo
        Covek c = ((Covek) o);
        if (ime.equals(c.getIme()) && prezime.equals(c.getPrezime()) && brojGodina == c.getBrojGodina())
            return true;
        return false;
    }




    
}
