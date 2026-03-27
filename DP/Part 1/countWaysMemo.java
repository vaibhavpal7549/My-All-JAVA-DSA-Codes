import java.util.*;
public class countWaysMemo {

    //memoization
    //TC: O(n) SC: O(n) + O(n) for recursion stack
    public static int countWays(int n, int[] dp) { // top down approach
        // base case
        if (n == 0) {
            return 1;
        }
        if(n <0){
            return 0;
        }
        if(dp[n] != -1){ // already calculated
            return dp[n];
        }
        dp[n] = countWays(n-1, dp) + countWays(n-2, dp);
        return dp[n];

    }
    public static void main(String[] args) {
        int n = 4;
        int ways[] = new int[n+1]; // 0 0 0 0 0 0
        Arrays.fill(ways, -1);
        System.out.println(countWays(n, ways));
    }
}

