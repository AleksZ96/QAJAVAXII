package NedeljaIII.Petak.Vezbanje.Zadatak9;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    // Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.


    public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
        ocene = new ArrayList<>();
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        ocene = new ArrayList<>();
    }

    // Napisati gettere i settere za sva polja.


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(ArrayList<Integer> ocene) {
        this.ocene = ocene;
    }

    //Napisati metod proske koji racuna prosek Ucenika.

    double prosek(){
        double sum = 0;
        for (Integer ocena : ocene){
            if(ocena == 1){
                return 1;
            }
            sum += ocena;
        }

        return sum / ocene.size();
    }

    // Napisati toString() metod:
    //        {ime} i {prezime} ima ocene:
    //        {ocene}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" i ").append(prezime).append("\n");
        sb.append(ocene);
        return sb.toString();
    }
}
