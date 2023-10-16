package NedeljaIII.Cetvrtak.Domaci;

import java.util.ArrayList;
import java.util.Locale;

public class Zadatak3 {

    static boolean vratiDaLiSeStringNalaziUListi(ArrayList<String> listaStringova, String nekiString){
        return listaStringova.contains(nekiString.toLowerCase(Locale.ROOT));
    }
    public static void main(String[] args) {
        //3.Napraviti funkciju koja prima listu Stringova, neki String i proverava da li se taj String nalazi u listi.

        ArrayList<String> listaStringova = new ArrayList<>();
        listaStringova.add("stolica");
        listaStringova.add("slusalice");
        listaStringova.add("sveska");
        listaStringova.add("mis");
        System.out.println(vratiDaLiSeStringNalaziUListi(listaStringova, "Sveska"));
    }
}
