
// Write a program in Java that allows you to calculate the average of three integers
//entered by the user.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer");
        int first = scanner.nextInt();
        System.out.println("Enter second integer");
        int second = scanner.nextInt();
        System.out.println("Enter third integer");
        int third = scanner.nextInt();

        int sum = first + second + third;

        System.out.println("the average of your integers: " + sum);
    }
}