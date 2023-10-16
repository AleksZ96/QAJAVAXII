package NedeljaII.Sreda.Domaci;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
         /* Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."), cim se unese
    tacka program se zavrsava i vraca prethodno unete tekstove.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki tekst");
        String tekst = sc.nextLine();
        String ceoTekst = "  ";

        while(!(tekst.equals("."))) {
            ceoTekst = ceoTekst + " " + tekst;
            System.out.println("Unesite neki tekst");
            tekst = sc.nextLine();
        }
            System.out.println(ceoTekst);





    }

}
