package NedeljaIV.Ponedeljak.Knjizara;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Stefani", "Majer", 45);
        Autor autor2 = new Autor("Dzejn", "Ostin", 35);
        Knjiga knjiga1 = new Knjiga("Sumrak", 354, 1500, autor1);
        Knjiga knjiga2 = new Knjiga("Gordost i predrasude", 250, 1500, autor2);
        Knjiga knjiga3 = new Knjiga("Pomracenje", 350, 2000, autor1);
        Knjiga knjiga4 = new Knjiga("Ema", 300, 1500, autor2);

        ArrayList<Knjiga> knjige = new ArrayList<>();
        knjige.add(knjiga1);
        knjige.add(knjiga2);
        knjige.add(knjiga3);
        knjige.add(knjiga4);

        ArrayList<Osoba> zaposleni = new ArrayList<>();
        zaposleni.add(new Osoba("Aleksandra", "Zivkovic", 27));
        zaposleni.add(new Osoba("Marija", "Drocic", 27));
        zaposleni.add(new Osoba("Bojana", "Milic", 28));

        ArrayList<Autor> autori = new ArrayList<>();
        autori.add(autor1);
        autori.add(autor2);

        Knjizara knjizara = new Knjizara(knjige, zaposleni, autori);
        System.out.println(knjizara.ukupnaCena());

        System.out.println(knjizara.knjigeOdAutora(autor2));



    }
}
