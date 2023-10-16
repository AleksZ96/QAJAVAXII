package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak12 {
    static void proveritiDeljivostBrojevaDoUnetog(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
                System.out.println( i + " Fizz");
                if(i % 5 == 0){
                    System.out.println(i + " FizzBuzz");
                }
                if(i % 7 == 0){
                    System.out.println( i + " FizzZazz");
                }
            }
            if (i % 5 == 0) {
                System.out.println( i + " Buzz");
                if(i % 3 == 0) {
                    System.out.println(i + " BuzzFizz");
                }
                if(i % 7 == 0){
                    System.out.println(i + " BuzzZazz");
                }

            }
            if (i % 7 == 0){
                System.out.println(i + " Zazz");
                if(i % 3 == 0) {
                    System.out.println(i + " ZazzFizz");
                }
                if(i % 5 == 0){
                    System.out.println(i + " ZazzBuzz");
                }
            }

        }
    }
    public static void main(String[] args) {
     /*   12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
     "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)


      */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
                System.out.println( i + " Fizz");
                if(i % 5 == 0){
                    System.out.println(i + " FizzBuzz");
                }
                if(i % 7 == 0){
                    System.out.println( i + " FizzZazz");
                }
            }
            if (i % 5 == 0) {
                System.out.println( i + " Buzz");
                if(i % 3 == 0) {
                    System.out.println(i + " BuzzFizz");
                }
                if(i % 7 == 0){
                    System.out.println(i + " BuzzZazz");
                }

            }
            if (i % 7 == 0){
                System.out.println(i + " Zazz");
                if(i % 3 == 0) {
                    System.out.println(i + " ZazzFizz");
                }
                if(i % 5 == 0){
                    System.out.println(i + " ZazzBuzz");
                }
            }

        }

         */


    }
}
