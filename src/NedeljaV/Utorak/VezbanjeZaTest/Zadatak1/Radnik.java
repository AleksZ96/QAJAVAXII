package NedeljaV.Utorak.VezbanjeZaTest.Zadatak1;

public class Radnik extends Osoba {
//Napisati klasu Radnik koja prosiruje klasu Osoba i ima atribute:
//- int id
//- double plata
    private static int ID = 0;

    private int id;
    private double plata;

    /*
    Zagarantovati da svaki Radnik ima svoj jedinstveni id broj!

Napisati za svaki nadkonstrukor jedan konstruktor koji prima double platu. Uzeti da je podrazumevana plata 0.0

Enkapsulirati sve podatke i napisati gettere i settere za sva polja
     */

    public Radnik(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
        id = ID;
        ID++;
        this.plata = plata;
    }
    public Radnik(double plata) {
        id = ID;
        ID++;
        this.plata = plata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    //Ovveridovati metode:
    //- public boolean jednaki(Osoba o) // Vraca true ako je prosledjena osoba ista kao ovaj (this) radnik.
    // Ovaj radnik je isti kao Osoba o ako je o instanca klase Radnik i ako imaju isti id.

    @Override
    public boolean jednaki(Osoba o) {
        Radnik r = (Radnik) o;
        if (this.id == ((Radnik) o).id) {
            return true;
        }
        return false;
    }
        /*
        if(!(o instanceof Radnik)) return false;
        Radnik r = (Radnik) o;
        return this.id == r.id;
        }
         */


        //Serilizovati klasu na sledeci nacin:
        //"<ime> <prezime> (<brojGodina>) [<id>]"


        @Override
        public String toString () {
            // StringBuilder sb = new StringBuilder();
            // sb.append(getIme()).append(" ").append(getPrezime()).append(" ").append(getBrojGodina()).append(" ").append(id).append("\n");
            return super.toString() + " [" + id + "]";
        }

}
