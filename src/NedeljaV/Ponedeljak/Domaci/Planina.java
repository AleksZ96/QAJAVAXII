package NedeljaV.Ponedeljak.Domaci;

public class Planina {
    //Napraviti klasu Planina koja ima vrednosti za naziv planine i njenu visinu.

    private String nazivPlanine;
    private double visinaPlanine;

    public Planina(String nazivPlanine, double visinaPlanine) {
        this.nazivPlanine = nazivPlanine;
        this.visinaPlanine = visinaPlanine;
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv planine: ").append(nazivPlanine).append("\n");
        sb.append("Visina planine: ").append(visinaPlanine);
        return sb.toString();
    }
}
