import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array;
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 10) {
            number = random.nextInt(0, 10);
            System.out.println("Random number is: " + number);
            for (int i = 0; i < 10; i++) {
                array = new int[10];
                array[i] = random.nextInt(0, 10);
                System.out.println("the new array is: " + array[i]);
            }
        } else if (number > 10 && number < 50) {
            number = random.nextInt(10, 50);
            System.out.println("Random number is: " + number);
            for (int i = 0; i < 50; i++) {
                array = new int[50];
                array[i] = random.nextInt(10, 50);
                System.out.println("the new array is: " + array[i]);
            }
        } else if (number > 50 && number < 100) {
            number = random.nextInt(50, 100);
            System.out.println("Random number is: " + number);
            for (int i = 0; i < 100; i++) {
                array = new int[100];
                array[i] = random.nextInt(50, 100);
                System.out.println("the new array is: " + array[i]);
            }
        }
    }
}