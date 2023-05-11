package arrays;

public class Max {
public static void main(String[] args) {
        System.out.println("\nFind Max in an array");
        int[] arr={1,2,3,4,5};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
