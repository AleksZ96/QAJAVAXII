package NedeljaIV.Ponedeljak.Knjizara;

import java.util.ArrayList;

public class Autor extends Osoba{
    /*
    3. Autor
      - prosiruje Osobu
      - ArrayList<Knjige> knjigeKojeJeNapisao;
     */

   private ArrayList<Knjiga> knjigeKojeJeNapisao;

    public Autor(String ime, String prezime, int brojGodina, ArrayList<Knjiga> knjigeKojeJeNapisao) {
        super(ime, prezime, brojGodina);
        this.knjigeKojeJeNapisao = knjigeKojeJeNapisao;
    }

    public Autor(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
    }
    /*  public Autor() {
    }

   */

    public ArrayList<Knjiga> getKnjigeKojeJeNapisao() {
        return knjigeKojeJeNapisao;
    }

    public void setKnjigeKojeJeNapisao(ArrayList<Knjiga> knjigeKojeJeNapisao) {
        this.knjigeKojeJeNapisao = knjigeKojeJeNapisao;
    }

}
