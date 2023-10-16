package nedeljaI.cetvrtak;

public class Cas4 {

    public static void main(String[] args) {
        //System output
        /*
         * Da bi smo poslali podatke u output (konzola)
         * koristimo tokove iz System kalse.
         * */

        //1. System.out.print(<neki_String_literal>);
        /*
         * Ispisuje STRING koji mu prosledimo
         * */
        System.out.print("Zdravo svima!");
        System.out.print("\nKako ste?\n\n\n");
        //print() - ne stampa ENTER na kraju.

        //2. System.out.println(<neki_String_literal>);
        /*
         * Ispisuje STRING koji mu prosledimo i dodaje enter na kraju
         *
         * System.out.print("...\n"); <==> System.out.println("...");
         * */
        System.out.println("===============");

        System.out.println("Zdravo svima!");
        System.out.println("Kako ste?");

        /*
         * Pored toga mozemo proslediti sout-u i ostale tipove podataka, ali ce ih on na kraju
         * tretirati kao Stringove.
         * */
        System.out.println(2); //pretvara broj u String
        System.out.println(-3.14);
        System.out.println(false);///pretvara boolean u String

        System.out.println("====="); //sout - System.out.println();
        System.out.println((2+ 3)*5); //Izracunace rezultat i rezultat ce ispisati

        System.out.println("=====");
        String s1 = "Zdravo";
        String s2 = "svima";
        System.out.println("ITBC: " + s1 + " " + s2 + ", kako ste?");// + nadovezuje Stringove
        System.out.println(); //Stamapa prazan novi red
        System.out.println("Kontrola");
        System.out.println(""); // analogno System.out.println();
        System.out.println("Komtrola 2");





    }
}