
// Given a string s, return the longest
//palindromic substring in s.
//
//Example 1:
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.

//Example 2:
//Input: s = "cbbd"
//Output: "bb"

//Constraints:
//1 <= s.length <= 1000
//s consist of only digits and English letters.//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("babad")); // Output: "bab"
        System.out.println(solution.longestPalindrome("cbbd")); // Output: "bb"

    }
}