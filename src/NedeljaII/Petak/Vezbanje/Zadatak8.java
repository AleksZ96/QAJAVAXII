package NedeljaII.Petak.Vezbanje;

public class Zadatak8 {

    static void vratiParneBrojeve(int[] nizBrojeva){
        for (int i = 0; i < nizBrojeva.length; i++) {
            if( nizBrojeva[i] % 2 == 0)
                System.out.println(nizBrojeva[i]);
        }
    }
    public static void main(String[] args) {
        //8. Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
        vratiParneBrojeve(new int[]{1, 2, 3, 4, 5, 6});
    }
}
