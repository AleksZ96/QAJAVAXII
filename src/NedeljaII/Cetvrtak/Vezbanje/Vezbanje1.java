package NedeljaII.Cetvrtak.Vezbanje;

public class Vezbanje1 {
    public static void main(String[] args) {
        int[] nesto = new int[] {1, 2, 3, 4};


        /*System.out.println(nesto[3]);

         int sum = 0;
        for (int i = 0; i < nesto.length; i++) {
            if( nesto[i] % 2 == 0) {
                sum += nesto[i];
                System.out.println(nesto[i]);
            }
        }
        System.out.println(sum);
for( int broj : nesto){
            System.out.println(broj);
        }
         */





      /*  int max = nesto[0];
        for (int i = 0; i < nesto.length; i++) {
            if( nesto[i] > max) {
                max = nesto[i];
            }
        }
        System.out.println(max);

       */


        int[][] dupliNiz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
        };

        System.out.println(dupliNiz.length);

        System.out.println(dupliNiz[0].length);
        System.out.println(dupliNiz[0][3]);
/*
        for (int i = 0; i < dupliNiz.length; i++) {
            System.out.println(dupliNiz[i].length);
            for (int j = 0; j < dupliNiz[i].length; j++) {

                System.out.println(dupliNiz[i][j]);
            }

        }

 */
        for(int[] element : dupliNiz){
            for(int broj : element){
                System.out.println(broj);
            }
        }





    }
}
