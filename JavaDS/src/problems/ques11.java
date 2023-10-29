import java.util.Arrays;
import java.util.stream.IntStream;

//        Given two sorted arrays numsl and nums2 of size m
//        and n respectively, return the median of the two
//        sorted arrays. The overall run time complexity
//        should be O(log (m+n)).
public class ques11 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 ={6,7,8,9,10};

        int[] merged = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray();
        System.out.println("Merged Array : "+Arrays.toString(merged));
        int result = median(merged);
        System.out.println("The median of the two given arrays is "+result);
    }
    public static int median(int[] merged){
        int size = merged.length-1;
        int middle = (size/2 + ((size/2)+1))/2;
        if (size%2!=0){
            return middle;
        }
        return size/2;
    }
}
