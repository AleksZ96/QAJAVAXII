package NedeljaIII.Petak.Vezbanje.Zadatak11;

import java.util.ArrayList;

public class Pravougaonik {
    /*
    Napisati klasu Pravougaonik koja sadrzi atribute:
- double a //Stranica a
- double b //Stranica b
     */

    private double a;
    private double b;

    /*
    Napisati 2 konstruktora
- Jedan koji prima sve argumenta
- Podrazumevani koji ne prima ni jedan argument

     */

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Pravougaonik() {
    }

    //Napisati gettere i settere za sva polja

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    /*
    Napisati metodu obim() i povrsina() koje vracaju obim i povrsine pravougaonika, redom.
     */

   public double vratiObimPravougaonika(){
        double obim = 2 * (a + b);
        return obim;
    }
    public double vratiPovrsinuPravougaonika(){
        double povrsina = a * b;
        return povrsina;
    }

    //Dva pravougaonika su ista ako imaju iste stranice.
    boolean daLiSuPravougaoniciIsti(double a1, double b1, double a2, double b2){
        if((a1 == a2 || a1 == b2) && (b1 == a2 || b1 == b2)){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pravougaonik stranica").append(a).append(" i ").append(b).append("\n");
        sb.append("Obim: ").append(vratiObimPravougaonika()).append("\n");
        sb.append("Povrsina: ").append(vratiPovrsinuPravougaonika()).append("\n");
        return sb.toString();
    }

}
