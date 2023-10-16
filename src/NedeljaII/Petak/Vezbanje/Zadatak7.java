package NedeljaII.Petak.Vezbanje;

public class Zadatak7 {

    static void vratiNeparneBrojeveNiza(int nizBrojeva[]){
        for (int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] % 2 != 0){
                System.out.println(nizBrojeva[i]);
            }

        }
    }
    public static void main(String[] args) {
        //7. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.
        vratiNeparneBrojeveNiza(new int [] {1, 2, 3, 4, 5});
    }
}
