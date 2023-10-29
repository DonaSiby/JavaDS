package problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PerfectNumber {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                int T = Integer.parseInt(line); // Number of test cases

                for (int t = 0; t < T; t++) {
                    line = reader.readLine();
                    int N = Integer.parseInt(line); // Input number for this test case

                    // Calculate the sum of proper positive divisors
                    int sum = 0;
                    for (int i = 1; i < N; i++) {
                        if (N % i == 0) {
                            sum += i;
                        }
                    }

                    // Check if it's a perfect number
                    if (sum == N) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the input file.");
            e.printStackTrace();
        }
    }
}
