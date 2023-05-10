package patterns;
/*
* This code will generate the pattern in below format
`
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

`
* */

public class Pattern04 {
    public static void main(String[] args) {
        pattern04(5);
    }
    static void pattern04(int n){
        for (int rows = 0; rows < 2 * n ; rows++) {
            // total cols in each row formula
            int totalColsInRow = rows > n ?  2 * n - rows : rows ;
            for (int cols = 0; cols < totalColsInRow; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
