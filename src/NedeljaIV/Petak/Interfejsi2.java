package NedeljaIV.Petak;

public interface Interfejsi2 {


    /*
     * - Interfejsi mogu da imaju i implementacije metoda
     * - Takve metode se nazivaju default metode.
     *  default <tipPovratneVrednost> <imeMetode>(<argumenti>) {....} 
     * 
     * 
     * 
     */

    default void implentiranaMetoda() {
    System.out.println("...");
    }


    /*
     * 
     * privatne metode/promenjive
     * 
     * - sluze nam kao i pomocne metode
     * 
     */

     private void f() {
        //....
     }
    
    
}
