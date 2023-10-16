package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

import java.util.ArrayList;
import java.util.List;

public abstract class UgostiteljskiObjekat implements Ugostiteljstvo {
    /*
    Napisati abstraktnu klasu UgostiteljskiObjekat koji implementira interfejs Ugostljivo i ima naredne metode:
- String naziv
- List<Radnik> radnici
     */

    private String naziv;
    private ArrayList<Radnik> radnici;

    /*
    Napisati konstruktore:
- Jedan potpun konstruktor koji prima sve argumente
- Jedan konstruktor koji prima String naziv a radnike postavlja na novu praznu ArrayList-u
- Jedan konstruktor koji prima Listu radnika a naziv postavlja na prazan String

Enkapsulirati sve podatke i napisati gettere i settere za sva polja
     */

    public UgostiteljskiObjekat(String naziv, ArrayList<Radnik> radnici) {
        this.naziv = naziv;
        this.radnici = radnici;
    }

    public UgostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        radnici = new ArrayList<>();
    }

    public UgostiteljskiObjekat(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
        naziv = "";
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    /*
    Napisati metode:
- public String ispisiRadnike() //Za svakog radnika vrsi njegovu serilizaciju. Serilizaciju svakog radnika vrsiti u novom redu po principu:
"<Serilizacija 1. radnika>
 <Serilizacija 2. radnika>
 ....
 <Serilizacija N. radnika>"
     */
    public String ispisiRadnike(){
        StringBuilder sb= new StringBuilder();
        for (Radnik radnik : radnici){
            sb.append(radnik.toString()).append("\n");
           // sb.append(radnik.getIme()).append(" ").append(radnik.getPrezime()).append(" ").append(radnik.getBrojGodina()).append(" ").append(radnik.getId()).append("\n");
        }
        return sb.toString();
    }

    //- public double ukupnaPlata() //Vraca ukupnu platu svih svojih radnika

    public double ukupnaPlata(){
        double sumaPlata = 0;
        for (Radnik radnik : radnici){
            sumaPlata += radnik.getPlata();
        }
        return sumaPlata;
    }

    //Napisati abstraktne metode:
    //- public abstract double bruto(); //Vraca bruto zaradu UgostiteljskogObjekta
    public abstract double bruto();

    //- public abstract double neto(); //Vraca neto zaradu UgostiteljskogObjekta
    public abstract double neto();

    //Serilizovati klasu na sledeci nacin:
    //"<naziv> | brojZaposlenih: <brojZaposlenihRadnika>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append(" | Broj zaposlenih: ").append(radnici.size()).append("\n");
        return sb.toString();
    }
}
