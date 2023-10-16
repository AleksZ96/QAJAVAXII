package NedeljaIII.Petak.Vezbanje.Zadatak11;

public class Kvadrat extends Pravougaonik{

    /*
    Napisati 2 konstruktora
- Jedan konstruktor koji prima double a i poziva prvi konstruktor iz natklase
- Podrazumevani konstruktor koji poziva podrazumevani konstruktor natklase.
     */

    public Kvadrat(double a)
    {
        super(a, a);
    }

    public Kvadrat(double a, double b)
    {
        super(a, a);
    }

    /*
    Overridovati toString() metod natklase tako da vraca nisku oblika:
"Kvadrat strainca <a> i <b>
 Obim: <obim>
 Povrsina: <povrsina>"
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Kvadrat stranica: ").append(getA()).append(" i ").append(getB()).append("\n");
        sb.append("Obim: ").append(vratiObimPravougaonika()).append("\n");
        sb.append("Povrsina: ").append(vratiPovrsinuPravougaonika()).append("\n");
        return sb.toString();
    }
}
