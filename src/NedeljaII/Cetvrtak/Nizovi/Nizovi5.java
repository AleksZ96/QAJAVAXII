package nedeljaII.cetvrtak.nizovi;

import java.util.Scanner;

public class Nizovi5{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*
         *
         * indeks = pozicija
         *
         * Osnovne operacije nad nizovima
         *
         * */

        int[] x = {1, 111, -50, 20, 1, 2, 3, 4, 5};

        //1. Hocemo da ispisemo sve elemente niza
        for (int index = 0; index < x.length; index++) {
            System.out.println(x[index]);
        }
        System.out.println("======================");

        //Isto to sa vise informacija
        for (int i = 0; i < x.length; i++) {
            System.out.println("Element na poziciji " + i + " = " + x[i]);
        }
        System.out.println("======================");

        // Sve u isto redu
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();


        /*
         *
         * Unparedjena for petlja (Enhanced for petlja) - "za svaki" petlja
         *
         * for (<tip_promenjive> <identifikator> : <promenjiva_po_kojoj_itetariramo) {
         *   ...
         * }
         *
         * Unparedjena for petlja iterira kroz celu zadatu kolekciju (nizovi su vid kolekcije)
         * element po element.
         *
         * */

        System.out.println("========================");
        //Isto ovo preko enhanced-for
        for (int element : x) {
            System.out.println(element);
        }

        /*
         * Enhanced for mozemo da koristimo SAMO kada ta kolekcija
         * po kojoj zelimo da iteraramo ima implementiran neki naci iteracije.
         *
         * Q: Da li su obicne for i enhanced for petlje ekvivalentne?
         * A: Nisu (cak i na restrikciju da iteriramo samo kroz kolekcije). Npr
         * kada nam treba informacija o indeksu niza, kada hocemo da menjamo niz.
         *
         * Posledica:
         * enhanced for ==> obican for, ali obrnuto ne vazi
         *
         * */


    }
}