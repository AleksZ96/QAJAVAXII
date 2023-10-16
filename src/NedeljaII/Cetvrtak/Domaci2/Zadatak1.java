package NedeljaII.Cetvrtak.Domaci2;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak 1:
        //Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.

        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 != 0) {
                System.out.println(nizBrojeva[i]);
            }
        }





    }
}
