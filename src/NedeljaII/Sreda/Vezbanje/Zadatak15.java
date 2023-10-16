package NedeljaII.Sreda.Vezbanje;

public class Zadatak15 {

    static int ispisatiNajmanjiOdTriBroja(int a, int b, int c){
        int min1 = Math.min(a, b);
                int min2 = Math.min(min1, c);
        System.out.println(min2);
        return min2;
    }
    public static void main(String[] args) {
        //15. Za unete brojeve a, b i c ispisati najmanji od njih
        ispisatiNajmanjiOdTriBroja(7, 2, 2);
    }
}
