package NedeljaIII.Ponedeljak.Funkcije;

import java.util.Scanner;

public class Funkcije9{


    static int prviElement(int[] arr) {
        arr[1] = -9;
        int x = 5;
        return arr[0];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         *
         * Napisati funkciju koja prima niz celih brojeva
         * i vraca njen prvi element.
         *
         * */

        //System.out.println(prviElement(new int[]{1, 2, 3}));
        int[] x = {1, 2, 3};
        System.out.println("x[1] = " + x[1]);
        prviElement(x);
        System.out.println("x[1] = " + x[1]); //1


        /*
         *
         * Funckije u javi imaju propratne reakcije.
         * Propratne reakcije osecaju samo objekti (tj objektni tipovi - a to su sustinksi reference, a "promenjiva" niza je referenca)
         * <==> SAMO primitivne promenjive ne osecaju uticaj propratnih reakcija!
         *
         * */
    }
}