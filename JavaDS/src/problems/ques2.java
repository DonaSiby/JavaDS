package problems;
//Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//        1. 5 if a perfect square
//        2. 4 if multiple of 4 and divisible by 6
//        3. 3 if even number

public class ques2 {
    public static void main(String[] args) {
        int arr[] = {10,36,54,89,12};
        weights(arr);
    }
    private static void weights(int[] arr){
        for(int element:arr){
            int weight = 0;
            if(Math.sqrt(element)==Math.round(Math.sqrt(element))){
                weight = 5;
            } else if ((element%4==0) && (element%6==0)){
                weight = 4;
            } else if (element%2==0) {
                weight = 3;
            }
            System.out.println("<"+element+">"+"  "+"<"+weight+">");
        }
    }
}
