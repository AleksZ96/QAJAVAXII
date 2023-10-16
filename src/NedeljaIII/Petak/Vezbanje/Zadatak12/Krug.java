package NedeljaIII.Petak.Vezbanje.Zadatak12;

public class Krug extends Elipsa{

    /*
    Napisati 2 konstruktora:
- Jedan konstruktor koji prima double r i poziva odgovarajuci konstruktor natklase
- Jedan podrazumevani konstruktor


     */
    public Krug(double a, double b) {
        super(a, b);
    }
    public Krug(double r) {
        super(r, r);
    }

    double vratiObimKruga(){
        double obim = Math.PI * 2 * getA();
        return obim;
    }
    /*
    Overridovati toString() metod tako da vraca nisku oblika:
"Elipsa poluprecnika <r> ima
 Obim: <obim>
 Povrsinu: <povrsina>
 Ekscentritet: <eskcentritet>"
         */


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elipsa poluprecnika ").append(getA()).append(" ima ").append("\n");
        sb.append("Obim: ").append(vratiObimKruga()).append("\n");
        sb.append("Povrsinu: ").append(vratiPovrsinuElipse()).append("\n");
        sb.append("Ekscentricitet: ").append(vratiEkscentricitetElipse()).append("\n");
        return sb.toString();
    }


}
