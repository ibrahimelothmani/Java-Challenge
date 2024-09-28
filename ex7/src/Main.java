

//Write a program in Java that asks the user for two numbers, m and n, and then
//informs him whether the product of these two numbers is positive or negative. The
//program includes the case where the product can be zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put Your Number m");
        int m = scanner.nextInt();
        System.out.println("Put Your Number n");
        int n = scanner.nextInt();

        int product = n + m;
        if (product == 0){
            System.out.println("Your product is "+ product + " => zero");
        }
        else if (product > 0){
            System.out.println("Your product is "+ product + " => positive");
        }else {
            System.out.println("Your product is "+ product + " => negative");
        }
    }
}