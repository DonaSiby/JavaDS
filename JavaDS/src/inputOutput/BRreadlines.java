package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRreadlines {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string, 'stop' to end: ");
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
