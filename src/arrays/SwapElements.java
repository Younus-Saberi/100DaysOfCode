package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        System.out.println("\nSwap Elements in an array");
        int[] arr={1,2,3,4,5};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index01,int index02){
        int temp=arr[index01];
        arr[index01]=arr[index02];
        arr[index02]=temp;
    }
}
