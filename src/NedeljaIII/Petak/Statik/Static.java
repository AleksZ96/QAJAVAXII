package NedeljaIII.Petak.Statik;

public class Static {

    public static void main(String[] args) {
        /*
         * Static modifikator
         *
         * Static modifikator nam kreira staticke metode/promenjive
         *
         * Staticke metode i promenjive su vezane za samu KLASU a ne za objekte klase.
         * Svi objekti neke klase zajedno delje staticke metode i promenjive
         *
         * public class K {
         *  ....
         *  static int x;
         *
         * ......
         * }
         *
         * public class M {
         *
         * public static void main(String[] args) {
         *   K k1 = new K();
         *   K k2 = new K();
         *   //k1 i k2 ce zajedno deliti promenjuv x preko svoje klase K
         *   //nece postojate dve instance promenjive int x, vec samo jedna!
         *
         * }
         *
         * }
         *
         * Prilikom prvog poziva neke metode neke klase (npr kostruktora) sve
         * staticke promenjive i metode se inicijalizuju u memoriji!
         *
         *
         * Stasticki kontekts (npr metoda) ne moze da poziva nestaticke stvari (npr druge metode ili promenjive).
         * Obrnuto vazi; nestaticki kontektsi mogu da pozivaju staticke kontekste
         *
         *
         * Staticki blok:
         * -To je blok koda koji je statican
         * static{
         *  //linija1
         *  //linija2
         *   ....
         *  //linijaN
         * }
         *
         * Staticki blokovi sluze za izvrsavanje nekog dela koda "unapred" (tj prilikom prve reference na tu klasu)
         *
         * Staticki blokovi se izvrsavaju SAMO JEDNOM!
         *
         *
         * Pristupane statickim atributima (tj promenjivim) i statickim metodama vrsimo PREKO KLASE
         * <ImeKlase>.<imeAtributa/imeMetode>;
         *
         * */


    }
}
