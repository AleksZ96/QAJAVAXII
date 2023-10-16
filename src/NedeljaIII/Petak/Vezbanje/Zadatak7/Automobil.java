package NedeljaIII.Petak.Vezbanje.Zadatak7;

public class Automobil {

        private String marka;
        private String model;
        private int serijskiBroj;

        private String vlasnik;

        public Automobil(String marka, String model, int serijskiBroj) {
                this.marka = marka;
                this.model = model;
                this.serijskiBroj = serijskiBroj;
        }

        public Automobil(String marka, String model, int serijskiBroj, String vlasnik) {
                this.marka = marka;
                this.model = model;
                this.serijskiBroj = serijskiBroj;
                this.vlasnik = vlasnik;
        }


        public String getMarka() {
                return marka;
        }


        public String getModel() {
                return model;
        }


        public int getSerijskiBroj() {
                return serijskiBroj;
        }


        public String getVlasnik() {
                return vlasnik;
        }

        public void setVlasnik(String vlasnik) {
                this.vlasnik = vlasnik;
        }

        @Override
        public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Marka: ").append(marka).append("\n");
                sb.append("Model: ").append(model).append("\n");
                sb.append("Serijski broj: ").append(serijskiBroj).append("\n");
                sb.append("Vlasnik: ").append(vlasnik).append("\n");

                return sb.toString();
        }
}
