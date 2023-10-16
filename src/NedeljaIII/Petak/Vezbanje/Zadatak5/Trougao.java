package NedeljaIII.Petak.Vezbanje.Zadatak5;

public class Trougao {
    //5. Napisati klasu Trougao koja ima 3 double atributa za polja.
    //Napraviti metodu 'daLiJeTrougaoValidan', koji proverava da li 3 prosledjene stranice mogu da budu stranice nekog trougla.
    //Trougao nije validan ako je zbir bilo kojih dveju stranica strogo manji od duzine trece ili ako je neka stranica nepozitivne duzine.
    //Napraviti konstruktor koji prima 3 argumenta za atribute i proverava njihovu validnost. Ako nisu validni, ispisati neku odgovarajucu
    // poruku i postaviti sve stranice na -1.
    //Napraviti gettere i settere za svako polje, kao i metode 'obim' i 'povrsina'
    //(Pogledati heronov obrazac: https://en.wikipedia.org/wiki/Heron%27s_formula)
    //Napraviti toString() metod:
    //Duzina stranice A je: {stranicaA}
    //Duzina stranice B je: {stranicaB}
    //Duzina stranice C je: {stranicaC}

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    boolean daLiJeTrougaoValidan(){
        if(stranicaA + stranicaB < stranicaC || stranicaA + stranicaC < stranicaB || stranicaC + stranicaB < stranicaA){
            return false;
        }
        else if (stranicaA < 0 || stranicaB < 0 || stranicaC < 0) {
            return false;
        }
        return true;
    }

    public Trougao(double stranicaA, double stranicaB, double stranicaC){
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
        boolean daLiJeValidan = daLiJeTrougaoValidan();
        if(daLiJeValidan == false){
            setStranicaA(-1);
            setStranicaB(-1);
            setStranicaC(-1);
        }

    }

    public double getStranicaA() {
        return stranicaA;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }


    public double vratiObimTrougla(){
        if(!daLiJeTrougaoValidan())
            return -1;
        double obimTrougla = stranicaA + stranicaB + stranicaC;
        return obimTrougla;
    }

    public double vratiPovrsinuTrougla(){
        if(!daLiJeTrougaoValidan())
            return -1;
        double poluobim = vratiObimTrougla()/2;
        double vrednostIzmedju = poluobim * (poluobim - stranicaA) * (poluobim - stranicaB) * (poluobim - stranicaC);
        double povrsinaTrougla = Math.sqrt(vrednostIzmedju);
        return povrsinaTrougla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stranica A: ").append(stranicaA).append("\n");
        sb.append("Stranica B: ").append(stranicaB).append("\n");
        sb.append("Stranica C: ").append(stranicaC).append("\n");

        return sb.toString();
    }
}
