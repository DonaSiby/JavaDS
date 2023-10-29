import java.util.Arrays;

public class ques8 {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] charArray = str.toCharArray();
        System.out.println("Array before reversing : "+Arrays.toString(charArray));
        reverseString(charArray);
    }
    public static void reverseString(char[] charArray){
        char temp = 0;
        int i = 0;
        int size = charArray.length-1;
        while (i<size){
            temp = charArray[i];
            charArray[i] = charArray[size];
            charArray[size] = temp;
            i++;
            size--;
        }
        System.out.println("Array after reversing : "+Arrays.toString(charArray));
    }
}
