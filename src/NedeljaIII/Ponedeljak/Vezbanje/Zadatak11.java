package NedeljaIII.Ponedeljak.Vezbanje;

public class Zadatak11 {

    //Napisati funkciju koja prima dva imena i niz imena i proverava da li se bilo koje od ta dva prosledjena imena nalaze u prosledjenom nizu imena.
    static boolean daLiSeNalazi(String ime1, String ime2, String[] imena) {
        for(String i : imena) {
            if (i.equalsIgnoreCase(ime1) || i.equalsIgnoreCase(ime2))
                return true;
        }
        return false;
    }
}