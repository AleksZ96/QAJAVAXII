package NedeljaIII.Petak.Vezbanje.Zadatak6;

public class Knjiga {
    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        if(brojStrana < 0 || godinaIzdanja < 0){
            System.out.println("Greska");
            return;
        }
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;

    }
    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        if(brojStrana < 0 || godinaIzdanja < 0){
            System.out.println("Greska");
            return;
        }
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        if(brojStrana < 0){
            System.out.println("Greska");
            return;
        }
        this.brojStrana = brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if(godinaIzdanja < 0){
            System.out.println("Greska");
            return;
        }
        this.godinaIzdanja = godinaIzdanja;
    }

    /*
    napisati i metodu "velicinaKnjige" koja vraca string
		- "mala knjiga" - ako je broj strana od 0 do 100
		- "srednje velika knjiga" - ako je broj strana od 101 do 300
		- "velika knjiga" - ako je broj strana od 301-600
		- "bas velika knjiga" - ako je broj strana 601 i vise
     */

    String velicinaKnjige(){
        if(brojStrana <= 0){
            return "Greska";
        }
        else if(brojStrana <= 100){
            return "Mala knjiga";
        }
        else if (brojStrana <= 300) {
            return "Srednje velika knjiga";
        }
        else if (brojStrana <= 600) {
            return "Velika knjiga";
        }
        else{
            return "Bas velika knjiga";
        }

    }
    /*
    Naziv knjige je: <naziv knjige>
		Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
		Vlasnik knjige je: <ime i prezime vlasnika ako postoji, 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
		Broj strana: <broj strana>
		Godina izdanja: <godina izdanja>
     */

    @Override
    public String toString() {
        if(brojStrana <= 0 || godinaIzdanja <= 0){
            return "Greska";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv knjige je: ").append(nazivKnjige).append("\n");
        sb.append("Autor knjige je: ").append(autor).append("\n");
        sb.append("Vlasnik knjige je: ").append(vlasnik).append("\n");
        sb.append("Broj strana: ").append(brojStrana).append("\n");
        sb.append("Godina izdanja: ").append(godinaIzdanja).append("\n");

        return sb.toString();
    }
}
