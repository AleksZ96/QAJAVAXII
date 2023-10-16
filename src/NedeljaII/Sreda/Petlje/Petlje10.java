package nedeljaII.sreda.petlje;

import java.util.Scanner;

public class Petlje10{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Trik
        int n = sc.nextInt();

        //min = +oo, max = -oo
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        int i = 0;
        while (i < n) {
            int trenutniBroj = sc.nextInt();
            //System.out.println(trenutniBroj);
            //System.out.println(min);
            //System.out.println(max);
            if (trenutniBroj < min)
                min = trenutniBroj;
            if (trenutniBroj > max)
                max = trenutniBroj;

            i++;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
