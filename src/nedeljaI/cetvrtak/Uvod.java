package nedeljaI.cetvrtak;
import java.util.Scanner; // uvezena klasa iz biblioteke util (utility)

public class Uvod { //ime klase

    public static void main(String[] args) {
        //pocetak glavne funkcije. Detalji kljucnih reci ce biti objasnjavani kako ih budemo prelazili tokom kursa

        /*
         *
         * Konvencija imenovanja:
         * - ovoJeCamelCase
         * - ovo_je_snake_case
         * - ovo-je-cebab-case
         *
         * 1. Imena klasa: CamelCase sa prvim velikim pocetnim slovom
         * 2. Imena promenjivih i funkcija/metoda: camelCase sa prvim malim pocetnim slovom
         * */


        // Ovo je jednolinijski komentar.
        /*
         * Ovo je
         * viselinijski
         * komentar.
          */

        /**
         * Ovo je
         * dokumentacijski
         * komentar
          */

        /*
         * Tipovi (primitivnih, prosti) promenjivih:
         * 1) Celobrojni
         * - byte | 1B = 8bit
         * - char | 2B = 16bit
         * - short | 2B = 16bit
         * - int | 4B = 32bit
         * - long | 8B = 64bit
         * 2) Realni
         * - float | 4B = 32bit
         * - double | 8B = 64bit
         * 3) Logicki
         * - boolean | 1bit
         * 4) Kompozitni (objektni, slozeni, referentni)
         * - String | ?
         * - itd
         * */


        /*
         * Svaka naredba u javi se zavrsava znakom zavrsetka naredbe: ";"
         * ili znakom otvaranja bloka "{"
         * */

        /*
         * Deklaracija promenjive:
         * <tip_promenjive> <identifikator>;
         * */
        int x;
        double d;
        boolean nekiBoolean;
        char karakter;
        String string;

        /*
         * Inicijalizacija promenjive:
         * <identifikator> = <vrednost_odredjenog_literala>;
         * */
        x = 5;
        d = 3.14;
        nekiBoolean = true;
        karakter = 'c';
        string = "Zdravo svete!";


        /*
         * Deklaracija sa inicijalizacijom:
         * <tip_promenjive> <identifikator> = <vrednost_promenjive>;
         * */
        int y = 2;
        double dd = 3.0;
        boolean nekiDrugiBoolean = false;
        char karakter2 = 'A';
        float _jaSeZovemInt = 2.22f;
        int $x_Mene_Lako_Citate = 10_000;
        String niska = "Zbir prvih 5 strogo pozitivnih prirodnih brojeva je: 1 + 2 + 3 + 4 + 5 = 15";

        /*
         * Konzolni ispis:
         * 1.)Sa novim redom:
         * System.out.println(<vrednost_neke_Niska>);
         * 2.)Bez novog reda:
         * System.out.print(<vrednost_neke_Niske>);
         * */

        System.out.println("Zdravo svete!");
        System.out.println("Kada koristim 'println' dodaje se jedan 'enter' na kraju niske,");
        System.out.println("pa zato za je svaki 'println' u novom redu!");

        System.out.print("Ako koristim obican 'print', to znaci");
        System.out.print(" da se ne dodaje 'enter' posle svake komande i zato se sve ispisuje ");
        System.out.print(" u istom redu.");
        System.out.println(); // ova komanda samo "ispisuje" novi red, tj. lupa enter.


        /*
         * Osnovni operatori u javi su:
         * 1) Operator dodele "=" | infiksno
         *   int x = 5;
         */
        int ponestajeMiSimbola = 5;
        /*
         * 2) Aritmeticki operatori
         * - Sabiranje "+" | infiksno
         *   2 + 3;
         * - Oduzimanje "-" | infiksno
         *   x - y;
         * - Obrtanje znaka "-" | prefiksno
         *   double d = -3.14;
         * - Mnozenje "*" | infiksno
         *   2 * 3;
         * - Deljenje "/" infiksno
         *   int x = 5 / 3; // <- celobrojno deljenje
         *   double d = 5 / 3; // <- realno deljenje
         * - Deljenje sa ostatkom "%" | infiksno
         *   5 % 2 = 1
         */

        int nekiCeoBroj = 5;
        nekiCeoBroj = nekiCeoBroj + nekiCeoBroj;
        //Potpuno je validno! Prvo ce se izvrsiti ceo izraz sa desne strane znaka dodele,
        // pa ce se resenje smestiti u memorijski prostor oznacen sa imenom postavljenog sa leve strane operatora dodele!
        System.out.println(nekiCeoBroj);
        nekiCeoBroj = 2*nekiCeoBroj - 1;
        System.out.println(nekiCeoBroj);


        double m = 5, n = 3.3; //Ovako smo deklarisali i inicijalizovali vise promenjivih ISTOG tipa
        double nekiSlozenIzraz = ((m*30.2)/(n*0.11) + 15*m); //Zagrade koristimo standardno
        System.out.println(nekiSlozenIzraz);//Ispisuje se resenje celog izraza
        System.out.println(m + n + 1);//Mogu direktno da racunam i ispisujem izraze

        String s1 = "Ovo je prvi deo niske";
        String s2 = " a ovo je drugi deo niske.";
        String s3 = s1 + s2; //Sabiranje niski se interpretira kao nadovezivanje (kokatenacija)
        System.out.println(s3);

        /*
         * 3) Operatori uvecanja i umanjenja (inkrementacije i dekrementacije)
         * - Uvecananje za 1  "++" | prefiksno i postfiksno
         *  x++; <- uvecava x za 1 nakon izvrsene cele naredbe
         *  ++x; <- uvecava x za 1 pre izvrsenja ostatka naredbe
         * - Umanjenje za 1 "--" | prefiksno i postfiksno
         *  x--; <- umanjuje x za 1 nakon izvrsene cele naredbe
         * --x; <- umanjuje x za 1 pre izvrsenja ostatka naredbe
         * */
        int qwe = 5;
        System.out.println(qwe++);
        System.out.println(qwe);

        int ewq = 100;
        System.out.println(--ewq);
        System.out.println(ewq);


        /*
         * 4) Relacioni operatori
         * - Resenje je uvek literal tipa boolean
         *
         * - Poredjenje jednakosti "==" | infiksno
         *   3 == 5 -> false
         *   2 == 2 -> true
         *   x == y -> ako je vrednost x-a jednaka vrednosti y-a (x i y moraju biti ISTOG TIPA!)
         *
         * - Poredjenje nejednakosti "!= " | infiksno
         *   3 != 5 -> true
         *   2 != 2 -> false
         *   x != y -> akko je vrednost x-a razlicita od vrednosti y-a
         *
         * - Strogo manje "<" | infiksno
         *   3 < 5 -> true
         *   2 + 3 + 4 < 8 - 1  -> false
         *   3 < 3 -> false
         *
         * - Manje (manje ili jednako) "<=" | infiksno
         *   5 <= 3 -> false
         *   3 <= 3 -> true
         *
         * - Vece (vece ili jednako) ">=" | infiksno
         *   5 >= 3 -> true
         *   5 >= 5 -> true
         *
         * - Strogo vece ">" | infiksno
         *   5 > 3 -> true
         *   5 > 5 -> false
         * */

        int p1 = 2;
        int p2 = 3;
        int p3 = 2;
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1 == p2 - 1: " + (p1 == p2 - 1));
        System.out.println(p2 < p3);
        System.out.println(p3 < p2);
        System.out.println("p1 != p2: " + (p1 != p2));
        System.out.println("p1 != p3: " + (p1 != p3));

        /*
         * 5) Logicki operatori
         * -I ovde je resenje uvek logicki literal
         *
         * - (Logicka) negacija "!"
         *
         *     p  |  !p
         * -------------------
         *  true  | false
         *  false | true
         *
         * - (Logicka) konjukcija "&&" (dva ampersend znaka) | infiksno
         *     &&  | true false
         * -------------------
         *   true  | true false
         *   false | false false
         *
         * - (Logicka) disjunkcija "||" | infiksno
         *     ||  | true false
         * -------------------
         *   true  | true true
         *   false | true false
         * */

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println(b1 && b2);
        System.out.println(b1 || b2);


        /*
         * 6) Bitovni operatori
         * Daju ili logicke literale ili zadate literale sa svojim bitovima reorganizovanim
         *
         * - Bitovna negacije "~" | prefiksno
         *   Negira (obrce) svaki bit nekoj promenjivoj
         *   ~x
         *   ~0101 -> 1010
         *
         * - Bitovna konjukcija "&" | infiksno
         *   Ide bit po bit i konjuktuje ih. 1 interpretira kao true 0 kao false
         *   01011
         * & 10010
         * -------
         *   00010
         *
         * - Bitovna disjunkcija "|" | infiksno
         *   01011
         * | 10010
         * --------
         *   11011
         *
         * - Bitovna ekskluzivna disjunkcija ("xor" "ksili") "^" | infiksno
         *
         *     ^  | true false
         * -------------------
         *   true  | false true
         *   false | true false
         *
         *   01011
         * ^ 10010
         * -----------
         *   11001
         *
         *
         * - Pomeranje (bitova) u levo "<<" | infiksno
         * - Pomeranje (bitova) u desno ">>" | infiksno -> dodaje znakovni bit
         * - Pomeranje (bitova) u desno sa dodavanjem vodecih nula ">>>" | infiksno -> dodaje vodece nule
         * */
        int duplirajMe = 5;
        duplirajMe = duplirajMe << 1;
        System.out.println(duplirajMe);

        /*
         * 7)Uslovni i instancioni operatori
         * -Operatori grananja "?:" | ternarno (u ponedeljak radimo)
         * -Operator instanceof (necemo ga spominjati)
         * */

        /*
         * Moguce je skratiti izvrsenja nekih operacija poput:
         * int x = 5;
         * x = x + 2;
         * mozemo skratiti u
         * int x = 5;
         * x += 2;
         *
         * Imamo:
         * +=, -=, *=, /=, %=, ~=, &=, |=, ^=, <<=, >>=, >>>=
         * */


        /*
         * Kljucna rec final
         * */
        final double Pi = 3.14;
        //Pi = 2;


        /*
         * Konzolni unos preko Skenera
         *
         * */
        Scanner sc = new Scanner(System.in);
        //Inicijalizujemo (i deklarisemo) (objektni) tip skenera koji prima podatke iz "System.in" toka (preko konzole pomocu tastature).

        int unesiCeoBroj = sc.nextInt(); // unosimo neki ceo broj preko tastature i smestamo ga u promenjivu "unesiCeoBroj"
        double unesiRealanBroj = sc.nextDouble(); // analogno za double

        System.out.println(unesiCeoBroj);
        System.out.println(unesiRealanBroj);

        sc.nextLine(); //Ovo postoji jer je ostao jedan "Enter" u bufferu!
        String unesiNisku = sc.nextLine(); //Ceka da lupimo enter pa sve smesta u navedeni string
        System.out.println(unesiNisku);

        String s = sc.next(); // uneti: "jedan dva tri" <- uzima sledeci token
        System.out.println(s); //ispisuje se samo "jedan" jer sc.next() uzima samo sledeci token, a " dva tri" ostaje u bufferu (razmak, dva, razmak, tri)

        //sc.nextBoolean() i sc.hasInt() itd.
    }
}
