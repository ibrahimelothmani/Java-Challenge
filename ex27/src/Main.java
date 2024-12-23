import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 8, 7, 9, 3, 4, 6, 5};
        int target;
        boolean isFound = false;
        System.out.print("Enter the number to search for: ");
        target = scanner.nextInt();
        for(int i =0; i<array.length; i++){
            if(array[i] == target){
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
        scanner.close();
    }
}