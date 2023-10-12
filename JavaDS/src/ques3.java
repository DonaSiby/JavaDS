public class ques3 {
    public static void main(String[] args) {
        System.out.println("Odd numbers are : ");
        findOdds(2,15);
    }
    public static void findOdds(int start,int end){
        for (int i = start; i<=end; i++){
            if (i%2 != 0){
                System.out.println(i+" ");
            }
        }
    }
}
