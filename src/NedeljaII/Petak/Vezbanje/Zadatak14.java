package NedeljaII.Petak.Vezbanje;

import java.util.Arrays;

public class Zadatak14 {
    static int zbirDrugogNajmanjegIDrugogNajveceg(int[] x){
        Arrays.sort(x);
        int drugiNajmanji = 0;
        int drugiNajveci = 0;
        if(x.length > 2){
            drugiNajmanji = x[1];
            drugiNajveci = x[x.length - 2];
        }
        else{
            drugiNajmanji = x[0];
            drugiNajveci = x[x.length - 1];
        }

        return drugiNajmanji + drugiNajveci;
    }
    public static void main(String[] args) {
        //14.* Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
        int[] x = {20};
        int zbir = zbirDrugogNajmanjegIDrugogNajveceg(x);
        System.out.println(zbir);

        /*for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

         */
    }

}
