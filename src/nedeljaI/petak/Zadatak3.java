package nedeljaI.petak.zadaci;

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
        int godine = sc.nextInt();
        double visina = sc.nextDouble();
        double minVisia = sc.nextDouble();

        if (godine > 16 || visina >= minVisia)
            System.out.println("Dobro dosli");
        else //nema 17 godina I nije vise od minimalne vise
            System.out.println("Ne mozete prisustvovati ...");
    }
}
