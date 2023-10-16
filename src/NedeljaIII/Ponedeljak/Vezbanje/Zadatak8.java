package NedeljaIII.Ponedeljak.Vezbanje;


public class Zadatak8 {

    /*
    * 8. Napisati funkciju koja prima dva niza celih brojeva i vraca niz dobijen
   nadovezivanje drugog niza na prvi
   Npr: [1, 2, 3, 4, 5], [6, 7] -> [1, 2, 3, 4, 5, 6, 7]
    *
    *
    * */

    static int[] nadovezi(int[] a, int[] b) {
        int[] rez = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            rez[index] = a[i];
            index++;
        }
        for (int i = 0; i < b.length; i++) {
            rez[index] = b[i];
            index++;
        }
        return rez;
    }

}