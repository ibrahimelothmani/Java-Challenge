import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 9, 8, 6, 5};
        int stream = Arrays.stream(arrays)
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(stream);
    }
}