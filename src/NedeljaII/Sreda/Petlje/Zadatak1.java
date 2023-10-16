package nedeljaII.sreda.petlje;

public class Zadatak1 {

    public static void main(String[] args) {
        //1. Napisati program koji ispisuje sve parne brojeve od 1 do 100
        /*
         * Rasparcajmo zadatak na lakse delove:
         * a) Ispisimo sve brojev od 1 do 100.
         * b) Filtrirajmo samo parne
         * */
        //I nacin
        /*for (int i = 1; i <= 100; i++) { //Iteracija sa korak od 1
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/
        //II nacin
        /*for (int i = 2; i <= 100; i += 2) { //Iteracija sa korakom od 2
            System.out.println(i);
        }*/
        //III nacin
        /*for (int i = 2; i <= 100 && (i % 2 == 0); i++){ //Uslov (i % 2 == 0) je nepotreban jer je uvek tacan!
            System.out.println(i++);
        }*/

        //Malo refaktorisanja
        for (int i = 2; i <= 100; i += 2)
            System.out.print(i + " ");



    }
}