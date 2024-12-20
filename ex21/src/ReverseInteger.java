public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE/10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            reversed = reversed * 10 + pop;
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Example 1
        int x1 = 123;
        System.out.println("Reversed: " + solution.reverse(x1));  // Output: 321

        // Example 2
        int x2 = -123;
        System.out.println("Reversed: " + solution.reverse(x2));  // Output: -321

        // Example 3
        int x3 = 120;
        System.out.println("Reversed: " + solution.reverse(x3));  // Output: 21
    }
}
