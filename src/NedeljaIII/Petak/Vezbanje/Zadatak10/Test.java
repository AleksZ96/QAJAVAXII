package NedeljaIII.Petak.Vezbanje.Zadatak10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Film film1 = new Film("Sumrak", 2015, 6.7, "Film o vampirima", 2, 5, 6);
        //System.out.println(film1);

        Film film2 = new Film("Pomracenje", 2017, 6, "Film o vampirima ponovo", 2, 15, 0);
       // System.out.println(film2);
        FilmNaStanju filmNaStanju1 = new FilmNaStanju(film1, 5, 500);
        FilmNaStanju filmNaStanju2 = new FilmNaStanju(film2, 2, 600);
       // System.out.println(filmNaStanju1);

        ArrayList<FilmNaStanju> filmoviNaStanju1 = new ArrayList<>();
        filmoviNaStanju1.add(filmNaStanju1);
        filmoviNaStanju1.add(filmNaStanju2);


        VideoKlub videoKlub1 = new VideoKlub("Zabac", filmoviNaStanju1);
        System.out.println(videoKlub1.getKatalog());
        System.out.println("------------");
        videoKlub1.iznajmiFilm(film1);
        System.out.println(videoKlub1.getKatalog());
        System.out.println("------------");
        videoKlub1.iznajmiFilm(film1, 4);
        System.out.println(videoKlub1.getKatalog());
        System.out.println("------------");
        videoKlub1.iznajmiFilm(film1, 4);
        System.out.println(videoKlub1.getKatalog());
        System.out.println("------------");
        videoKlub1.dodajFilm(film1, filmNaStanju1.getCena());
        System.out.println(videoKlub1.getKatalog());
        System.out.println("------------");
        videoKlub1.dodajFilm(film1, filmNaStanju1.getCena(), 3);
        System.out.println(videoKlub1.getKatalog());
        System.out.println("------------");
        videoKlub1.pregledajFilm(film1);
        System.out.println("------------");
        videoKlub1.pregledajKatalog();
        System.out.println("------------");
        System.out.println("------------");

        Korpa korpaa1 = new Korpa(videoKlub1, filmNaStanju1.getCena());
        System.out.println(korpaa1.getVk().getKatalog());
        System.out.println("------------");
        korpaa1.dodajFilmUKorpu(film1);
        System.out.println(korpaa1.getVk().getKatalog());
        System.out.println("------------");
        korpaa1.dodajFilmUKorpu(film1, 3);
        System.out.println(korpaa1.getVk().getKatalog());
        System.out.println("------------");
        korpaa1.izbaciIzKorpe(film1);
        System.out.println(korpaa1.getVk().getKatalog());
        System.out.println("------------");
        korpaa1.izbaciIzKorpe(film1, 0);
        System.out.println(korpaa1.getVk().getKatalog());
        System.out.println("------------");
        korpaa1.izbaciIzKorpeSveKopije(film1);
        System.out.println(korpaa1.getVk().getKatalog());









    }
}
