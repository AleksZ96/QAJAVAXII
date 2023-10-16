package NedeljaIV.Petak.zivotinje;

public class Pas implements Pokretljivost {
    private String ime;

    public Pas(String ime) { 
        this.ime = ime; 
    }

    @Override
    public void pokerniSe() {
        System.out.println("Ja trcim");
    }

}
