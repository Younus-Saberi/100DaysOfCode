package patterns;

/*

This will print the pattern in below format

`* * * * *
 * * * *
 * * *
 * *
 *`

*/

public class Pattern02 {
    public static void main(String[] args) {
        pattern02(5);
    }
    static void pattern02(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = rows; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
