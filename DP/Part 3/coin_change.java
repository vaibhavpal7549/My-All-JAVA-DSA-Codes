public class coin_change {
    public static void main(String[] args) {
        // int[] coins = {1, 2, 3};
        int coins[] = {2,5,3,6};
        // int amount = 4;
        int amount = 2;
        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // Base case: There is one way to make the amount 0 (using no coins)

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin]; // Update the number of ways to make amount i
            }
        }

        return dp[amount]; // Return the number of ways to make the given amount
    }
}
