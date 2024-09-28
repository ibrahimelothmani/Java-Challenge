import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Write a program in Java that allows you to display the largest of three integers typed
//        on the keyboard.

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");

        float firstValue = scanner.nextInt();

        System.out.println("ENTER YOUR SECOND NUMBER");
        float secondValue = scanner.nextInt();

        System.out.println("ENTER YOUR THIRD NUMBER");
        float thirdValue = scanner.nextInt();

        //The class Math contains methods for performing basic numeric operations such as the elementary exponential,
        // logarithm,
        // square root,
        // and trigonometric functions.

        float max = Math.max(firstValue, Math.max(secondValue, thirdValue));
        System.out.println("MAX VALUE BETWEEN YOUR VALUE IS " + max);


    }
}