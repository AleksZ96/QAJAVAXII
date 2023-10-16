package NedeljaIII.Petak.Vezbanje.Zadatak9;

import java.util.ArrayList;

public class Odeljenje {

    // Napisati klasu Odeljenje koja ima sledeca polja:
    //        - String oznaka
    //                - ArrayList dnevnik
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    // Napisati 2 konstruktora, opet na isti nacin.
    //                Napisati gettere i settere za sva polja.

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }
    // Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.

    void upisiUcenika(Ucenik u){
        dnevnik.add(u);
    }

    // Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}

    void upisiUcenika(Ucenik u, int redniBroj){
        dnevnik.add(redniBroj, u);
    }

    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.

    void ispisiUcenika(Ucenik u){
        dnevnik.remove(u);
    }

    // Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.

    void ispisiUcenika(int i){
            dnevnik.remove(i);
    }

    // Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.

    void pogledajOcene(Ucenik u){
        for(Ucenik ucenik : dnevnik){
            if (u == ucenik){
                System.out.println(ucenik.getOcene());
                return;
            }
        }
    }

    //        Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    void pogledajOcene(int i){
        Ucenik u = dnevnik.get(i);
        if (u != null){
                System.out.println(u.getOcene());
            }
    }


    //        Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.

    double prosecnaOcena(Ucenik u){
        double prosek = 0;
        for ( Ucenik ucenik : dnevnik){
            if(u == ucenik){
                prosek = ucenik.prosek();
                break;
            }
        }
        return prosek ;
    }


    //        Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    double prosecnaOcena(int i){
        Ucenik u = dnevnik.get(i);

        return u.prosek();
    }


    //        Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).

    double prosecnaOcenaOdeljenja(){
        double sum = 0;
        for(Ucenik ucenik : dnevnik) {
            sum += ucenik.prosek();

        }
        return sum / dnevnik.size();
    }


    //        Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    //        - "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
    //        - "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
    //        - "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
    //        - "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
    //        - "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu

    void opisnaOcena(Ucenik u){
        for (Ucenik ucenik : dnevnik) {
            if (ucenik == u) {
                if (u.prosek() > 4.5 && u.prosek() <= 5) {
                    System.out.println("Odlican");
                } else if (u.prosek() >= 3.5) {
                    System.out.println("Vrlo dobar");
                } else if (u.prosek() >= 2.5) {
                    System.out.println("Dobar");
                } else if ((u.prosek() >= 1.5)) {
                    System.out.println("Dovoljan");
                } else {
                    System.out.println("Nedovoljan");
                }
                return;
            }
        }

    }

    //        Napisati metod izlistajDnevnik() koja vraca String oblika:
    //        {ime} i {prezime} ima ocene:
    //        {ocene}
    //        za sve ucenike.

    String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik : dnevnik){
           sb.append(ucenik).append("\n");

        }
        return sb.toString();
    }



    //                Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //                - "Veliko odeljenje"; ako ima vise od 25 ucenika
    //                - "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //                - "Malo odeljenje"; ako ima ucenika manje od 15

    void velicinaOdeljenja(){
        if( dnevnik.size() > 25){
            System.out.println("Veliko odeljenje");
        } else if (dnevnik.size() > 15) {
            System.out.println("Srednje odeljenje");
        } else {
            System.out.println("Malo odeljenje");
        }
    }


    //        Napisati toString() metod:
    //        {Oznaka} odeljenja ima djake:
    //        {Ime1} {Prezime1}
    //        {Ime2} {Prezime2}
    //	.
    //	.
    //	.
    //        {ImeN} {PrezimeN}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka).append(" odeljenja ima djake: ").append("\n");
        for (Ucenik ucenik : dnevnik) {
            sb.append(ucenik.getIme()).append(" ").append(ucenik.getPrezime());
        }
        return sb.toString();
    }
}
