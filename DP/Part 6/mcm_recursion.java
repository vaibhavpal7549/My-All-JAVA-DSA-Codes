
public class mcm_recursion {

    public static int mcm(int[] arr, int i, int j) { //Tc: O(2^n) Sc: O(n)
        if (i == j) {
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = i; k <= j-1; k++) {
            int cost1 = mcm(arr, i, k); // Cost of multiplying matrices from i to k
            int cost2 = mcm(arr, k + 1, j); // Cost of multiplying matrices from k+1 to j
            int cost3 = arr[i - 1] * arr[k] * arr[j]; // Cost of multiplying the two resulting matrices
            int finalCost = cost1 + cost2 + cost3;
            minCost = Math.min(minCost, finalCost);
        }
        return minCost;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3 };
        System.out.println(mcm(arr, 1, arr.length - 1));
    }
}


