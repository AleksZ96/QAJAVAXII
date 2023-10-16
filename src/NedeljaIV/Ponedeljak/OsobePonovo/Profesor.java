package NedeljaIV.Ponedeljak.OsobePonovo;

public class Profesor extends Osoba {
    private double plata;

    public Profesor(String ime, String prezime, int brojGodina, double plata) {
        super(ime, prezime, brojGodina);
        this.plata = plata;
    }

    public Profesor() {

    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Plata: ").append(plata);
        return sb.toString();
    }
}
