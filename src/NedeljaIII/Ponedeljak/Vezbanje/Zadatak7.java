package NedeljaIII.Ponedeljak.Vezbanje;


public class Zadatak7 {

    //Napisati funkciju koja vraca najmanji element niza celih brojeva.

    static int najmanji(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}