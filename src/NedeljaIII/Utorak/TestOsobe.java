package NedeljaIII.Utorak;

public class TestOsobe {

    public static void main(String[] args) {
        //Kreiram objekte klase Osoba - instance klase Osoba (konkretan primerak osobe)
        /*
         * Kreacija objekata:
         * <Klasa_ciji_objekat_kreiramo> <identifikator> = new <poziv_konstruktora>;
         * tj.
         * <Klasa_ciji_objekat_kreiramo> <identifikator> = new <imeKlase>(<argumenti>);
         *
         *
         * */

        Osoba strahinjaTrninic = new Osoba("Strahinja", "Trninic", false,
                26, 88.2, 180.3);

        //strahinjaTrninic je OBJEKAT KLASE Osoba (tj. jedna instanca klase Osoba)
//                                                  [tj. jedan primerak klase Osoba]

        Osoba jelenaBegovic = new Osoba("Jelena", "Begovic", true,
                24, 40, 168);

        //jelenaBegovic je neki novi objekat klase Osoba (drugaciji od strahinjaTrninic).

        //Kako pristupamo podacima "iz klase" (tacnije podacima tih objekata)
        /*
         * identifikator.<element_kome_zelimo_da_pristupimo>
         *
         * */

        System.out.println("Strahinja Trninic ima broj godina: " + strahinjaTrninic.godine); //pristupanje atributima
        System.out.println(jelenaBegovic.ime + " " + jelenaBegovic.prezime + " ima broj godina: " + jelenaBegovic.godine);

        //pristupanje metoda
        strahinjaTrninic.stari();// pristupanje metodama
        System.out.println("Strahinja Trninic ima broj godina: " + strahinjaTrninic.godine);
        strahinjaTrninic.stari();
        strahinjaTrninic.stari();
        System.out.println("Strahinja Trninic ima broj godina: " + strahinjaTrninic.godine);


        System.out.println("\n==================\n");
        System.out.println("Strahinja Trninic je tezak: " + strahinjaTrninic.tezina + "kg");
        //strahinjaTrninic se ugojio 12 kg
        strahinjaTrninic.promeniKilazu(12);
        System.out.println("Strahinja Trninic je tezak: " + strahinjaTrninic.tezina + "kg");
        // ... je smrsao 2.2kg
        strahinjaTrninic.promeniKilazu(-2.2);
        System.out.println("Strahinja Trninic je tezak: " + strahinjaTrninic.tezina + "kg");


    }
}
