package NedeljaII.Petak.Vezbanje;

public class Zadatak12 {
    static int[] saberiDvaNizaElementpoElement(int[] nizBrojeva1, int[] nizBrojeva2){
        int[] nizBrojeva3 = new int[nizBrojeva1.length];
        for (int i = 0; i < nizBrojeva1.length ; i++) {
                 nizBrojeva3[i] = nizBrojeva1[i] + nizBrojeva2[i];
                System.out.println(nizBrojeva3[i]);
            }




        return nizBrojeva3;
    }
    public static void main(String[] args) {
        //12. Napisati funkciju koja sabira 2 niza iste duzine element po element. (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
        //Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]

        saberiDvaNizaElementpoElement(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }
}
