

public class lcs_memoisation { //Time Complexity O(m*n)
    public static void printDP(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int lcs(String str1, String str2, int n, int m, int dp[][]) {

        // base case
        if (n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != -1) {
            return dp[n][m];
        }
        // match case
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] =  lcs(str1, str2, n - 1, m - 1, dp) + 1;
        } 
        // not match
        else {
            int ans1 =  lcs(str1, str2, n - 1, m, dp);
            int ans2 = lcs(str1, str2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String args[]) {

        String str1 = "abcdge";
        String str2 = "abedg";   // LCS = "abd" or "abg"

        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // initialize dp array with -1
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        int result = lcs(str1, str2, n, m, dp);

        System.out.println("LCS Length: " + result);
        System.out.println("DP Array:");
        printDP(dp);
    }
}