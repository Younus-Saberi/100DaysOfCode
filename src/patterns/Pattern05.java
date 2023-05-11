package patterns;

/*
The code below will generate the pattern in below format

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

 */
public class Pattern05 {
    public static void main(String[] args) {
        pattern05(5);
    }
    static void pattern05(int n){
        // code generate by coploit while sloving the problem
//        for (int rows = 1; rows <= 2 * n - 1; rows++) {
//            int totalColsInRow = rows > n ? 2 * n - rows : rows;
//            for (int spaces = 1; spaces <= n - totalColsInRow; spaces++) {
//                System.out.print(" ");
//            }
//            for (int cols = 1; cols <= totalColsInRow; cols++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int rows = 0; rows < 2*n; rows++) {

            // total * in each row formula
            int totalColsInRow= rows > n ? 2 * n - rows : rows;

            // total space in each row formula
            int totalSpace = n - totalColsInRow;

            // loop to print only space from eech row
            for (int k = 0; k < totalSpace; k++) {
                System.out.print(" ");
            }

            // loop to print * in each cols
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
