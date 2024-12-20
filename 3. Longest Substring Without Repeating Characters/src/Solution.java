public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int[] charIndexMap = new int[128]; // Initialize map with all -1

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If the current character is already in the map and its index is greater than or equal to the start index,
            // move the start index to the next index after the last occurrence of the current character
            if (charIndexMap[currentChar] >= start) {
                start = charIndexMap[currentChar] + 1;
            }

            // Update the maximum length and the index of the current character in the map
            maxLength = Math.max(maxLength, end - start + 1);
            charIndexMap[currentChar] = end;
        }

        return maxLength;
    }
}
