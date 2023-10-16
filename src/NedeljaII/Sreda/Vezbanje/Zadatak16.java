package NedeljaII.Sreda.Vezbanje;

public class Zadatak16 {
    public static void main(String[] args) {
        //16. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
        int proizvod = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 ; j++) {
                proizvod = i * j;
                System.out.print(proizvod + "\t" );
            }
            System.out.println();
        }
    }
}
