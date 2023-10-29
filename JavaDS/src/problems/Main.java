package problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
        System.out.println("Enter your roll no :");
        int rollno = input.nextInt();
        System.out.println("Your Roll-number is : "+rollno);
    }
}