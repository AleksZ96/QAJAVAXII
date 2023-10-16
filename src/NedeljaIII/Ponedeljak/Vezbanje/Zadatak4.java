package NedeljaIII.Ponedeljak.Vezbanje;

public class Zadatak4 {

    //Napisati funkcije koje racunaju zbir brojeva zadatog niza (jednu za int[], drugu za double[] niz)

    static int zbirNiza(int[] arr) {
        int sum = 0;
        for (int e : arr)
            sum += e;
        return sum;
    }

    static double zbirNiza(double[] arr) {
        int sum = 0;
        for (double e : arr)
            sum += e;
        return sum;
    }
}