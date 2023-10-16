package NedeljaIII.Utorak;

/*
 *
 * Ucenik:
 * -Atribut: String ime, String prezime, int[] ocene, double prosek;
 *
 * - Metode: ispisati sve ocene ucenika, ispisati prosek ucenika, ispisati kakav je ucenik djak ...
 *
 *
 * */

public class Ucenik {
    String ime;
    String prezime;
    int[] ocene;
    double prosek;


    /*
     * Kljucna rec this se odnosi na objekat klase
     *
     * kljucna rec this ne mora da se koristi kada java zna tacno na koju se promenjiv neka komanda odnosi (ali moze)
     * Kljucna rec this mora da se koristi kada java ne zna tacno na koju se promenjiv neka komanda odnosi
     *
     * */

    //Pomocna metoda koja racuna prosek NEKOG niza ocena
    double izracunajProsek(int[] ocene) {
        int sum = 0;
        for (int o : ocene) {
            if (o == 1)
                return 1;
            sum += o;
        }
        return (double) sum / ocene.length;
    }

    public Ucenik(String ime, String prezime, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
        this.prosek = izracunajProsek(ocene);
    }



    /*
     * Podrazumevani (Default) konstruktor:
     * - Konstruktor koji ne prima ni jedan argument i sve atribute postavlja na neke inicijalne vrednosti
     *
     *
     * Java kada kreiramo neku klasu u pozadini sama napravi podrazumevani konstruktor,
     * ali taj konstruktor "unisti" cim mi sami definisemo barem jedan (bilo kakav) nas konstruktor.
     * */
    public Ucenik() {
        ime = "qwe"; //ime = ""
        prezime = ""; // prezime = ""
        prosek = 1.0; //prosek = 0.0
        ocene = null;
    }


    /*
     * Ako ne navedem eksplicitno vrednosti za atribute, svi atributi ce dobiti podrazumevane vrednosti
     *
     * prosti tipovi:
     * int -> 0
     * double -> 0.0
     * char -> '\u0000'
     * boolean -> false
     * String -> ""
     *
     * objektni tipovi:
     * null
     *
     *
     * */

    void ispisiSveOcene() {
        for (int o : ocene) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    void ispisatiProsek() {
        System.out.println(prosek);
    }

    void ispisKakavJeDjak() {
        if (prosek < 2.0)
            System.out.println("Nedovoljan");
        else if (prosek < 2.5)
            System.out.println("Dovoljan");
        else if (prosek < 3.5)
            System.out.println("Dobar");
        else if (prosek < 4.5)
            System.out.println("Vrlo dobar");
        else
            System.out.println("Odlican");
    }
}
