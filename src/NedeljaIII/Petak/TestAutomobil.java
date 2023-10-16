package NedeljaIII.Petak;

public class TestAutomobil {

    public static void main(String[] args) {
        Automobil a1 = new Automobil("Audi", "a1", 'b', 4, 123, 1000);
        Automobil a2 = new Automobil();
        a2.setMarka("Honda");
        a2.setTip("Civic");
        a2.setBoja('r');
        a2.setBrojSedista(4);
        a2.setBrojSasije(555);
        a2.setKubikaza(900);

        System.out.println("Automobil 1: ");
        System.out.println(a1.informacija());

        System.out.println("\nAutomobil 2: ");
        System.out.println(a2.informacija());
        System.out.println();


        if (a1.daLiSuIsti(a2))
            System.out.println("a1 i a2 su isti");
        else
            System.out.println("a1 i a2 NISU isti");
        System.out.println();

        Automobil a3 = new Automobil("Audi", "a1", 'b', 4, 123, 1000);
        if (a1.daLiSuIsti(a3))
            System.out.println("a1 i a3 su isti");
        else
            System.out.println("a1 i a3 NISU isti");

    }
}