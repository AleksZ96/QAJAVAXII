package NedeljaII.Petak.Domaci3;

import java.util.Locale;
import java.util.Scanner;

public class Zadatak1 {

    static int vratiBrojSamoglasnika (String x){
        x = x.toLowerCase(Locale.ROOT);
        int brojac = 0;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u')
                brojac++;

        }


        return brojac;
    }



    public static void main(String[] args) {
      /*  Zadatak 1:
        Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
        (Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).

       */
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite neki tekst");
        String tekst = sc.nextLine();

        int x = vratiBrojSamoglasnika(tekst);
        System.out.println("Broj samoglasnika je:" + " " + x);

    }
}
