import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Write a program in Java that allows you to enter two numbers and display their product
    Scanner number = new Scanner(System.in);

    System.out.println("Enter your number");
    var num = number.nextFloat(); // var OR float
    System.out.println("Enter your number");
    var num2 = number.nextFloat(); // var OR float
    Float product = num * num2;
    System.out.println("the product is " + product);

    }
}