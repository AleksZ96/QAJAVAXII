package NedeljaIII.Petak.Vezbanje.Zadatak10;

public class Film {

    /*
    Napisati klasu Film koja sadrzi atribute:
	- String ime
	- int godinaPremijere (godina kada je film prvi put prikazan; 1888 - 2021) (default = 2021)
	- double ocena (ocena filma, [1.0, 10.0]) (default = 1.0)
	- String sadrzaj (kratak sadrzaj filma)
	- int sati, minuti, sekunde (koliko sati, minuti i sekundi traje film| [0, 10), [0, 59], [0, 59] ) (default = 1, 30, 0)
     */

    private String ime;
    private int godinaPremijere;
    private double ocena;
    private String sadrzaj;
    private int sati, minuti, sekunde;



  //  Napisati konstruktor(e) i proveriti da li su unosi validni. Ako uslovi nisu validni, postaviti ih na default vrednosti.

    public Film(String ime, int godinaPremijere, double ocena, String sadrzaj, int sati, int minuti, int sekunde) {
        this.ime = ime;
        this.setGodinaPremijere(godinaPremijere);
        this.setOcena(ocena);
        this.sadrzaj = sadrzaj;
        this.setSati(sati);
        this.setMinuti(minuti);
        this.sekunde = sekunde;
    }

    public Film() {
        this.godinaPremijere = 2021;
        this.ocena = 1;
        this.sati = 1;
        this.minuti = 30;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaPremijere() {
        return godinaPremijere;
    }

    public void setGodinaPremijere(int godinaPremijere) {
        if(godinaPremijere < 1888 || godinaPremijere > 2021){
            this.godinaPremijere = 2021;
            return;
        }
        this.godinaPremijere = godinaPremijere;
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        if(ocena < 1 || ocena > 10){
            this.ocena = 1;
            return;
        }
        this.ocena = ocena;
    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public int getSati() {
        return sati;
    }

    public void setSati(int sati) {
        if(sati <= 0 || sati > 10){
            this.sati = 1;
            return ;
        }
        this.sati = sati;
    }

    public int getMinuti() {
        return minuti;
    }

    public void setMinuti(int minuti) {
        if(minuti < 0 || minuti >= 59){
            this.minuti = 30;
            return ;
        }
        this.minuti = minuti;
    }

    public int getSekunde() {
        return sekunde;
    }

    public void setSekunde(int sekunde) {
        if(sekunde < 0 || sekunde >= 59){
            this.minuti = 0;
            return ;
        }
        this.sekunde = sekunde;
    }
    /* Napisati toString() metod:
            "{ime} {godinaPremijere} {ocena}
    Duzina trajanja: {sati} : {minuti} : {sekunde}
    {sadrzaj}"

            */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(godinaPremijere).append(" ").append(ocena).append("\n");
        sb.append("Duzina trajanja: ").append(sati).append(" : ").append(minuti).append(" : ").append(sekunde).append("\n");
        sb.append(sadrzaj);
        return sb.toString();
    }
}
