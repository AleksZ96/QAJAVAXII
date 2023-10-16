package NedeljaIII.Petak.Vezbanje.Zadatak5;

public class Test {
    public static void main(String[] args) {
        Trougao trougao1 = new Trougao(-2, 5, 5);


        if(trougao1.daLiJeTrougaoValidan()){
            System.out.println(trougao1.vratiPovrsinuTrougla());
            System.out.println(trougao1.vratiObimTrougla());
        }
        else{
            System.out.println("Trougao nije validan");
        }



    }
}
