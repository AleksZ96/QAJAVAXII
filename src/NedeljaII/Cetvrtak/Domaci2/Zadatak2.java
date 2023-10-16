package NedeljaII.Cetvrtak.Domaci2;

public class Zadatak2 {
    public static void main(String[] args) {

        //Zadatak 2:
        //Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza.
        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 == 0) {
                sum += nizBrojeva[i];

            }
        }
        System.out.println(sum);

    }
}
