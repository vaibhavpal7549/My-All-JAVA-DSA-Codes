
public class split_given_Arrays_sub_arr {
    
    // --- Backtracking / Recursive Approach (From document) ---
    private static int minMaxSum = Integer.MAX_VALUE;

    public static void solve(int[] a, int n, int k, int index, int sum, int maxsum) {
        if (k == 1) { // cite: 2
            int currentSum = 0;
            for (int i = index; i < n; i++) { // cite: 2
                currentSum += a[i]; // cite: 2
            }
            maxsum = Math.max(maxsum, currentSum); // cite: 2
            minMaxSum = Math.min(minMaxSum, maxsum); // cite: 2
            return; // cite: 2
        }

        
        int currentSum = 0;
        for (int i = index; i < n - (k - 1); i++) {
            currentSum += a[i];
            solve(a, n, k - 1, i + 1, 0, Math.max(maxsum, currentSum)); // cite: 2
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        solve(arr1, arr1.length, 2, 0, 0, 0);
        System.out.println(minMaxSum); // Output: 2

        minMaxSum = Integer.MAX_VALUE; // Reset
        int[] arr2 = {1, 2, 3, 4};
        solve(arr2, arr2.length, 3, 0, 0, 0);
        System.out.println(minMaxSum); // Output: 4
    }
}