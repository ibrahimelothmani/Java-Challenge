
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Write a program in Java that allows you to swap the contents of two integers A and
        //B entered by the user, and display these integers after the swap
        Scanner number = new Scanner(System.in);

        System.out.println("Enter your number");
        float A = number.nextInt();
        System.out.println("Enter your number");
        float B = number.nextInt();

        System.out.println("before swap: A = "+A+ " and B = "+B);
            float temp = A;
            A = B;
            B = temp;
        System.out.println("after swap: A = "+A+ " and B = "+B);

    }
}