package problems;//Given an array of integers nums which is sorted in
//ascending order, and an integer target, write a
//function to search target in nums. If target exists,
//then return its index. Otherwise, return -1. You must
//write an algorithm with O(log n) runtime
//complexity.

import java.util.Arrays;

public class ques10 {
    public static void main(String[] args) {
        int[] array ={1,3,5,2,4,7};
        Arrays.sort(array);
        System.out.println("Sorted array is "+Arrays.toString(array));
        int target=9;
        int result=findTarget(target,array);
        if (result==-1){
            System.out.println("Target not present in the array");
        }
        else{
            System.out.println("Target "+target+" present at index "+result);
        }
    }
    public static int findTarget(int num,int[] array){
        int size = array.length;
        for (int i=0;i<size;i++){
            if (array[i]==num){
                return i;
            }
        }
        return -1;
    }
}
