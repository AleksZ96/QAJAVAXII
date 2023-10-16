package NedeljaII.Petak.Vezbanje;

public class Zadatak18 {



    static int[] podeliNizNaDvaDelaIVratiZbir(int[] niz1){
        int srednjaTacka = niz1.length/2;
        if(niz1.length % 2 != 0){
            srednjaTacka += 1;
        }

        int[] niz2 = new int[srednjaTacka];
        int[] niz3 = new int[srednjaTacka];
        int[] niz4 = new int[niz2.length];
        for (int i = 0; i < srednjaTacka; i++) {
            niz2[i] = niz1[i];
        }
        for (int i = srednjaTacka - 1; i < niz1.length ; i++) {
            niz3[i - srednjaTacka + 1] = niz1[i];
        }
        for (int i = 0; i < niz2.length; i++) {
            System.out.println(niz2[i]);
        }
        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }
        for (int i = 0; i < niz4.length; i++) {
            niz4[i] = niz2[i] + niz3[i];
        }
        for (int i = 0; i < niz4.length; i++) {
            System.out.println(niz4[i]);
        }

        return niz4;




    }
    public static void main(String[] args) {
        //18.* Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.
        //Npr:
        //[1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
        //[1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8]
        podeliNizNaDvaDelaIVratiZbir(new int[]{1, 2, 3, 4, 5});
    }
}
