
class tribonacci_num {

    static void printTrib(int n) { //Time Complexity: O(n) and Space Complexity: O(n)
        if (n <= 0) return;

        int dp[] = new int[n];

        // Base cases
        if (n > 0) dp[0] = 0;
        if (n > 1) dp[1] = 0;
        if (n > 2) dp[2] = 1;

        // Fill the dp array
        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        // Print the series
        for (int i = 0; i < n; i++) {
            System.out.print(dp[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n = 10;
        printTrib(n);
    }
}