import java.util.*;

public class min_partitioning {

    public static int minPartition(int arr[]) {
        int n = arr.length;
        //Time Complexity: O(n*sum)
        //Space Complexity: O(n*sum)

        // Step 1: total sum
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int W = sum / 2;

        // dp[i][j] = max sum possible using first i elements with capacity j
        int dp[][] = new int[n + 1][W + 1];

        // Bottom-up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {

                if (arr[i - 1] <= j) { // valid
                    dp[i][j] = Math.max(
                            arr[i - 1] + dp[i - 1][j - arr[i - 1]],
                            dp[i - 1][j]
                    );
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];  // ✅ FIXED LINE
                }
            }
        }

        int sum1 = dp[n][W];
        int sum2 = sum - sum1;

        return Math.abs(sum1 - sum2);
    }

    public static void main(String args[]) {
        int nums[] = {1, 6, 11, 5};

        int result = minPartition(nums);
        System.out.println("Minimum Partition Difference: " + result);
    }
}

