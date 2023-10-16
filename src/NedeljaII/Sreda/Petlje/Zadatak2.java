package nedeljaII.sreda.petlje;

public class Zadatak2 {

    public static void main(String[] args) {
        //2. Napisati program koji ispisuje sve brojeve deljive sa 3 ili deljive sa 4 od 1 do 100
        for (int i = 1; i <= 100; i++)
            if ((i % 3 == 0) || (i % 4 == 0))
                System.out.print(i + " ");


        /*
         * i % 3 - neki broj
         * neki_broj == 0 - true/false
         * i $ - neki broj
         * neki_broj == 0 - true/false
         *
         * true/false || true/false
         *
         * x == y <- ovo moze da radi samo kada su x i y istog TIPA podatka
         * x || y <- ovo moze da radi samo kada su x i y tipa boolean
         * x && y <- -//-
         * */
    }
}
