package NedeljaIII.Ponedeljak.Funkcije.DomaciSreda1;

public class Zadatak3 {

    static boolean postojiUNizu(String[] niz, String ime){
        for (int i = 0; i < niz.length; i++) {
          if(niz[i] == ime){
              return true;
          }

        }
        return false;

    }

    static int vratiBrojDuplikataImena(String[] niz1){
        int brojac = 0;
        String[] niz2 = new String[niz1.length];


        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Ime: " + niz1[i]);

            if(postojiUNizu(niz2, niz1[i])){
                brojac++;
            }
            else {
                niz2[i] = niz1[i];
            }

        }
        return brojac;

    }
    public static void main(String[] args) {
        //Zadatak 3:
        //Napraviti funkciju koja prima niz Stringova nekih imena i kao rezultat vraca broj duplikata
        //imena(Ukoliko ih ima).
       int brojDuplikata = vratiBrojDuplikataImena(new String[] {"Marija", "Jelena", "Bojana", "Marija", "Jelena"});
        System.out.println("Broj duplikata je: " + brojDuplikata);
    }
}
