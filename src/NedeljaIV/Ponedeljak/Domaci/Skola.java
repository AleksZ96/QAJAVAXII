package NedeljaIV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Skola {
    /*
    -Klasa Skola ima listu Ucenika, napraviti metode:
            *koja za prosledjenu godinu skolovanja vraca prosek svih ucenika koji su u toj godini.
            * za prosledjeni predmet vraca prosek svih ucenika koji taj predmet pohadjaju
* vraca Ucenika sa najmanjim prosekom
     */


    private ArrayList<Ucenik> listaUcenika;

    public Skola(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }

    public ArrayList<Ucenik> getListaUcenika() {
        return listaUcenika;
    }

    public void setListaUcenika(ArrayList<Ucenik> listaUcenika) {
        this.listaUcenika = listaUcenika;
    }

    double vratiProsekSvihUcenikaUGodini(int godinaSkolovanja){
        double sum = 0;
        ArrayList<Ucenik> a = new ArrayList<>();
        for (Ucenik ucenik : listaUcenika){
            if(ucenik.getGodinaSkolovanja() == godinaSkolovanja){
                a.add(ucenik);
            }

        }
        for (Ucenik ucenik : a){
            sum += ucenik.prosek();
        }
        return sum/a.size();
    }

    double vratiProsekSvihUcenikaKojiSlusajuPredmet(Predmet predmet){
        double sum = 0;
        ArrayList<Ucenik> a = new ArrayList<>();
        for (Ucenik ucenik : listaUcenika){
            for(Predmet predmetx : ucenik.getPredmeti()){
                if(predmetx.getNazivPredmeta().equals(predmet.getNazivPredmeta())){
                    a.add(ucenik);
                    break;
                }
            }
        }
        for (Ucenik ucenik : a){
            sum += ucenik.prosek();
        }
        return sum/a.size();
    }

    Ucenik vratiUcenikaSaNajmanjimProsekom(){
        Ucenik min = listaUcenika.get(0);
        for(Ucenik ucenik : listaUcenika){
            if(min.prosek() > ucenik.prosek()){
                min = ucenik;
            }
        }
        return min;
    }


}
