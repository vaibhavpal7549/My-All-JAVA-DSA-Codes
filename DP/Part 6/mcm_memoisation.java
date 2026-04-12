import java.util.Arrays;
public class mcm_memoisation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcm(arr, 1, n - 1, dp));
    }

    public static int mcm(int[] arr, int i, int j, int[][] dp) {
        if (i == j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k, dp);
            int cost2 = mcm(arr, k + 1, j, dp);
            int finalCost = cost1 + cost2 + arr[i - 1] * arr[k] * arr[j];
            minCost = Math.min(minCost, finalCost);
        }
        return dp[i][j] = minCost;
    }
}