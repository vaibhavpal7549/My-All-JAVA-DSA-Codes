public class coin_change2 {

    public static int coinChange2(int coins[], int amount){
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];

        for(int i = 0; i<n + 1; i++){
            dp[i][0] = 1;
        }

        for(int i = 0; i<amount+1; i++){
            dp[0][i] = 0;
        } 

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<amount+1; j++){
                if(coins[i-1]<= j){ //valid case
                    dp[i][j] = dp[i][j - coins[i-1]] + dp[i-1][j];
                }else{ //invalid case
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][amount];
    }
    public static void main(String[] args) {
        // int[] coins = {1, 2, 3};
        int coins[] = {2,5,3,6};
        // int amount = 4;
        int amount = 10;
        System.out.println(coinChange2(coins, amount));
    }
}
