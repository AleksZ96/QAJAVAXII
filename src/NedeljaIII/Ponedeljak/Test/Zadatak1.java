package NedeljaIII.Ponedeljak.Test;

public class Zadatak1 {
    public static void main(String[] args) {
        int[] niz1 = {2, 11, 3, 50, 1};
        int[] niz2 = {1, 1, 13};
    }
    public static int[] saberiNizove(int[] niz1, int[] niz2) {
        int[] veci;
        int[] manji;
        if(niz1.length>niz2.length) {
            veci = niz1;
            manji = niz2;
        } else {
            veci = niz2;
            manji = niz1;
        }
        int[] rez = new int[veci.length];
        for(int i=0; i<veci.length;i++) {
            if(i< manji.length) {
                rez[i] = veci[i] + manji[i];
            } else {
                rez[i] = veci[i];
            }
        }
        return rez;
    }
}
