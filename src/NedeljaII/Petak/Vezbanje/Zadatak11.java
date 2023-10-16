package NedeljaII.Petak.Vezbanje;

public class Zadatak11 {

    static int[] vratiDupliraneElementeNiza(int[] nizBrojeva){

        for (int i = 0; i < nizBrojeva.length; i++) {
            nizBrojeva[i] = nizBrojeva[i] * 2 ;

            System.out.println(nizBrojeva[i]);
        }

        return nizBrojeva;
    }

    public static void main(String[] args) {
        //11. Napisati funkciju koja duplira sve elemente niza.
        //Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
        vratiDupliraneElementeNiza(new int[]{1, 2, 3});
    }
}
