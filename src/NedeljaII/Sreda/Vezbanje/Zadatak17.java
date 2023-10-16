package NedeljaII.Sreda.Vezbanje;

public class Zadatak17 {

    static void vratiResenjeOperacije(double a, char b, double c){
        double d;
        if(b == '+'){
             d = a + c;
            System.out.println(d);
        }
        if(b == '-'){
             d = a - c;
            System.out.println(d);
        }
        if(b == '*'){
             d = a * c;
            System.out.println(d);
        }
        if(b == '/'){
             d = a / c;
            System.out.println(d);
        }
        if(b == '%'){
            d = a / 100 * c;
            System.out.println(d);
        }
        if(b == '^'){
             d = 1;
            for (double i = 0; i < c; i++) {

                d *= a;
            }
            System.out.println(d);
        }


    }
    public static void main(String[] args) {
        //17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola:
        // {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.

        vratiResenjeOperacije(5, '^', 2);
    }
}
