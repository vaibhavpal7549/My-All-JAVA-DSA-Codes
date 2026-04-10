public class catalan_memoisation {

    public static int catalan(int n, int[] dp) { // O(n^2) time complexity, O(n) space complexity
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += catalan(i, dp) * catalan(n - 1 - i, dp);
        }
        return dp[n] = ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        System.out.println(catalan(n, dp));
    }
}
