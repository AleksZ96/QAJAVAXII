package NedeljaIII.Petak.Vezbanje.Zadatak7;

public class GlavniProgram {
    public static void main(String[] args) {
        Sportista sportista1 = new Sportista("Aleksandra Zivkovic", "Odbojka", 12);
        System.out.println(sportista1);
        sportista1.setKlub("Imlek");
        System.out.println(sportista1);
        System.out.println(sportista1.getImeIPrezime());
    }
}
