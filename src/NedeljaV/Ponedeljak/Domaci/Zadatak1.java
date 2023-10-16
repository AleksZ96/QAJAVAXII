package NedeljaV.Ponedeljak.Domaci;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        /*
        Domaci Zadatak 1:
Napraviti klasu Planina koja ima vrednosti za naziv planine i njenu visinu.
Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara, listu planina i maksimalnu visinu na koju planinar moze da se popne.
Ova klasa takodje ima metode:
-popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.
-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.
-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo.
Klase Amater, Rekreativac i Pro nasledjuju klasu Planinar. Amater moze da se popne na planine od 0 do 1000m visine, Rekreativac do 2000m i Pro do 3000m.
Kreirati za date klase sve potrebne get i set metode, kao i konstruktore i toString.
         */

        Planina planina1 = new Planina("Zlatibor", 900);
        Planina planina2 = new Planina("Kopaonik", 2500);
        Planina planina3 = new Planina("Tara", 3500);
        ArrayList<Planina> listaPlanina = new ArrayList<>();
       // listaPlanina.add(planina1);
        listaPlanina.add(planina2);
        listaPlanina.add(planina3);
        Planinar amater1 = new Amater("Aleksandra", listaPlanina);
        System.out.println(amater1.getListaPlanina());
        System.out.println("-----------");
        amater1.popniSe(planina1);
        System.out.println(amater1.getListaPlanina());
        System.out.println("-----------");
        System.out.println(amater1.crnaLista());
        System.out.println("-----------");
        System.out.println(amater1.ukupnoMetara());


        }
}
