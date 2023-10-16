package nedeljaI.cetvrtak;

public class Cas3 {


    public static void main(String[] args) {
        //Konstante
        /*
         * Da bi kreirali konstanu koristimo kljucnu rec final.
         * Kada se jednom final promenjivoj dodeli vrednost, ne moze se vise menjati.
         * */

        final int x = 5;
        //x = 7; <- nije moguce - vec smo joj dodelili vrednost.

        final String s;
        //... neki kod da dobijemo vrednost koju hocemo da smestimo u s
        s = "Neka niska.";
        //.. neki dalje kod
        //s = "ss"; <- opet nije moguce iz istog razloga

        final double OLJEROV_BROJ = 2.71;

        /*
         * final kljucnu rec koristimo PREVENTIVNO!
         * Da onemogucimo nekoga da nam je promeni.
         * */
    }
}