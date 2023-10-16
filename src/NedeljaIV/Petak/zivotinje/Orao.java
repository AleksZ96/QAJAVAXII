package NedeljaIV.Petak.zivotinje;

public class Orao implements Pokretljivost {

    private double rasponKrila;

    public Orao(double rk) {rasponKrila = rk;}


    @Override
    public void pokerniSe() {
        System.out.println("Ja letim");
    }

    
}
