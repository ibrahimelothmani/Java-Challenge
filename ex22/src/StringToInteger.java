public class StringToInteger {
    public int myAtoi(String s) {
        int index = 0, sign = 1, total = 0;
        // Check if empty string
        if (s.length() == 0) return 0;

        // Remove leading spaces
        while (index < s.length() && s.charAt(index) == ' ')
            index++;

        // Check for the sign
        if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

        // Convert the numbers and avoid overflow
        while (index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;

            // Check for overflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }
        return total * sign;
    }

    public static void main(String[] args) {
        StringToInteger solution = new StringToInteger();

        // Example 1
        String s1 = "42";
        System.out.println("Output: " + solution.myAtoi(s1));  // Output: 42

        // Example 2
        String s2 = "   -42";
        System.out.println("Output: " + solution.myAtoi(s2));  // Output: -42

        // Example 3
        String s3 = "4193 with words";
        System.out.println("Output: " + solution.myAtoi(s3));  // Output: 4193

        // Example 4
        String s4 = "words and 987";
        System.out.println("Output: " + solution.myAtoi(s4));  // Output: 0

        // Example 5
        String s5 = "-91283472332";
        System.out.println("Output: " + solution.myAtoi(s5));  // Output: -2147483648
    }
}
