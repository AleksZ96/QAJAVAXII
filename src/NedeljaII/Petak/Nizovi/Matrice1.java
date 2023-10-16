package nedeljaII.petak.nizovi;

import java.util.Scanner;

public class Matrice1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         * Matrice
         *
         * <tip_podataka>[][] <identifikator>;
         *
         * [][] -> Interpretiramo kao:
         * 1. Matrice <==>
         * 2. Niz nizova <==>
         *
         *
         * [][] <- niz ciji su svi elementi pokazivaci na neke dalje nizove (dakle niz pokazivaca)
         *
         * */
        //Deklarizacija
        int[][] matricaIntova;
        //Inicijalizacija
        matricaIntova = new int[2][2];

        //Implicitna deklarizacija sa inicijalizacijom
        double[][] matricaDoubleova = new double[3][4];

        //Ekpsplicitna -//- <- ovde je mozda prirodnije gledati na ovo kao na niz nizova
        int[][] x = {{1, 2, 3}, {2, 3, 4}, {-1, -2, -3}}; //matrica 3x3.
        int[][] y = {{1, 2, 3},
                {2, 3, 4},
                {-1, -2, -3}};

        int[][] z = {{1, 2, 3}, {1, 2}}; //ovo vise nije matrica.




    }
}