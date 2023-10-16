package NedeljaIV.Petak.Domaci;

import java.util.ArrayList;

public abstract class Automobil {
    private ArrayList<Tocak> listaTockova;
    private int godisteAutomobila;
    private double cena;



    public Automobil(ArrayList<Tocak> listaTockova, int godisteAutomobila, double cena) {
        this.listaTockova = listaTockova;
        this.godisteAutomobila = godisteAutomobila;
        this.cena = cena;
    }


    public ArrayList<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(ArrayList<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodisteAutomobila() {
        return godisteAutomobila;
    }

    public void setGodisteAutomobila(int godisteAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    abstract int vratiTrajanje();

    abstract double baznaCenaTocka();
    //-vratiOstecene(Tocak t) - Proverava da li je dati tocak ostecen, vraca true ako jeste.
    //Tocak od Audi-a je ostecen ukoliko je stariji od 60 dana, dok za BMW i Mercedes za stariji od 100 dana.

    boolean vratiOstecene(Tocak t){
        return t.getTrajanjeTocka() > vratiTrajanje();
    }
    //-zameniTocak() - Tocak koji je stariji od granice zameniti novim tockom.
    void zameniTocak(){
        for (int i = 0; i < listaTockova.size(); i++) {
            if(vratiOstecene(listaTockova.get(i))){
                listaTockova.set(i, new Tocak(1, baznaCenaTocka() ));

            }
        }

    }

    //-cenaTockova() - Vrati cenu svih tockova ako znamo da je cena po tocku za BMW 100, Mercedes
    // 120 i Audi 110.

    double cenaTockova(){
        return listaTockova.size() * baznaCenaTocka();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cena automobila: ").append(cena).append("\n");
        sb.append("Godiste automobila: ").append(godisteAutomobila).append("\n");
        sb.append("Lista tockova: ").append(listaTockova).append("\n");
        sb.append("Ukupna cena tockova: ").append(cenaTockova()).append("\n");
        return sb.toString();
    }
}
