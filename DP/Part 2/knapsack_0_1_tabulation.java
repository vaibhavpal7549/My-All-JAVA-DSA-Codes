public class knapsack_0_1_tabulation {

    public static void display2D(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Tabulation Method
    public static int knapsackTab(int val[], int wt[], int W) {

        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for(int i = 0; i<dp.length;i++){
            for(int j = 0; j<dp[0].length;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        //Time Complexity -> n+1 * w+1
        // Build DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {

                int v = val[i-1]; // value of ith item
                int w = wt[i-1]; // wt of ith item
                if (w <= j) { //valid
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        System.out.println("DP Table:");
        display2D(dp);
        return dp[n][W];
    }

    public static void main(String args[]) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        // Calling tabulation function
        System.out.println(knapsackTab(val, wt, W));
    }
}