package nedeljaII.petak.funkcije;

import java.util.Scanner;

public class Funkcije4{
    //Zadatak 2
    /*
     * Kreirati funkciju koja uvecava neki realan broj za 3
     *
     * */
    static double uvecajZaTri(double x) {
        return x + 3;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(uvecajZaTri(2.1));

        double x = -10;
        x = uvecajZaTri(x);
        System.out.println(x);



    }
}