


public class Solution {
    public boolean longestPalindrome(String s) {
        int length = s.length();
        if (length <= 1) {
            return true;
        }
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
