package NedeljaIV.Petak.zivotinje;

public class Test {

    public static void main(String[] args) {
        Covek c = new Covek("a", "b", 20);
        Pas p = new Pas("dzeki");
        Orao o = new Orao(2.5);

        

        c.pokerniSe();
        p.pokerniSe();
        o.pokerniSe();

        /*
         * "Prednosti" (u ovom slucaju) interfejsa u odnosu na abstraktnu natklasu:
         * 1. Mozemo da kreiramo klasu koja ne implementira metodu pokreniSe();
         * 2. Mozemo da kreiramo 
         * 
         * 
         */

         Auto a = new Auto("Fiat");
         a.pokerniSe();
    }
    
}
