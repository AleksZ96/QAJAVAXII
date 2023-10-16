package NedeljaIV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private ArrayList<Predmet> predmeti;
    private int godinaSkolovanja;


    public Ucenik(String ime, ArrayList<Predmet> predmeti, int godinaSkolovanja) {
        this.ime = ime;
        this.predmeti = predmeti;
        this.godinaSkolovanja = godinaSkolovanja;

    }


    public ArrayList<Predmet> getPredmeti() {

        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    public void setGodinaSkolovanja(int godinaSkolovanja) {
        this.godinaSkolovanja = godinaSkolovanja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    double prosek(){
        int sum = 0;
        for(Predmet predmet : predmeti){
            sum += predmet.getOcena();

        }
        return sum/predmeti.size();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ").append(ime).append("\n");
        sb.append("Predmeti: ").append(predmeti).append("\n");
        sb.append("Godina skolovanja: ").append(godinaSkolovanja).append("\n");
        return sb.toString();
    }
}
