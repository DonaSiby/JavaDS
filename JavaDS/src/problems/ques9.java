package problems;

//Given a string sl and a string s2, write a function to
//check whether s2 is a rotation of sl.
public class ques9 {
    public static void main(String[] args) {
        String string1 = "abcdefg";
        String string2 = "efgabcd";
        stringRotation(string1,string2);
    }
    public static void stringRotation(String string1,String string2){
        int size1 = string1.length();
        int size2 = string2.length();

        if ((size1==size2) && ((string1+string1).indexOf(string2)!=-1)){
            System.out.println("String 2 is rotation of string 1");
        }
        else {
            System.out.println("String 2 is not the rotation of string 1");
        }
    }
}
