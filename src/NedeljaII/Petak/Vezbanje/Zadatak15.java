package NedeljaII.Petak.Vezbanje;

public class Zadatak15 {

    static boolean proveriDaLiJeSumaVecaOdProizvoda(int[] niz1){
        int sum = 0;

        for (int i = 0; i < niz1.length; i++) {
            sum += niz1[i];
        }
        int proizvod = 1;
        for (int i = 0; i < niz1.length; i++) {
            proizvod *= niz1[i];
        }

        if(sum > proizvod)
            return true;

        else{
            return false;
        }


    }
    public static void main(String[] args) {
      //  15. Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.

       boolean rezultat = proveriDaLiJeSumaVecaOdProizvoda(new int[]{1, 1, 1});
        System.out.println(rezultat);
    }
}
