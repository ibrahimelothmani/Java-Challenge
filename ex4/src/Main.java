import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Write a program in Java that allows you to display whether an integer typed on the
        //keyboard is even or odd.

        Scanner number = new Scanner(System.in);

        System.out.println("Put your number");
        float display = number.nextInt();

        if(display % 2 != 0){
            System.out.println("your number is even ");
        }else {
            System.out.println("your number is odd ");
        }
    }
}