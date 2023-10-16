package NedeljaIII.Petak.Vezbanje.Zadatak12;

public class Elipsa {
    /*
    Napisati klasu Elipsa koja sadrzi atribute:
- double a (prva poluosa)
- double b (druga poluosa)

     */
    private double a;
    private double b;


    /*
    Napisati 2 konstruktora:
- Jedan konstruktor koji prima sve argumente
- Podrazumevani konstruktor
     */

    public Elipsa(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Elipsa() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //Napisati metode:
    //1. povrsina - koja vraca povrsinu elipse

    double vratiPovrsinuElipse(){
        double povrsina = Math.PI * a * b;
        return povrsina;
    }

    //2. ekscentritet - koja vraca eskcentritet elipse

    double vratiEkscentricitetElipse(){
        double nekaVrednost = Math.pow(manjaPoluosa(), 2) / Math.pow(vecaPoluosa(), 2);
        double nekaVrednost1 = 1 - nekaVrednost;
        double ekscentricitet = Math.sqrt(nekaVrednost1);

        return ekscentricitet;
    }
    //3. vecaPoluosa - koja vraca duzinu vece poluose
    double vecaPoluosa(){
        if(a > b){
            return a;
        }
        return b;
    }

    //4. manjaPoluosa - koja vraca duzinu manje poluose
    double manjaPoluosa(){
        if(a < b){
            return a;
        }
        return b;
    }
    /*
    Overridovati toString() metod tako da vraca nisku oblika:
"Elipsa vece poluose: <vecaPoluosa> i manje poluose: <manjaPoluosa> ima
 Povrsinu: <povrsina>
 Ekscentritet: <eskcentritet>"

     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Elipsa vece poluose: ").append(vecaPoluosa()).append(" i manje poluose: ").append(manjaPoluosa()).append(" ima ").append("\n");
        sb.append("Povrsinu: ").append(vratiPovrsinuElipse()).append("\n");
        sb.append("Ekscentricitet: ").append(vratiEkscentricitetElipse()).append("\n");
        return sb.toString();
    }
}
