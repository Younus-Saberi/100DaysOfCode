package patterns;

/*This code will generate the pattern in below format
`1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5`
*/

public class Pattern03 {
    public static void main(String[] args) {
        pattern03(5);
    }
    static void pattern03(int n){
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=rows; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
            
        }
    }
}
