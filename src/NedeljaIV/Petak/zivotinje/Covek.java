package NedeljaIV.Petak.zivotinje;

public class Covek implements Pokretljivost {

    private String ime, preime;
    private int brGodina;

    public Covek(String ime, String prezime, int brGodina) {
        this.ime = ime;
        this.preime = prezime;
        this.brGodina = brGodina;
    }

    @Override
    public void pokerniSe() {
        System.out.println("Ja hodam");
    }


    
}
