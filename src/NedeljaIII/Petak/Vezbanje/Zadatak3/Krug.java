package NedeljaIII.Petak.Vezbanje.Zadatak3;

public class Krug {
    //3. Napisati klasu Krug koja ima atribute:
    //- double poluprecnik
    //Obezbediti konstruktor koji prima vrednost za poluprecnik.
    //Obezbediti getter i setter za atribut poluprecnik.
    //Napisati metode:
    //- obim : vraca obim kruga
    //- povrsina : vraca povrsinu kruga
    //Koristiti Math Java biblioteku (Math.PI za konstantu pi)

    private double poluprecnik;

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }
    //obim kruga je 2 *r *pi
    //povrsina kruga je r na kvadrat pi

     double vratiObimKruga(){
        double obimKruga = Math.PI * poluprecnik * 2;
        return obimKruga;
    }

     double vratiPovrsinuKruga(){
        double povrsinaKruga = Math.PI * Math.pow(poluprecnik, 2);
        return povrsinaKruga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obim kruga za poluprecnik ").append(poluprecnik).append(" je:").append(vratiObimKruga()).append("\n");
        sb.append("Povrsina kruga za poluprecnik ").append(poluprecnik).append(" je:").append(vratiPovrsinuKruga()).append("\n");
        return sb.toString();
    }
}
