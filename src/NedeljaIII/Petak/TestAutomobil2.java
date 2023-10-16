package NedeljaIII.Petak;

import java.util.ArrayList;

public class TestAutomobil2 {

    public static void main(String[] args) {
        Automobil2 a = new Automobil2("a", "b", 'c', 2, 3);
        /*
         * Kreiranje
         * @Override
         * public String toString() {....}
         * metode, omogucavamo da prosledimo samo identifikator
         * naseg objekta, a java ce sama da pozove toString metod i da
         * serilizuje taj objekat
         * */

        System.out.println(a);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        System.out.println(al);//Ovde se poziva toString() metod iz klase ArrayList<>


    }
}
