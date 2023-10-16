package NedeljaIII.Ponedeljak.Test;

public class Zadatak22 {
    static boolean ispitatiDaLiJeNizMonoton(int[] niz){
        boolean daLiJeRastuci = true;
        boolean daLiJeMonoton = true;
        int poslednjaProverenaVrednost = niz[0];

        for (int i = 0; i < niz.length; i++) {
            if(i==1){
                daLiJeRastuci = niz[i] > poslednjaProverenaVrednost;
            }

            if(daLiJeRastuci && i != 0){
                daLiJeMonoton = niz[i] > poslednjaProverenaVrednost;
                        if(!daLiJeMonoton){
                            System.out.println("Nije monoton");
                            return false;
                        }
            } else if (i != 0) {
                daLiJeMonoton = niz[i] < poslednjaProverenaVrednost;
                if(!daLiJeMonoton){
                    System.out.println("Niz nije monoton");
                    return false;

                }
            }
            poslednjaProverenaVrednost = niz[i];
        }
        System.out.println(daLiJeMonoton);
        return daLiJeMonoton;
    }



    public static void main(String[] args) {
    //22.*
    //a) Napisati funkciju koja ispituje da li je niz monoton ili nije.
    // Niz je monoton ako je ili rastuci ili opadajuci ili konstantan, ali ne i rastuci i opadajuci.
    //b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije.
    // Niz je strogo monoton ako je iskljucivo rastuci ili iskljucivo  opadajuci i u nikojem delu nije konstantan (nema ponavljajucih elemenata)
        ispitatiDaLiJeNizMonoton(new int[]{1, 2, 3, 3});
    }
}
