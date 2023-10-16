package NedeljaIII.Ponedeljak.Vezbanje;

public class Zadatak3 {

    //Napisati funkciju koja ispisuje elemente niza.
    // Za svaki tip niza napisati posebnu funkciju koja ga ispisuje
    // (int[], double[], boolean[], String[], char[])

    static void ispis(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void ispis(double[] arr) {
        for (double e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void ispis(boolean[] arr) {
        for (boolean e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void ispis(char[] arr) {
        for (char e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void ispis(String[] arr) {
        //Nije moralo ovako detljano - moglo je i copy-paste kao i prethodni
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("\"" + arr[i] + "\", ");
        }
        System.out.print("\"" + arr[arr.length - 1] + "\"]");
        System.out.println();
    }

}