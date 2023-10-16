package NedeljaIII.Petak.Vezbanje.Zadatak10;

import java.util.ArrayList;

public class VideoKlub {
    /*
    Napisati klasu VideoKlub koja sadrzi polja:
	- String naziv (naziv video kluba)
	- ArrayList katalog (katalog svig filmova na stanju)
     */
    private String naziv;
    private ArrayList<FilmNaStanju> katalog;

    //Napisati konstruktor(e).

    public VideoKlub(String naziv, ArrayList<FilmNaStanju> katalog) {
        this.naziv = naziv;
        this.katalog = katalog;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<FilmNaStanju> getKatalog() {
        return katalog;
    }

    public void setKatalog(ArrayList<FilmNaStanju> katalog) {
        this.katalog = katalog;
    }

    /*
    Napisati metod iznajmiFilm(Film f) - iznajmljuje jednu kopiju filma f ako je to moguce. Ako nije, ispisati na konzolu poruku:
	"Film {nazivFilma} trenutno nema na stanju".
     */

    void iznajmiFilm(Film f){
        for (FilmNaStanju film : katalog){
            if(f.getIme() == film.getFilm().getIme()) {

                if (film.getKolicina() > 0) {
                    film.setKolicina(film.getKolicina() - 1);
                }
                else {
                    System.out.println("Film" + film.getFilm().getIme() + " trenutno nema na stanju" );
                }
                break;
            }
        }
    }

    /*
    Napisati metod iznajmiFilm(Film f, int n) - iznajmljuje n kopija filma f ako je to moguce. Ako nije moguce iznajmiti sve,
	iznajmiti sto vise kopija datog filma i ispisati poruku:
	"Jos {brojKupacaKojiJosCekaNaIznjamljivanje} kupaca zeli da iznajmi film {nazivFilma}"
	Ako nije moguce iznajmiti ni jedan film ipisati poruku:
	"Film {nazivFilma} trenutno nema na stanju".
     */

    void iznajmiFilm(Film f, int n){
        for (FilmNaStanju film : katalog){
            if(f.getIme() == film.getFilm().getIme()){

                 if (film.getKolicina() >= n) {
                    film.setKolicina(film.getKolicina() - n);
                 }
                else if(film.getKolicina() == 0){
                    System.out.println("Film" + film.getFilm().getIme() + " Trenutno nema na stanju" );
                }

                else if(film.getKolicina() < n) {
                    System.out.println("Jos " + (n - film.getKolicina()) + " kupaca zeli da iznajmi film " + film.getFilm().getIme());
                    film.setKolicina(0);
                }
            }
        }
    }



    //Napisati metod dodajFilm(Film f, double c) - dodaje jednu kopiju filma f u katalog i postavlja mu cenu na c.
    void dodajFilm(Film f, double c){
        for (FilmNaStanju film : katalog) {
            if (f.getIme() == film.getFilm().getIme()) {
                film.setKolicina(film.getKolicina() + 1);
                film.setCena(c);
                break;
            }
        }
    }



    //Napisati metod dodajFilm(Film f, double c, int n) - dodaje n kopija filma f u katalog i postavlja im cenu na c.
    void dodajFilm(Film f, double c, int n){
        for (FilmNaStanju film : katalog) {
            if (f.getIme() == film.getFilm().getIme()) {
                film.setKolicina(film.getKolicina() + n);
                film.setCena(c);
                break;
            }
        }
    }
    /*
    Napisati metod pregledajFilm(Film f) - ispisuje na konozulu:
	"{imeFilma} - {cena} | Na stanju: {kolicina}"
	"{sadrzajFilma}"
	(ili "{imeFilma} | Nema na stanju")
     */

    void pregledajFilm(Film f){
        for (FilmNaStanju film : katalog){
            if(f.getIme() == film.getFilm().getIme()) {
                if(film.getKolicina() == 0){
                    System.out.println(film.getFilm().getIme() + " | Nema na stanju");
                    break;
                }
                else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(film.getFilm().getIme()).append(" - ").append(film.getCena()).append(" | ").append(" Na stanju: ").append(film.getKolicina()).append("\n");
                        sb.append(film.getFilm().getSadrzaj());
                    System.out.println(sb.toString());

                }
            }
        }
    }


    /*
    Napisati metod pregledajKatalog() - ispisuje ceo katalog na konzolu:
	"{imeFilma1} - {cena1} | Na stanju: {kolicina1}"
	.
	.
	.
	"{imeFilmaN} - {cenaN} | Na stanju: {kolicinaN}"
     */

    void pregledajKatalog(){
        for (FilmNaStanju film : katalog){
            StringBuilder sb = new StringBuilder();
            sb.append(film.getFilm().getIme()).append(" - ").append(film.getCena()).append(" | Na stanju: ").append(film.getKolicina()).append("\n");
            System.out.println(sb.toString());
        }
    }

}
