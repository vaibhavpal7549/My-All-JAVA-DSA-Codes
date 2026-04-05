

public class string_conver_inser_delet {

    //Time complexity: O(n*m)
    //Space complexity: O(n*m)      
    // LCS function
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];

        // bottom-up DP
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    // Conversion using insert & delete only
    public static void stringConversion(String str1, String str2) {
        int lcsLen = lcs(str1, str2);

        int deletions = str1.length() - lcsLen;
        int insertions = str2.length() - lcsLen;

        System.out.println("Deletions required = " + deletions);
        System.out.println("Insertions required = " + insertions);
    }

    public static void main(String args[]) {
        String str1 = "heap";
        String str2 = "pea";

        stringConversion(str1, str2);
    }
}