package problems;

public class b {
    public static void main(String[] args) {
        String string1 = "abcdefg";
        String string2 = "hin";
        if (string1.indexOf(string2)!=-1){
            System.out.println("Substring");
        }
        else {
            System.out.println("Not a substring");
        }
    }
}
