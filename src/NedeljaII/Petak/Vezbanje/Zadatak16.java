package NedeljaII.Petak.Vezbanje;

public class Zadatak16 {

    static double vratiProsecnuVrednostDoubleNiza(double[] niz){
        double sum = 0;

        for (int i = 0; i < niz.length; i++) {
            sum += niz[i];

        }
        double prosek = sum / niz.length;
        System.out.println("Prosecna vrednost niza je " + prosek);
        return prosek;

    }
    public static void main(String[] args) {
        //16. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        vratiProsecnuVrednostDoubleNiza(new double[]{1, 2, 3});
    }
}
