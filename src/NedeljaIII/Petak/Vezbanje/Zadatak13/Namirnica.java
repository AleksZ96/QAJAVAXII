package NedeljaIII.Petak.Vezbanje.Zadatak13;

public class Namirnica {
    /*
    Napisati klasu Namirnica koja ima atribute
- String ime
- double cena
     */
    private String ime;
    private double cena;

    //Napisati 2 konstruktora:
    //- Jedan koji prima sve argumente.
    // Ukoliko primi null za ime, postaviti ga na prazan string.
    // Ukoliko primi negativnu vrednost za cenu postaviti je na 0.
    //- Podrazumevani konstruktor koji ne prima ni jedan argument i postavlja atribute na "" i 0

    public Namirnica(String ime, double cena) {
        if(ime == null){
            ime = "";
        }
        this.ime = ime;
        if(cena < 0){
            cena = 0;
        }
        this.cena = cena;
    }

    public Namirnica() {
        ime = "";
        cena = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        if(ime == null){
            ime = "";
        }
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena < 0){
            cena = 0;
        }
        this.cena = cena;
    }

    //Dve namirnice su iste ako imaju isto ime i istu cenu.

    boolean daLiSuNamirniceISte(Namirnica a){
        return this.ime == a.ime && this.cena == a.cena;
    }

  /*  Overridovati toString() metod na sledeci nacin:
            "<ime> | <cena>"

   */

    @Override
    public String toString() {
        return ime + " | " + cena + "\n";
    }
}
