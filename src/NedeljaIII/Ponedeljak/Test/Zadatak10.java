package NedeljaIII.Ponedeljak.Test;

public class Zadatak10 {
    static int vratiNajmanjiElementNiza (int[] niz1){
        int min = niz1[0];
        for (int i = 0; i < niz1.length; i++) {
            if(niz1[i] < min){
                min = niz1[i];
            }
        }
        System.out.println(min);
        return min;
    }
    public static void main(String[] args) {


    //10. Napisati funkciju koja vraca najmanji element niza.
        vratiNajmanjiElementNiza(new int[]{1, 3, 5});
    }
}
