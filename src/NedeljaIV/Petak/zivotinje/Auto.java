package NedeljaIV.Petak.zivotinje;

public class Auto implements Pokretljivost {
    
    private String marka;

    public Auto(String m) {marka = m;}

    @Override
    public void pokerniSe() {
        System.out.println("Ja se krecem pomocu goriva");
    }
    
}
