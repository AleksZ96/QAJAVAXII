package NedeljaIII.Cetvrtak.Liste;

import java.util.ArrayList;

public class Liste2 {


    public static void main(String[] args) {
        /*
         * Metode nad listama
         *
         *
         * */
        ArrayList<Integer> al = new ArrayList<>();

        //1. Dodavanje elemenata u listu
        /*
         * a) add(int element) -> dodaje element na kraj liste
         * al = {1, 2, 3}; al.add(4) -> {1, 2, 3, 4}
         *
         * b) add(int index, int element) -> dodaje element na indeks index u listu
         * al.add(1, -123) -> {1, -123, 2, 3, 4}
         *
         * */

        al.add(1); al.add(2); al.add(3);
        System.out.println(al); //Liste su objekti sa ugradjenom metodu toString() pa mozemo direktno da ih stampamo

        //Hocu da dodam broj -123 na ideks 1
        al.add(1, -123);
        System.out.println(al);

        //Hocu da dodam 0 na pocetak liste
        al.add(0, 0);
        System.out.println(al);



        /*
         * 2. Brisanje elemenata iz liste
         *
         * a) remove(int index) - obrisi element iz liste na zadataom indeksu
         * b) remove(Object o) - brise prosledjeni element iz liste. (Njegovo prvo pojavljivanje)
         *
         *
         * al.remove(index=0) - brise element na indeksu 0
         * al.remove(Object=0) - brise prvo pojavljivanje broja 0 u listi
         *
         *
         * */

        al.remove(4);
        System.out.println(al);



        al.remove(Integer.valueOf(-123)); //Integer.valueOf(int) -> pretvara prosledjen int u Integer
        System.out.println(al);


        /*
         * 3. Duzina lista
         * .size() ->
         * */
        System.out.println("al ima duzinu = " + al.size());


        /*
         * 4. Dohvatanje elemenata
         * .get(index) // ono sto je ranije [index] sada je to metoda .get(index)
         *
         * */

        int prviElement = al.get(0);
        int drugiElement = al.get(1);
        int posednjiElement = al.get(al.size() - 1);
        System.out.println("Zbir prvog i drugog elementa je: " + (prviElement + drugiElement));
        System.out.println("Poslednji element: " + posednjiElement);
        //ekvivalentno System.out.println(al.get(al.size() - 1));


        /*
         * 5. Ciscenje celog niza
         * .clear() - brise sve elemente iz niza
         * */
        //al.clear();
        //System.out.println(al);

        /*
         * 6. Da li je prazna lista
         * .isEmpty() - vraca true ako je u pitanju prazna lista {}, inace false
         *
         * */
        System.out.println("Da li je prazna lista? " + al.isEmpty());


        /*
         * 7. Postavljanje elementa
         * .set(int index, int element) - postavlja element na prosledjen index (overwrite)
         * {1, 2, 3} set(1, 101) -> {1, 101, 3}
         * */
        System.out.println("Lista pre set-a: " + al);
        al.set(1, 555);
        System.out.println("Lista posle set-a: " + al);

        /*
         * add -> umece
         * set -> zamenjuje
         *
         * lista = {1, 2, 3, 4}
         * lista.add(1, 555) -> {1, 555, 2, 3, 4}
         *
         * lista = {1, 2, 3, 4}
         * lista.set(1, 555) -> {1, 555, 3, 4}
         *
         * add umece i pomera svaki element na indeksu vecem od zadataog za jednom mesto u napred (uvecava listu za jedan element)
         * set menja element na indeksu bez pomeranja drugih elemenata (duzina liste ostaje ista)
         * */


        /*
         * 8. Da li lista sadrzi neki element?
         * .contains(Object o) - vraca odgovor na pitanje da li se prosledjen objekat (broj) nalazi u listi
         *
         * */
        System.out.println(al);
        System.out.println("Da li se u listi nalazi broj 0? " + al.contains(0));
        System.out.println("Da li se u listi nalazi broj 1? " + al.contains(1));



    }
}