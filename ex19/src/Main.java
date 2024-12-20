public class Main {
    public static void main(String[] args) {
        Solution.LongestPalindromicSubstring solution = new Solution.LongestPalindromicSubstring();
        String s1 = "babad";
        System.out.println("Longest palindromic substring in 'babad' is: " + solution.longestPalindrome(s1));  // Output: "bab" or "aba"

        String s2 = "cbbd";
        System.out.println("Longest palindromic substring in 'cbbd' is: " + solution.longestPalindrome(s2));  // Output: "bb"
    }
}