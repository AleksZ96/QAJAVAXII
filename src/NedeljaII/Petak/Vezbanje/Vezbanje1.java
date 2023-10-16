package NedeljaII.Petak.Vezbanje;

public class Vezbanje1 {
    static int vratiNajveciBrojUNizu(int[] x){
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if( x[i] > max) {
                max = x[i];
            }

        }
        return max;

    }
    static int proveriKojiJeVeciBroj(int x, int y){
        if(x > y){
            return x;
        }
        return y;
    }

    static void ispisiVarijablu(int x){
        System.out.println("================");
        System.out.println(x);
        System.out.println("================");
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max1 = vratiNajveciBrojUNizu(x);

        int[] y = {898, 500, 123, 5};
        int max2 = vratiNajveciBrojUNizu(y);

        ispisiVarijablu(proveriKojiJeVeciBroj(max1, max2));






      /*
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if( x[i] > max) {
                max = x[i];
            }

        }
        System.out.println(max);

        int[] y = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int maxi = y[0];
        for (int i = 0; i < y.length; i++) {
            if( x[i] > maxi) {
                maxi = y[i];
            }

        }
        System.out.println(maxi);

       */
    }
}

