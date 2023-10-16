package NedeljaIII.Ponedeljak.Funkcije;

public class Funkcije13 {


    static int saberiSveBrojeve(int... x) {
        //...
        return -1;
    }

    static double f(int a, int b, double d, char c, double... x) {
        //...
        return -1;
    }

    static int[] kreirajNiz(int... a) {
        //Pristupamo argumentima funkcija kao a[0], a[1], ..., a[a.length - 1]
        int[] rez = new int[a.length];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = a[i];
        }
        return rez;
    }

    static void ispisiNiz(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*
         *
         * static <tip_povratne_vrednosti> <ime>(<tip1> <arg1>, ..., <tip> ... <imeArgumenta>) {
         *
         * }
         *
         * <tip> ... <imeArgumenta> - zahteva 1 ili vise argument tog tipa
         * Ovakva konstrukcija mora da bude poslednji argument funkcije i jedini tog tipa
         *
         * <tip> ... <imeArgumenta> - "Neki broj <tip> vrednosti"
         * Kada program udje u funkciju on gleda na "<tip> ... <imeArgumenta>" kao na niz: <tip>[] <imeArgumenta>
         *
         *
         *
         * */

        saberiSveBrojeve(1, 2, 3, 4, 5);
        saberiSveBrojeve(1);
        saberiSveBrojeve(-123);
        saberiSveBrojeve(-123, 2, 3, 4, 5, 6, 7, 8, 9);

        int[] arr = kreirajNiz(1, 2, 3, 4, 5);
        ispisiNiz(arr);
    }
}