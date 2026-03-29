import java.util.Arrays;

public class knapsack_0_1_rec_memoisation { //TC :  n * W

    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {

        // Base case
        if (W == 0 || n == 0) { 
            return 0;
        }

        // Step 1: Check if already calculated
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // Step 2: Valid case
        if (wt[n - 1] <= W) {

            int include = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            int exclude = knapsack(val, wt, W, n - 1, dp);

            dp[n][W] = Math.max(include, exclude);
            return dp[n][W];

        } else {
            // Step 3: Not valid
            dp[n][W] = knapsack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void main(String args[]) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int n = val.length;

        // Create DP array
        int dp[][] = new int[n + 1][W + 1];

        // Initialize with -1
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(knapsack(val, wt, W, n, dp));
    }
}