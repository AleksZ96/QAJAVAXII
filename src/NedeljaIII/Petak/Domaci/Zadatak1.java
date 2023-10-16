package NedeljaIII.Petak.Domaci;

public class Zadatak1 {
    //Zadatak 1:
    //Kreirati klasu Korpa koja ima listu namirnica(String). Kreirati:
    //- metodu koja prima neku namirnicu i dodaje je u listu
    //- metodu koja za unetu namirnicu vraca true/false ukoliko se namirnica tu nalazi.
    //- metodu cenaKorpe koja vraca ukupnu cenu svih namirnica ako racunamo da je prosek jedne namirnice 70 dinara
    //- metodu izlistaj koja prikazuje sve namirnice iz liste
    //Takodje kreirati potreban konstruktor, get i set metode kao i toString.
    public static void main(String[] args) {
        Korpa korpa = new Korpa("Hleb");
        System.out.println(korpa);
        korpa.dodajProizvodUKorpu("Margarin");
        korpa.dodajProizvodUKorpu("Mleko");
        korpa.izlistaj();
        int cenaKorpe = korpa.cenaKorpe();
        System.out.println(cenaKorpe);


    }

}
