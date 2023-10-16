package NedeljaIII.Petak.Vezbanje.Zadatak8;

public class Grad {
    private String grad;
    private int brojStanovnika;
    private String drzava;

    public Grad(String grad, int brojStanovnika, String drzava) {
        this.grad = grad;
        this.brojStanovnika = brojStanovnika;
        this.drzava = drzava;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getBrojStanovnika() {
        return brojStanovnika;
    }

    public void setBrojStanovnika(int brojStanovnika) {
        this.brojStanovnika = brojStanovnika;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime grada: ").append(grad).append("\n");
        sb.append("Broj stanovnika: ").append(brojStanovnika).append("\n");
        sb.append("Drzava: ").append(drzava).append("\n");
        return sb.toString();
    }
}
