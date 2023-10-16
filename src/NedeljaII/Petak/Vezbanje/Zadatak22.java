package NedeljaII.Petak.Vezbanje;

public class Zadatak22 {

    static boolean ispitatiDaLiJeNizMonoton(int[] x){
        boolean daLiJeNizMonoton = true;
        int poslednjaVrednost = x[0];
        boolean daLiJeRastuci = true;
        for (int i = 0; i < x.length; i++) {
            if(i == 1){
                daLiJeRastuci = x[i] > poslednjaVrednost;
            }
            if(daLiJeRastuci && i != 0){
                daLiJeNizMonoton = x[i] >= poslednjaVrednost;
                if(!daLiJeNizMonoton){
                    return false;
                }
            }
            else if(i != 0) {
                daLiJeNizMonoton = x[i] <= poslednjaVrednost;
                if (!daLiJeNizMonoton) {
                    return false;
                }
            }
            poslednjaVrednost = x[i];


        }
        System.out.println(daLiJeNizMonoton);
        return daLiJeNizMonoton;

    }
    public static void main(String[] args) {
        //22.*
        //a) Napisati funkciju koja ispituje da li je niz monoton ili nije.
        // Niz je monoton ako je ili rastuci ili opadajuci ili konstantan, ali ne i rastuci i opadajuci.
        //b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije.
        // Niz je strogo monoton ako je iskljucivo rastuci ili iskljucivo  opadajuci i u nikojem delu nije konstantan
        // (nema ponavljajucih elemenata)
       ispitatiDaLiJeNizMonoton(new int[]{2, 3, 4, 4, 5});


    }
}
