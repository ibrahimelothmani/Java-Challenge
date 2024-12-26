import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int length = numbers.toArray().length;
        System.out.println("Enter the number of elements in the array: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < number1; i++) {
            numbers.add(scanner.nextInt());
            count++;
            System.out.println("the array is: " + numbers + " and the count is: " + count + " and the length is: " + length);
        }
    }
}