package NedeljaII.Petak.Vezbanje;

public class Zadatak19 {

    static void saberiDvaNizaProizvoljneDuzine(int[] niz1, int[] niz2){
        if(niz1.length > niz2.length) {
            int[] niz3 = new int[niz1.length];
            for (int i = 0; i < niz1.length; i++) {
                niz3[i] = niz1[i];
            }

            for (int i = 0; i < niz2.length; i++) {
                niz3[i] += niz2[i];

            }
            for (int i = 0; i < niz3.length; i++) {
                System.out.println(niz3[i]);

            }
        }
            else{
                int[] niz3 = new int[niz2.length];
                for (int i = 0; i < niz2.length; i++) {
                    niz3[i] = niz2[i];
                }
                for (int i = 0; i < niz1.length; i++) {
                    niz3[i] += niz1[i];
                    System.out.println(niz3[i]);
                }
               for (int i = 0; i < niz3.length; i++) {
                System.out.println(niz3[i]);

            }

            }


    }
    public static void main(String[] args) {
        //19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
        //Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
        saberiDvaNizaProizvoljneDuzine(new int[]{1, 2, 3, 4}, new int[] {1, 2});



    }


}
