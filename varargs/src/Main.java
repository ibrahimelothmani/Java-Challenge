public class Main {
    public static void main(String[] args) {
        System.out.println(add(1, 2));  // Output: 3
        System.out.println(add(1, 2, 3));  // Output: 6
    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}