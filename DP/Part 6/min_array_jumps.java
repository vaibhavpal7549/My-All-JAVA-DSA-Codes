import java.util.*;

public class min_array_jumps {

    public static int minJumps(int nums[]) { //Time Complexity: O(n^2), Space Complexity: O(n)
        int n = nums.length;

        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        // Last index requires 0 jumps
        dp[n - 1] = 0;

        // Fill from right to left
        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;

            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != -1) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }

            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }

        return dp[0]; // Minimum jumps from index 0
    }

    public static void main(String args[]) {
        int nums[] = {2, 3, 1, 1, 4};

        int result = minJumps(nums);

        if (result != -1) {
            System.out.println("Minimum jumps = " + result);
        } else {
            System.out.println("End not reachable");
        }
    }
}