public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            reversed = reversed * 10 + pop;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();

        // Example 1
        int x1 = 121;
        System.out.println("Is palindrome: " + solution.isPalindrome(x1));  // Output: true

        // Example 2
        int x2 = -121;
        System.out.println("Is palindrome: " + solution.isPalindrome(x2));  // Output: false

        // Example 3
        int x3 = 10;
        System.out.println("Is palindrome: " + solution.isPalindrome(x3));  // Output: false
    }
}
