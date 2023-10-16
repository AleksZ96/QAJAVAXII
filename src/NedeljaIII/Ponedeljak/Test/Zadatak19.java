package NedeljaIII.Ponedeljak.Test;

public class Zadatak19 {
    static int[] saberiDvaNizaProizvoljneDuzine(int[] niz1, int[] niz2){
        int[] kraci;
        int[] duzi;
        if(niz1.length > niz2.length){
            duzi = niz1;
            kraci = niz2;
        }
        else{
            duzi = niz2;
            kraci = niz1;
        }
       int[] rezultujuciNiz = new int [duzi.length];
        for (int i = 0; i < duzi.length; i++) {
            if(i < kraci.length){
                rezultujuciNiz[i] = kraci[i] + duzi[i];
            }
            else{
                rezultujuciNiz[i] = duzi[i];
            }
            System.out.println(rezultujuciNiz[i]);
        }
        return rezultujuciNiz;
    }


    public static void main(String[] args) {


    //19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
    //Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]
    //b)** -//- bez kreiranja dodatnih nizova
       saberiDvaNizaProizvoljneDuzine(new int[]{1, 2, 3}, new int[]{1, 5});

    }
}
