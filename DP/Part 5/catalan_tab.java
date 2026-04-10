public class catalan_tab {

    public static int catalan(int n) { // O(n^2) time complexity, O(n) space complexity
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) { //Ci = sum of Cj * Ci-1-j for j = 0 to i-1
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j]; //dp[i] = dp[0] * dp[i-1] + dp[1] * dp[i-2] + ... + dp[i-1] * dp[0]
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(catalan(n));
    }
}
