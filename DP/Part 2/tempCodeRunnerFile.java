public class knapsack_0_1_recursion { // Time Complexity: O(2^n) - Exponential
    // 0-1 Knapsack Problem using Recursion
    //SC: O(n) - Recursive Stack Space

    public static int knapsack(int val[], int wt[], int W, int n) {

        // Base case
        if (W == 0 || n == 0) {
            return 0;
        }

        // Valid case (weight fits)
        if (wt[n - 1] <= W) {

            // Include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // Exclude
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);

        } else {
            // Not valid (weight exceeds capacity)
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String args[]) {

        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(knapsack(val, wt, W, val.length));
    }
}