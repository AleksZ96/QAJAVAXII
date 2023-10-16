package nedeljaII.petak.nizovi;

import java.util.Scanner;

public class Matrice2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Ispisivanje matrice
        int[][] matrica = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < matrica.length; i++) { //ovaj for iterira po redovima
            for (int j = 0; j < matrica[i].length; j++) { //ovaj for iterira po kolonoma
                System.out.print(matrica[i][j] + " "); //matrica[i][j] <- element u i-tom redu i j-to koloni
            }
            System.out.println();
        }

        System.out.println("================");
        //Kreiranje sahovske table
        char[][] tabla = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabla[i][j] = '.';
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * jednostruka for -> nizove
         * dvostruka for -> matrice
         * */

        //bela polja = . | crna polja = _
    }
}
