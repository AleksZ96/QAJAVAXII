package NedeljaIII.Ponedeljak.Test;

public class ZadatakPomeranjeNiza {

    static int[] rotirajNiz(int[] niz, int zaKolikoSeRotira) {
        int[] rotiraniNiz = new int[niz.length];
        int brojac = zaKolikoSeRotira;
        for (int i = 0; i < niz.length; i++) {
            if (brojac == niz.length) {
                brojac = 0;
            }
            rotiraniNiz[brojac] = niz[i];
            brojac++;

        }


        return rotiraniNiz;
    }
    public static void main(String[] args) {
        int[] rotiraniNiz = rotirajNiz(new int[]{1, 2, 3, 4, 5}, 2);
        for (int i = 0; i < rotiraniNiz.length; i++) {
            System.out.println(rotiraniNiz[i]);

        }

    }
}
