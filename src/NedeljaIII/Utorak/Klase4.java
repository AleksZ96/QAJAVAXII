package NedeljaIII.Utorak;

public class Klase4 {

    /*
     * Enkapsulacija
     *
     * Enkapsulacija je proces u kome smanjujemo vidiljivost odredjenim
     * atributima odnosno metodama neke klase.
     *
     * Ovo radimo uglavnom iz nekih bezbednostih razloga, ili radi
     * bolje organizacije kod
     *
     *
     *
     * */

    public static void main(String[] args) {
        Ucenik u1 = new Ucenik();
        u1.ime = "s"; // <- ovo je dirketno menanje atributa objekta klase Ucenik
        u1.ime = "sq"; //<- zelimo ovako nesto da onemogucimo!
    }
}