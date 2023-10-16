package NedeljaII.Petak.Vezbanje;

import java.util.Locale;
import java.util.Scanner;

public class Zadatak24 {
    static int konvertujUDruguValutu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Otkucajte valutu koju zelite da promenite-EUR,RSD,USD,JPY");
        String valutaKojuMenjamo = sc.next().toLowerCase(Locale.ROOT);

        System.out.println("Unesite kolicinu novca koju celite da promenite");
        int novac = sc.nextInt();

        System.out.println("Otkucajte zeljenu valutu-EUR,RSD,USD,JPY");
        String valutaUKojuMenjamo = sc.next().toLowerCase(Locale.ROOT);

        if(valutaKojuMenjamo == "eur"){
            if(valutaUKojuMenjamo == "rsd"){
                System.out.println("EUR, RSD," + novac + (novac * 117.26) );
            }
            if(valutaUKojuMenjamo == "usd"){
                System.out.println("EUR, USD," + novac + (novac * 117.26) );
            }
            if(valutaUKojuMenjamo == "jpy"){
                System.out.println("EUR, RSD," + novac + (novac * 117.26) );
            }
            if(valutaUKojuMenjamo == "eur"){
                System.out.println("EUR, RSD," + novac + (novac * 117.26) );
            }


        }
         return novac;
    }
    public static void main(String[] args) {
        //24.* Napisati funkciju koja vraca konvertovani zadati iznos zadate valute u neku drugu zadatu valutu, ako su moguce valute i njihovi kursevi zadati kao:
        //EUR = 117.26 RSD
        //USD = 107.79 RSD
        //JPY = 0.81 RSD
        //pod uslovom da su prodajni i kupovni kursevi isti.
        //Npr:
        //"EUR", "RSD", 10 -> 1172.6
        //"EUR", "JPY", 100 -> 14476.54
        //"USD", "USD", 0.26 -> 0.26

        konvertujUDruguValutu();
    }
}
