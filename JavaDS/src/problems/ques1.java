package problems;//Find the maximum area of the triangle whose base and height are given and round off the answer to 1 decimal point.

public class ques1 {
    public static void main(String[] args) {
        System.out.println(area(5,6));
    }
    static double area(int base , int height){
        double area = 0.5 * base * height;
        return Math.round(area);
    }
}
