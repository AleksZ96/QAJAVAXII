package NedeljaIV.Cetvrtak.Vezbanje;

public class Geometrija2D extends Geometrija {


    public class Kvadrat{

        private int stranicaA;

        public Kvadrat(int stranicaA) {
            this.stranicaA = stranicaA;
        }

        public int getStranicaA() {
            return stranicaA;
        }

        public void setStranicaA(int stranicaA) {
            this.stranicaA = stranicaA;
        }

        double vratiObimKvadrata(){
            double obim = 4 * stranicaA;
            return obim;
        }

        double vratiPovrsinuKvadrata(){
            double povrsina = stranicaA * stranicaA;
            return povrsina;
        }

    }






}
