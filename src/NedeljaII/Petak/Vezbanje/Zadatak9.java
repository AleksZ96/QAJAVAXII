package NedeljaII.Petak.Vezbanje;

public class Zadatak9 {

    static int vratiNajveciElement(int[] nizBrojeva) {
        int max = nizBrojeva[0];
        for (int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] > nizBrojeva[0]){
                max = nizBrojeva[i];
            }
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        vratiNajveciElement(new int[] {1, 2, 3, 4, 5});
    }
}
