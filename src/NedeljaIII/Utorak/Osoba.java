package NedeljaIII.Utorak;

/*
 * Kreiramo klasu koja opisuje jednu osobu.
 *
 * Svaka osoba ima:
 * - Ime, prezime, pol, godine, tezina, visina
 *
 * Svaka osoba moze da radi:
 * - stari
 * - raste
 * - ugojiti se/smrasti
 * - promeniIme
 *
 *
 *
 * */


public class Osoba {
    //Atributu:
    String ime;
    String prezime;
    boolean pol; //false -> muskarac; true -> zena
    int godine;
    double tezina, visina;


    //Konstruktori
    public Osoba(String zadatoIme, String zadatoPrezime, boolean zadatiPol,
                 int zadateGodine, double zadataTezina, double zadataVisina) {
        //Sustinski popunjavam vrednosti mojih atributra
        ime = zadatoIme;
        prezime = zadatoPrezime;
        pol = zadatiPol;
        godine = zadateGodine;
        tezina = zadataTezina;
        visina = zadataVisina;
    }


    //3.Metode
    //Govore nam kako se atributi nase klase menjaju ...

    void stari() {
        godine++;
    }

    void porasti(double zaKolikoSmoPorasli) {
        visina += zaKolikoSmoPorasli;
    }

    void promeniKilazu(double zaKolikoSmoSeUgojiliIliSmrsali) {
        tezina += zaKolikoSmoSeUgojiliIliSmrsali; //ugojili + | smrasli -
    }

    void promeniIme(String novoIme) {
        ime = novoIme;
    }

}