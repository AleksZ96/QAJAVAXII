package NedeljaIII.Petak.Statik;

public class TestAutomobil {

    public static void g() {

    }

    public static int f(){
        g();
        return -1;
    }


    public static void main(String[] args) {

        Automobil a1 = new Automobil("Audi", "A4", 'b', 5, 1000);
        Automobil a2 = new Automobil("Audi", "A4", 'b', 5, 1000);
        Automobil honda = new Automobil("Honda", "Civic", 'b', 4, 1200);

        System.out.println("Sasija od a1 = " + a1.getBrojSasije());
        System.out.println("Sasija od a2 = " + a2.getBrojSasije());
        System.out.println("Sasija od honde = " + honda.getBrojSasije());

        //Interesuje me koji je poslednji sasiski broj (tj. koliko imam objekata klase Automobil)
        System.out.println("Broj objekata klase Automobil je: " + Automobil.getBrojObjekataOveKalse());
    }
}
