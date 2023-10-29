import java.util.Arrays;

public class ques5b {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array "+Arrays.toString(arr));
        swap(arr);

    }
    public static void swap(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (end>start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println("Array after swapping "+ Arrays.toString(arr));
    }
}
