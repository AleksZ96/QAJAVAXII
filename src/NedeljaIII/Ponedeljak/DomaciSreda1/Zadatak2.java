package NedeljaIII.Ponedeljak.Funkcije.DomaciSreda1;

public class Zadatak2 {
    static int[] vratiZbirElemenataNaIstojPoziciji(int[] niz1, int[] niz2){

        int[] niz3 = new int[niz1.length];
        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Element prvog niza " + niz1[i] + " drugog niza " + niz2[i]);
            niz3[i] = niz1[i] + niz2[i];

        }
        for (int i = 0; i < niz3.length; i++) {
            System.out.println("Rezultat je " + niz3[i]);
        }


        return niz3;
    }

    public static void main(String[] args) {
        //Zadatak 2:
        //Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i kao rezultat vraca zbir
        //svih elemenata na istoj poziciji.
        //
        //**(Neobavezan deo) Implementirati funkciju da prima nizove razlicitih velicina, tako da
        //sabira sve elemente na istim pozicijama, ukoliko jednom nizu ponestaje elemenata, prepisati
        //preostale elemente iz veceg niza.
        vratiZbirElemenataNaIstojPoziciji(new int[] {1, 2, 3}, new int[]{2, 4, 6});

    }
}
