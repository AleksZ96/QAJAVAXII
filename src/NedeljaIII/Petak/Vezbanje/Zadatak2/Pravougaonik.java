package NedeljaIII.Petak.Vezbanje.Zadatak2;

public class Pravougaonik {
    //2. Napisati klasu Pravougaonik koja ima atribute:
    //- double sirina
    //- double visina
    //Obezbediti konstruktor koji prima argumente za oba atributa i gettere i settere za svaki.
    //Napisati metode:
    //- obim : vraca obim pravougaonika
    //- povrsina : vraca povrsinu pravougaonika
    //Napisati toString() metod koji ispisuje Pravougaonik na sledeci nacin:
    //Pravougaonik sirine {sirina} i visine {visina} ima:
    //Obim: {obim},
    //Povrsinu: {povrsinu}
    private double sirina;
    private double visina;

    public Pravougaonik(double sirina, double visina){
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

     double vratiObimPravougaonika(){
        double obimPravougaonika =2 * (sirina + visina);
        return obimPravougaonika;
    }
     double vratiPovrsinuPravougaonika(){
        double povrsinaPravougaonika = sirina * visina;
        return povrsinaPravougaonika;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pravougaonik sirine ").append(sirina).append(" i visine ").append(visina).append(" ima: ").append("\n");
        sb.append("Obim: ").append(vratiObimPravougaonika()).append("\n");
        sb.append("Povrsinu: ").append(vratiPovrsinuPravougaonika()).append("\n");
        return sb.toString();
    }
}
