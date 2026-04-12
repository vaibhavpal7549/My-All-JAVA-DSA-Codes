import java.util.*;

public class mcm_tabulation {

    public static int mcmTab(int arr[]) {
        int n = arr.length;

        // dp[i][j] = minimum cost to multiply matrices from i to j
        int dp[][] = new int[n][n];

        // Initialization: single matrix cost = 0
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }

        // Bottom-up approach
        for (int len = 2; len <= n - 1; len++) {
            for (int i = 1; i <= n - len; i++) {
                int j = i + len - 1;

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k + 1][j];
                    int cost3 = arr[i - 1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j], cost1 + cost2 + cost3);
                }
            }
        }

        printDP(dp); // Optional: Print the DP table for visualization
        return dp[1][n - 1];
    }

    // Optional: Function to print the DP table
    public static void printDP(int dp[][]) {
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp.length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3}; // Example input

        int result = mcmTab(arr);
        System.out.println("Minimum multiplication cost: " + result);
    }
}