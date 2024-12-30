import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names =  {"ibrahim", "ali", "mohammed", "ahmed", "khalid"};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
try {
    for (int number : numbers) {
        System.out.println(numbers[number]);
        for (String name : names) {
            System.out.println(names[Integer.parseInt(name)]);

        }
    }
} catch (Exception e) {
    throw new RuntimeException(e);
}

    }
}