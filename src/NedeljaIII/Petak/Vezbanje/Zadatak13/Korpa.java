package NedeljaIII.Petak.Vezbanje.Zadatak13;

import java.util.ArrayList;

public class Korpa {
    //Napisati klasu Korpa koja ima atribute:
    //- ArrayList<Namirnice>
    //- double cenaKorpe
    private ArrayList<Namirnica> namirnice;
    private double cenaKorpe;

    //Napisati podrazumevani konstruktor koji postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.

    public Korpa() {
        namirnice = new ArrayList<>();
        cenaKorpe = 0;
    }

    //Napisati sve gettere i settere

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    //Napisati metode:
    //1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe odgovarajucu cenu namirnice

    void dodajUKorpu(Namirnica n){
        namirnice.add(n);
        cenaKorpe = cenaKorpe + n.getCena();
    }
    //2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na cenuKorpe odgovarajucu cenu svih tih namirnica.
    void dodajUKorpu(Namirnica n, int k){
        for (int i = 0; i < k; i++) {
            namirnice.add(n);
        }
        cenaKorpe = cenaKorpe + k * n.getCena();
    }
    //3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    //                                kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    //                                artikla u korpi, uraditi nista.

    void ukloniIzUKorpe(Namirnica n){
        namirnice.remove(n);
        cenaKorpe = cenaKorpe - n.getCena();
    }
    //4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija takve namirnice. Ukoliko u korpi ima manje od k broja
    //                                       takve namirnice, obrisati sve takve namirnice.

    void ukloniIzUKorpe(Namirnica n, int k){
        for (int i = 0; i < k; i++) {
            namirnice.remove(n);
        }
        cenaKorpe = cenaKorpe - k * n.getCena();
    }
    //5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.

    void ukloniIzKorpeSveNamirniceN(Namirnica n){
        for (int i = 0; i < namirnice.size(); i++) {
            namirnice.remove(n);
            cenaKorpe = cenaKorpe - n.getCena();
        }
    }
    //6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    void isprazniKorpu(){
        ArrayList<Namirnica> namirnice1 = new ArrayList<>();
        for (Namirnica namirnica : namirnice){
            cenaKorpe = cenaKorpe - namirnica.getCena();
            namirnice1.add(namirnica);
        }
        namirnice.removeAll(namirnice1);

    }
    //7. cenaKrope - koja vraca ukupnu cenu korpe
    double cenaKorpe(){
        for (Namirnica namirnica : namirnice){
            cenaKorpe = cenaKorpe + namirnica.getCena();
        }
        return cenaKorpe;
    }
    //
    //Overridovati toString() metod kao:
    //"<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    // ...
    // <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    // Cena korpe je: <cenaKopre>"

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Namirnica namirnica : namirnice){
            sb.append(namirnica.getIme()). append(" | "). append(namirnice.size()).append( namirnica.getCena()).append("\n");
        }
        sb.append("Cena korpe je: ").append(cenaKorpe).append("\n");
        return sb.toString();
    }
}
