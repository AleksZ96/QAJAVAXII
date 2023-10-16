package NedeljaIII.Petak.Domaci;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<String> namirnice;
    public Korpa() {
        namirnice = new ArrayList<>();
    }
    public Korpa(String namirnica){
        namirnice = new ArrayList<>();
        dodajProizvodUKorpu(namirnica);
    }

    public ArrayList<String> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<String> namirnice) {
        this.namirnice = namirnice;
    }

    public void dodajProizvodUKorpu(String nazivProizvoda){
        namirnice.add(nazivProizvoda);
    }

    public boolean daLiJeProizvodVecUKorpi(String nazivProizvoda){
        return namirnice.contains(nazivProizvoda);
    }

    public int cenaKorpe(){
        return namirnice.size() * 70;
    }

    public void izlistaj(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String konacanString = "";
        for (String proizvod : namirnice) {
            konacanString += proizvod + "\n";
        }
        return konacanString;
    }
}
