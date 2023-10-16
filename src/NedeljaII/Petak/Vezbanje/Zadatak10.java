package NedeljaII.Petak.Vezbanje;

public class Zadatak10 {
    static int vratiNajmanjiElementNiza(int[] nizBrojeva){
        int min = nizBrojeva[0];
        for (int i = 0; i < nizBrojeva.length; i++) {
            if(min > nizBrojeva[i]){
                min = nizBrojeva[i];
            }
        }
        System.out.println(min);
        return min;
    }
    public static void main(String[] args) {
        //10. Napisati funkciju koja vraca najmanji element niza.
        vratiNajmanjiElementNiza(new int[]{1, 2, 3, 4, 5});
    }
}
