public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        // Handle patterns like a*, a*b*, a*b*c*
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];  // Zero occurrence of the preceding element
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];  // One or more occurrence
                    }
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        RegularExpressionMatching solution = new RegularExpressionMatching();

        // Example 1
        String s1 = "aa";
        String p1 = "a";
        System.out.println("Output: " + solution.isMatch(s1, p1));  // Output: false

        // Example 2
        String s2 = "aa";
        String p2 = "a*";
        System.out.println("Output: " + solution.isMatch(s2, p2));  // Output: true

        // Example 3
        String s3 = "ab";
        String p3 = ".*";
        System.out.println("Output: " + solution.isMatch(s3, p3));  // Output: true
    }
}
