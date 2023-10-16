package nedeljaI.petak.switchcase;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*
* 3.
Korisnik unosi broj svojih godina (int), svoju visinu u metrima (double) i
* minimalnu potrebnu visinu za ulazak u luna park(double).
Ispisati poruku:
- "Dobro dosli" - ukoliko je korisnik strogo stariji od 16 godina
                  ili visi od minimalne visine.
- "Ne mozete prisustvovati luna parku" - inace
* */
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj svojih godina");
        int x = sc.nextInt();
        System.out.println("Unesite svoju visinu");
        double y = sc.nextDouble();
        System.out.println("Unesite minimalnu potrebnu visinu za ulazak u luna park");
        double z = sc.nextDouble();

        if (x > 16 && y >= z) {
            System.out.println("Dobro dosli");
        }
        else {
            System.out.println("Ne mozete prisustvovati luna parku");
        }

    }
}
