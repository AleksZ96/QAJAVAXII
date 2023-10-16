package NedeljaIII.Petak.Vezbanje.Zadatak7;

public class Voznja {
    public static void main(String[] args) {



    Automobil auto1 = new Automobil("BMW", "X6", 1234, "Aleksandra Zivkovic");
    Automobil auto2 = new Automobil("BMW", "X5", 1235);

        System.out.println(auto1.getMarka());
        auto2.setVlasnik("Aleksandra Zivkovic");
        System.out.println(auto2.getVlasnik());
        System.out.println(auto2);
    }
}
