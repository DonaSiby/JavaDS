public class ques6 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        smallest(arr);
    }
    public static void smallest(int[] arr) {
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[0]);
    }
}
