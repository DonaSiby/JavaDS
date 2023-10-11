import java.util.HashSet;

public class hs {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Ajay");
        set.add("Emy");
        set.add("Georlit");

        if (!set.add("Ajay")){
            System.out.println("True");
        }
    }
}
