

public class edit_distance {

    public static int editDistance(String str1, String str2) {
        //time complexity: O(n*m)
        //space complexity: O(n*m)
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        // initialize
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0) {
                    dp[i][j] = j; // insert all characters
                }
                if (j == 0) {
                    dp[i][j] = i; // delete all characters
                }
            }
        }

        // bottom-up DP
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // same
                } else {
                    int add = dp[i][j - 1] + 1;      // insert
                    int del = dp[i - 1][j] + 1;      // delete
                    int rep = dp[i - 1][j - 1] + 1;  // replace

                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String args[]) {
        String word1 = "intention";
        String word2 = "execution";

        System.out.println("Edit Distance = " + editDistance(word1, word2));
    }
}