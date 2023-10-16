package NedeljaIII.Petak.Vezbanje.Zadatak11;

public class Zadatak11 {
    public static void main(String[] args) {
        /*
        11.
Napisati klasu Pravougaonik koja sadrzi atribute:
- double a //Stranica a
- double b //Stranica b

Napisati 2 konstruktora
- Jedan koji prima sve argumenta
- Podrazumevani koji ne prima ni jedan argument

Napisati gettere i settere za sva polja

Napisati metodu obim() i povrsina() koje vracaju obim i povrsine pravougaonika, redom.

Omoguciti da se objekti ove klase porede pomocu hashCode() i equals() metoda.
Dva pravougaonika su ista ako imaju iste stranice.
Paziti da pravougaonik stranica 2,5 je isti kao pravougaonik stranica 5,2 jer je samo zarotiran za 90 stepeni!

Overridovati (nadjacati) toString() metod tako da vraca nisku oblika:
"Pravougaonik stranica <a> i <b>
 Obim: <obim>
 Povrsina: <povrsina>"
---------------------------------------------------------------------------------------------------------------------------------------

Napisati klasu Kvadrat koja nasledjuje klasu Pravougaonik.
Ova klasa nema ni jedan atribut.

Napisati 2 konstruktora
- Jedan konstruktor koji prima double a i poziva prvi konstruktor iz natklase
- Podrazumevani konstruktor koji poziva podrazumevani konstruktor natklase.

Overridovati toString() metod natklase tako da vraca nisku oblika:
"Kvadrat strainca <a> i <b>
 Obim: <obim>
 Povrsina: <povrsina>"
         */
        Pravougaonik pravougaonik1 = new Pravougaonik(2, 5);
        Pravougaonik pravougaonik2 = new Pravougaonik(5, 2);
        System.out.println(pravougaonik1.vratiObimPravougaonika());
        Kvadrat kvadrat1 = new Kvadrat(2, 2);
        System.out.println(kvadrat1);



    }
}
