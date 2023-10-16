package NedeljaIII.Ponedeljak.Funkcije.DomaciSreda1;

public class Zadatak1 {
    static boolean proveriDaLiSuNizoviJednaki(int[] x, int []y){
        boolean daLiSuJednaki = true;
        if( x.length == y.length){
            for (int i = 0; i < x.length; i++) {
                System.out.println("Element prvog niza " + x[i] + " drugog niza " + y[i]);
                if(x[i] != y[i]){
                    daLiSuJednaki = false;
                }

            }
        }
        else {
            daLiSuJednaki = false;
        }




        return daLiSuJednaki;
    }
    public static void main(String[] args) {
        //Zadatak 1:
        //Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki.
        boolean daLiSuJednaki = proveriDaLiSuNizoviJednaki(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(daLiSuJednaki);


      }

    }


