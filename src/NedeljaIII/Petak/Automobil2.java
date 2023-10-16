package NedeljaIII.Petak;

public class Automobil2 {

    /*
     * Hocemo da kreiramo klasu koja opisuje automobile.
     * Svaki automobil ima:
     * -String marku
     * -String tip
     * -char boja {'g' = green, 'b' = blue ...}
     * -int brojSedista
     * -int brojSasije.
     * -double kubikaza
     *
     * -Kreirati 2 konstruktora
     * Jedan potpun koji prima sve argumente za atribute
     * Jedan prazan koji postavlja sve atribute na podrazumevane vrednosti
     *
     * -Enkapsulirati svaki atribut i za svaki atribut kreirati (obicne) gettere i setter
     *
     * -Napisati metode:
     * 1. public String informacija() - vraca informacije o automobilu
     * 2. public boolean daLiSuIsti(Automobil b) - vraca informaciju da li je prosledjen
     * automobil isti kao i objekat automobila koji poziva ovu metodu.
     * Dva automobila su ista akko imaju sve atribute.
     *
     * */

    private String marka;
    private String tip;
    private char boja;
    private int brojSedista;
    private int brojSasije;
    private double kubikaza;

    private static int brojObjekataOveKalse = 0; //Ovo nije atribut (polje) objekata ove klase

    /*static {
        int x = 2;
        int y = 3;
        double nestoCudno = Math.log(x) / Math.log(y);
        brojObjekataOveKalse = (int)nestoCudno + 2;
    }*/


    public Automobil2(String marka, String tip, char boja, int brojSedista, double kubikaza) {
        brojObjekataOveKalse++;

        this.marka = marka;
        this.tip = tip;
        this.boja = boja;
        this.brojSedista = brojSedista;
        this.brojSasije = brojObjekataOveKalse;
        this.kubikaza = kubikaza;
    }

    public Automobil2() {
        //Java automatski postavlja primitivnim vrednostima i Stringu podrazumevane vrednosti
        //(a sve objekte postavja na null)
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public char getBoja() {
        return boja;
    }

    public void setBoja(char boja) {
        this.boja = boja;
    }

    public int getBrojSedista() {
        return brojSedista;
    }

    public void setBrojSedista(int brojSedista) {
        this.brojSedista = brojSedista;
    }

    public int getBrojSasije() {
        return brojSasije;
    }

    public void setBrojSasije(int brojSasije) {
        this.brojSasije = brojSasije;
    }

    public double getKubikaza() {
        return kubikaza;
    }

    public void setKubikaza(double kubikaza) {
        this.kubikaza = kubikaza;
    }

    public static int getBrojObjekataOveKalse() {
        return brojObjekataOveKalse;
    }

    public static void setBrojObjekataOveKalse(int brojObjekataOveKalse) {
        Automobil2.brojObjekataOveKalse = brojObjekataOveKalse;
    }

    /*
     * * -Napisati metode:
     * 1. public String informacija() - vraca informacije o automobilu
     * 2. public boolean daLiSuIsti(Automobil a) - vraca informaciju da li je prosledjen
     * automobil isti kao i objekat automobila koji poziva ovu metodu.
     * Dva automobila su ista akko imaju sve atribute.
     *
     * */


    /*
     * StringBuilder je klasa
     * koju koristimo kada zelimo
     * dinamicki da kreiramo nisku
     *
     * Objekat klase StringBuilder interno sadrzi Nisku koju
     * mi kreiramo preko metoda koje pozivamo nad objektom klase.
     *
     * .append(E e) <- nadovezuje podatak e na nisku koja je sadrzana u tom objektu
     *
     * StringBuilder je optimizovan za kreaciju niski (concatenaciju jedne niske na drugu)
     *
     * .toString() <- metoda koja vraca kreiran string iz StringBuildera
     * */


    /*
     * Serilizacija - postupak kreiranja Stringa od objekata neke klase
     *
     * public String toString() <- ugradjena funkcija za serilizaciju
     * */

    /*
     *
     * Annotacije - pomazu linkeru prilikom kompilacije programa
     *
     * */

    /*
     * Overloading - (Preopterecivanje) postupak pisanja vise metoda sa razilictim argumentima/povratom vrednoscu
     *
     * Overriding - (Prepisivanje) (redefinisanje) postupak ponovnog definisanja metode
     *
     * Podsetite me da se vratim na toString() u ponedeljak
     *
     * */

    @Override //Annotacija
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Na pocetku je sb prazan String ""
        sb.append("Marka: ").append(marka).append("\n");
        sb.append("Tip: ").append(tip).append("\n");
        sb.append("Boja: ").append(boja).append("\n");
        sb.append("Broj sedista: ").append(brojSedista).append("\n");
        sb.append("Broj sasije: ").append(brojSasije).append("\n");
        sb.append("Kubikaza: ").append(kubikaza).append("\n");

        return sb.toString();
    }
    //JSON - JavaScript Object Notation

    public boolean daLiSuIsti(Automobil a) {
        //Poredim svaki par atributa
        //poredim atribute od proslednjog automobila a sa this-om
        if (!this.marka.equalsIgnoreCase(a.getMarka()))
            return false;
        if (!this.tip.equalsIgnoreCase(a.getTip()))
            return false;
        if (this.boja != a.getBoja())
            return false;
        if (this.brojSedista != a.getBrojSedista())
            return false;
        if (this.brojSasije != a.getBrojSasije())
            return false;
        if (kubikaza != a.getKubikaza()) //nisam morao da koristim this uopste
            return false;
        return true;

        /*
         * Nismo morali da pisemo this.
         * jer java zna da su ovi atributi iz objekata nad kojim
         * pozivamo metodu jer su enkapsulirani i samo on moze da ih
         * vidi (tj. ne moze da direktno dobije atribute iz prosledjenog automobila)
         *
         * */
    }
}
