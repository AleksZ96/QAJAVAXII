package NedeljaIII.Petak.Vezbanje.Zadatak8;

public class Osoba {
    private String imeIPrezime;

    public Osoba(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    @Override
    public String toString() {
        return imeIPrezime.toString();
    }
}
