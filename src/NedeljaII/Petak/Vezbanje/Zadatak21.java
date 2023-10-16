package NedeljaII.Petak.Vezbanje;

import java.util.Arrays;

public class Zadatak21 {
    static int maksimumOdDvaBroja(int [] x){
       Arrays.sort(x);
        return x[1];
    }

    public static void main(String[] args) {
        //21.** Napisati funkciju koja vraca maximum od dva broja bez koriscenja if-ova, switch-ova, ? operatora ili ugradjenih funkcija za
        //      odredjivanje maksimuma.

       int maks = maksimumOdDvaBroja(new int []{2, 5});
        System.out.println(maks);
    }
}
