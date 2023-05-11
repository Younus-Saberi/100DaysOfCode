package arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    static void swap(int[] arr,int index01,int index02){
        int temp=arr[index01];
        arr[index01]=arr[index02];
        arr[index02]=temp;
    }


}
