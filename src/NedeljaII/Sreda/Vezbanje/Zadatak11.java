package NedeljaII.Sreda.Vezbanje;

import java.util.Scanner;

public class Zadatak11 {

    static void vratiInformacijeOSkolovanju(String ime, String prezime, int godinaRodjenja){
        if(godinaRodjenja < 2004){
            System.out.println(ime + prezime + " je zavrsio skolu");
        } else if (godinaRodjenja >= 2004 && godinaRodjenja <= 2016) {
            System.out.println("Dobrodosao u " + (2023 - godinaRodjenja - 6) + " razred " + ime + prezime);
        } else if (godinaRodjenja > 2016 ) {
            System.out.println(ime + prezime + " tek treba da zapocne obrazovanje");
        }
    }
    public static void main(String[] args) {
         /*11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
	"Dobrodosao u {x}. razred, {ime} {prezime}",
	pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
    poruku od:
	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

          */
        vratiInformacijeOSkolovanju("Aleksandra", "Zivkovic", 2015);

    }
}
