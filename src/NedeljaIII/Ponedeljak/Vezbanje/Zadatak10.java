package NedeljaIII.Ponedeljak.Vezbanje;

public class Zadatak10 {

    //Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda

    static int sumaNiza(int[] arr) {
        int sum = 0;
        for (int e : arr)
            sum += e;
        return sum;
    }

    static int proizvodNiza(int[] arr) {
        int prod = 1;
        for (int e : arr)
            prod *= e;
        return prod;
    }


    //I nacin
    static boolean daLiJeSumaVecaOdProizvoda(int[] arr) {
        if (sumaNiza(arr) >= proizvodNiza(arr))
            return true;
        else
            return false;
    }

    //II nacin
    static boolean daLiJeSumaVecaOdProizvoda2(int[] arr) {
        return sumaNiza(arr) >= proizvodNiza(arr);
    }


}
