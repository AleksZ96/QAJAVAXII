package NedeljaIII.Cetvrtak.Liste;

import java.util.ArrayList;
import java.util.LinkedList;

public class Liste1 {





    public static void main(String[] args) {
        /*
         * Liste - vrsta kolekcije u javi.
         * - Na liste gledamo kao na dinamicke nizove
         *
         * Korisnik unosi broj n. A zatim i n brojeva. Kreirati niz od tih brojeva
         *
         * lista l = {1, 2, 3, 4} -> l = {1, 2, 3, 4, 5} -> {1, 3, 4 ,5}
         *
         * sve sto mozemo sa nizovima, mozemo i sa listama, ali obrnuto ne vazi
         *
         * - Postoje 2 vrste listi u javi:
         * 1. ArrayLista - Koristi niz u pozadini  ****- vise se koriste
         * 2. LinkedLista - Koristi pokazivace u pozadini- jako retko se koristi
         *
         * - Prvo moramo da importujemo odgovaracuju list:
         * import java.util.ArrayList; <- ovo ce kao i do sada, intelliJ automatski da radi.
         *
         * ArrayList<omotac_tipa ili neka_klasa> {identifikator} = new ArrayList<>();
         *
         * (klasa) omotac primitivnih tipova podataka transformise primitivne u objektne tipove
         *
         * primitivni tip  | omotac
         * int             | Integer
         * double          | Double
         * boolean         | Boolean
         * char            | Character
         * */

        ArrayList<Integer> al = new ArrayList<>(); //Ovim smo kreirali praznu ArrayListu al = {}

        LinkedList<Double> ll = new LinkedList<>(); //Ovim smo kreirali praznu LinkedListu ll = {}

    }
}