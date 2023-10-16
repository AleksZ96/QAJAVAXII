package NedeljaII.Petak.Vezbanje;

public class Zadatak17 {

    static boolean proveraPostojanjaImenaMarijaIliPetar(String[] nizImena){
        boolean postojanjeImena = false;

        for (int i = 0; i < nizImena.length; i++) {
            if(nizImena[i] == "Marija" || nizImena[i] == "Petar")
                return true;
        }
        return postojanjeImena;
    }
    public static void main(String[] args) {
        //17. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
       boolean postojanjeImena = proveraPostojanjaImenaMarijaIliPetar(new String[]{"Sofija", "Marija"});
        System.out.println("U nizu postoji ime Marija ili Petar: " + postojanjeImena);
    }
}
