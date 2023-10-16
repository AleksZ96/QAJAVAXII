package NedeljaIII.Utorak;

public class TestOsobaPonovo {

    public static void main(String[] args) {
        OsobaPonovo o1 = new OsobaPonovo("Pera", "Peric", 20, 190);

        System.out.println("Pera Peric je visok: " + o1.getVisina());
        o1.setVisina(-170);
        System.out.println("Pera peric je visok: " + o1.getVisina());


        /*
        Koja je BITNA razlika izmedju ova dva pristupa?
        System.out.println("Pera Peric je visok: " + o1.visina);
        o1.visina = -170
        System.out.println("Pera peric je visok: " + o1.visina); */
    }
}
