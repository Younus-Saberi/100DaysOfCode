package patterns;


/*
* This code will print the pattern in below format
*
* `*
*  **
*  ***
*  ****`
*
* */
public class pattern01 {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
