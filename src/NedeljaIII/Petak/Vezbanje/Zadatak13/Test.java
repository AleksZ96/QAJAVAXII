package NedeljaIII.Petak.Vezbanje.Zadatak13;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Namirnica namirnica1 = new Namirnica("Mleko", 200);
        Namirnica namirnica2 = new Namirnica("Sok", 200);
        ArrayList<Prodavnica> namirnice = new ArrayList<>();

        Prodavnica prodavnica1 = new Prodavnica("Maxi");
        prodavnica1.dodajNamirnicu(namirnica1);
        System.out.println(prodavnica1);
        Korpa korpa = new Korpa();



    }
}
