public class fib_dp_tabulation {
    public static void main(String[] args) {
        int n = 4; // Change this value to compute Fibonacci for different n
        int[] dp = new int[n + 1]; // Create a dp array to store computed Fibonacci values
        dp[0] = 0; // Base case: Fibonacci of 0 is 0
        dp[1] = 1; // Base case: Fibonacci of 1 is 1

        for (int i = 2; i <= n; i++) { //TC: O(n) SC: O(n)
            dp[i] = dp[i - 1] + dp[i - 2]; // Fill the dp array using the Fibonacci formula
        }

        System.out.println("Fibonacci of " + n + " is: " + dp[n]);
    }
}
