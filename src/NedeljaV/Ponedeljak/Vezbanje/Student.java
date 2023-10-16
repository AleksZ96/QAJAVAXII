package NedeljaV.Ponedeljak.Vezbanje;

import java.util.ArrayList;

public class Student {
    /*
    Kreirati Klasu Student koja ima sledece parametre:
-(String) Ime
-(List<Integer>) Listu ocena
-(int) Trenutnu godinu studiranja
     */
    private String ime;
    private ArrayList<Integer> listaOcena;
    private int trenutnaGodinaStudiranja;

    public Student(String ime, ArrayList<Integer> listaOcena, int trenutnaGodinaStudiranja) {
        this.ime = ime;
        this.listaOcena = listaOcena;
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    public Student(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getTrenutnaGodinaStudiranja() {
        return trenutnaGodinaStudiranja;
    }

    public void setTrenutnaGodinaStudiranja(int trenutnaGodinaStudiranja) {
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    //Takodje poseduje metodu prosek() koja vraca prosek svih njegovih ocena;

    double prosek(){
        double sum = 0;
        for (Integer ocena : listaOcena){
            sum += ocena;
        }
        return sum / listaOcena.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ").append(ime).append("\n");
        sb.append("Lista ocena: ").append(listaOcena).append("\n");
        sb.append("Godina studiranja: ").append(trenutnaGodinaStudiranja).append("\n");
        return sb.toString();
    }
}
