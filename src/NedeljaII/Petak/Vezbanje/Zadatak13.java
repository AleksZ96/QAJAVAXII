package NedeljaII.Petak.Vezbanje;

import java.io.PrintStream;

public class Zadatak13 {
    static int[] nadovezatiDvaNiza(int[] x, int[] y){
        int[] z = new int [x.length + y.length];
        int brojac = x.length;

        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
        }
        for (int i = 0; i < y.length; i++) {
            z[brojac] = y[i];
            brojac++;
        }
        return z;
    }



    public static void main(String[] args) {
      //  13. Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
             //   Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]

        int[] x = {1, 2, 3, 4, 500, 1983};
        int[] y = {4, 5, 6, 7};
        int[] z = nadovezatiDvaNiza(x, y);



        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);

        }



            }


        }



