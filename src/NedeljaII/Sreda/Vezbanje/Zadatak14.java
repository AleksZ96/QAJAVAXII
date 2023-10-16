package NedeljaII.Sreda.Vezbanje;

public class Zadatak14 {

    static int ispisatiVeciBrojOdDva(int a, int b){
       int max = Math.max(a, b);
       return max;
    }
    public static void main(String[] args) {
        //14. Za unete brojeve a i b ispisati veci od njih.
int max = ispisatiVeciBrojOdDva(2, 2);
        System.out.println(max);

    }
}
