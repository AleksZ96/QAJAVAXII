package NedeljaIII.Utorak;

public class TestUcenik {


    public static void main(String[] args) {
        Ucenik u1 = new Ucenik("Darko", "Tonic", new int[]{3, 5, 5, 5, 5});
        u1.ispisatiProsek();
        u1.ispisiSveOcene();
        u1.ispisKakavJeDjak();

        System.out.println("====================");

        Ucenik u2 = new Ucenik("", "", new int[]{2, 3, 1, 4, 5});
        u2.ispisatiProsek();
        u2.ispisKakavJeDjak();

        System.out.println("====================");

        Ucenik u3 = new Ucenik();
        System.out.println(u3.ime);
        System.out.println(u3.prezime);
        System.out.println(u3.prosek);
        System.out.println(u3.ocene);
        System.out.println("====================");

        u3.ocene = new int[]{2, 3, 4};
        u3.prosek = u3.izracunajProsek(u3.ocene);
        u3.ispisatiProsek();


    }


}
