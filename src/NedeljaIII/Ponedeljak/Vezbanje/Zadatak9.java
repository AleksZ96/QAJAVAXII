package NedeljaIII.Ponedeljak.Vezbanje;

public class Zadatak9 {

    //Napisati funkciju koja proverava da li se prosledjeni ceo broj nalazi u proslednjenom nizu celih brojeva.

    static boolean search(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return true;
        }
        return false;
    }

}