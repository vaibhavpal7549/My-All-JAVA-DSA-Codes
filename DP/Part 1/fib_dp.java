public class fib_dp {

    public static int fibonacci(int n, int[] dp) { //tc: O(n) sc: O(n)
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) { // If the value has already been computed, return it from the dp array
            return dp[n];
        }
        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4; // Change this value to compute Fibonacci for different n
        int[] dp = new int[n + 1]; // Create a dp array to store computed Fibonacci values
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n, dp));
    }
}


