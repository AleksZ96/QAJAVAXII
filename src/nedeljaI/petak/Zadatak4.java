package nedeljaI.petak.zadaci;

import java.util.Scanner;

public class Zadatak4{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*4.
 Korisnik unosi ceo broj x.
Ispisati apsolutnu vrednost broja x
Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost
*/

        //|x| = +x  |5| = 5 ... |-5| = 5
        int x = sc.nextInt();
        boolean znakJePromenje = false; //shift+f6 - rename
        if (x < 0) {
            x *= -1; // *= -1 <- menja znak promenjivoj
            znakJePromenje = true; //Ovo je nesto sto se naziva "flag"
        }

        System.out.println(x);


        if (znakJePromenje) //znakJePromenjen == true
            System.out.println("Promenjen je znak");
    }
}