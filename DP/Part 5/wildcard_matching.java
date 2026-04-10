public class wildcard_matching{

    
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        //initialization of first row
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        //bottom up approach
        for (int i = 1; i <= m; i++) { //Time complexity: O(m*n)
            //Space complexity: O(m*n)
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    dp[i][j] = false;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba*****ab";
        System.out.println(isMatch(s, p));
    }
}