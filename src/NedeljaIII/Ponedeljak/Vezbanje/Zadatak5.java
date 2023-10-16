package NedeljaIII.Ponedeljak.Vezbanje;

public class Zadatak5 {

    //Napisati funkciju koja racuna prosek double niza

    static double prosek(double[] arr) {
        double sum = 0;
        for (double e : arr)
            sum += e;
        return sum / arr.length;
    }
}