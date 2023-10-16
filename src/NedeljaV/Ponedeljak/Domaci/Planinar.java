package NedeljaV.Ponedeljak.Domaci;

import java.util.ArrayList;

public abstract class Planinar {
    //Kreirati apstraktnu klasu Planinar koja ima atribute za ime planinara, listu planina i maksimalnu visinu na koju planinar moze da se popne.

    private String imePlaninara;
    private ArrayList<Planina> listaPlanina;
    private double maksimalnaVisina;

    public Planinar(String imePlaninara, ArrayList<Planina> listaPlanina) {
        this.imePlaninara = imePlaninara;
        this.listaPlanina = listaPlanina;
    }

    public String getImePlaninara() {
        return imePlaninara;
    }

    public void setImePlaninara(String imePlaninara) {
        this.imePlaninara = imePlaninara;
    }

    public ArrayList<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(ArrayList<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public double getMaksimalnaVisina() {
        return maksimalnaVisina;
    }

    public void setMaksimalnaVisina(double maksimalnaVisina) {
        this.maksimalnaVisina = maksimalnaVisina;
    }

    //Ova klasa takodje ima metode:
    //-popniSe(Planina p) - Ukoliko planina nije previse visoka za planinara i nije u njegovoj listi, dodati je.


    void popniSe(Planina p){
        boolean daLiPlaninaPostojiUListi;
            if(!listaPlanina.contains(p)){
                if(p.getVisinaPlanine() <= maksimalnaVisina){
                    listaPlanina.add(p);
                }
            }

    }


    //-crnaLista() - Vraca listu planina iz planinarovog spiska, na koje on ne moze da se popne.

      ArrayList<Planina> crnaLista(){
          ArrayList<Planina> listaPlaninaNaKojeSeNeMozePopeti = new ArrayList<>();
         for (Planina planina : getListaPlanina()){
             if(planina.getVisinaPlanine() > maksimalnaVisina){
                 listaPlaninaNaKojeSeNeMozePopeti.add(planina);
             }
         }
         return listaPlaninaNaKojeSeNeMozePopeti;
     }

    //-ukupnoMetara() - Vraca ukupnu visinu svih planina na koje se planinar popeo.

     double ukupnoMetara(){
        double sum = 0;
        for (Planina planina : listaPlanina){
            if(planina.getVisinaPlanine() < maksimalnaVisina){
                sum += planina.getVisinaPlanine();
            }
        }
        return sum;
     }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime planinara: ").append(imePlaninara).append("\n");
        sb.append("Lista planina: ").append(listaPlanina).append("\n");
        sb.append("Maksimalna visina: ").append(maksimalnaVisina);
        return sb.toString();
    }
}
