package nedeljaI.cetvrtak;

public class Cas2 {



    public static void main(String[] args) {
        //psvm - generise main metodu
        //ctrl+shift+f10 - pokrece program na kome se nalazi kursor.

        /*
         * main metoda -
         * main metoda je glava metoda u javi i java krece da
         * izvrsava svoj kod od njenog pocetka. Ide redom red po red odozgore na dole.
         * */

        //Deklarisanje promenjivih
        //<tip_promenjive> <identifikator>;
        int x; //0
        double y; //0.0
        String s; //""
        char c; //''
        boolean b; //false

        //Inicijalizacija promenjivih
        /*
         * 1. Deklarisanu promenjivu
         * 2. Nema vrednost (tj. ima podrazumevanu)
         * <identifikator> = <literal_odgovarajuceg_tipa>;
         * */
        x = 5;
        y = -2.2;
        s = "Neka niska";
        c = 'c';
        b = false;


        //Deklarizaciju i incijalizaciju
        //<tip_promenjive> <identifikator> = <literatl_odgovarajuceg_tip>;
        int nebitno = 15;

        /*
         * 1. Nije moguce ponovo definisati promenjive:
         * - int x = 5; int x = 7; <- nije moguce
         * - int x = 5; double x = 2.2; <- nije moguce
         * - int x = 5; String x = "ss" <- nije moguce
         *
         * !Svaki identifikator mora biti jedinstven unutar svog bloka i svih nad-blokova
         *
         * 2. Moguce je :
         * Moguce je definisati dva ista identifikatora u paralelnim blokovima
         * */

        /*
         * --Blokovi
         *
         * Blok koda je skup instrukcija koje se nalazi izmedju { i }
         *
         * -Ugjnezdavanje kod blokova:
         * otvaramo kod blok1{
         *   ....
         *   otvaramo kod blok2{
         *       ...
         *       otvaramo kod blok3{
         *           ....
         *       }zatvaramo kod blok3
         *   }zatavarmo kod blok2
         * }zatvaramo kod blok1
         *
         * {
         *   {
         *       {
         *           int x; <- samo jednom definisan
         *       }
         *   }
         * }
         *
         * --Paralelni blokovi
         *
         * paralelni blok1{
         *   int x
         * }
         *
         * paralelni blok2{
         *   int x
         * }
         *
         * Ovo je dozvoljeno jer se
         * paralelni blokovi medjusobno ne vide!
         *
         * */

        int nesto;
        {
            int nekiInteger;
            //int nesto; <- nemogce jer postoji u nad-bloku
        }
        {
            int nekiInteger;
        }


    }


}

