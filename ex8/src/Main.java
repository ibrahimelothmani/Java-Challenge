

// Write a program in Java that calculates the absolute value of an integer entered by the user

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put your value m");
        int m = scanner.nextInt();;
        if(m > 0)
            System.out.println("your value: " +  m + " is positive");
        if (m < 0)
            System.out.println("your value: " +  m + " is negative");
    }
}