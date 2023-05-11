package arrays;

public class CheckSorted {
    public static void main(String[] args) {
        System.out.println("\nCheck if an array is sorted");
        int[] arr={1,2,3,4,5};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}

//todo: add more snippets from src\arrays\secondlargest.java