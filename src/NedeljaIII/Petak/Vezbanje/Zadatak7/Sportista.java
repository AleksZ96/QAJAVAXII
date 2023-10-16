package NedeljaIII.Petak.Vezbanje.Zadatak7;

public class Sportista {
    private String imeIPrezime;
    private String sport;
    private String klub;

    private int brojNaDresu;


    public Sportista(String imeIPrezime, String sport, String klub, int brojNaDresu) {
        this.imeIPrezime = imeIPrezime;
        this.sport = sport;
        this.klub = klub;
        this.brojNaDresu = brojNaDresu;
    }
    public Sportista(String imeIPrezime, String sport, int brojNaDresu) {
        this.imeIPrezime = imeIPrezime;
        this.sport = sport;
        this.brojNaDresu = brojNaDresu;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }

    public void setBrojNaDresu(int brojNaDresu) {
        this.brojNaDresu = brojNaDresu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime i prezime: ").append(imeIPrezime).append("\n");
        sb.append("Sport kojim se bavi: ").append(sport).append("\n");
        sb.append("Klub za koji igra: ").append(klub).append("\n");
        sb.append("Broj koji nosi na dresu ").append(brojNaDresu).append("\n");


        return sb.toString();
    }
}
