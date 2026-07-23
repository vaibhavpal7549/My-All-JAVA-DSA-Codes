public class kth_lar_odd_num_range {
    public static int kthOdd(int L, int R, int k) {
        if (k <= 0) return 0; // cite: 2

        // If upper bound R is odd
        if ((R & 1) != 0) {
            int count = (int) Math.ceil((double) (R - L + 1) / 2); // cite: 2
            if (k > count) return 0; // cite: 2
            return R - 2 * (k - 1); // cite: 2
        } 
        // If upper bound R is even
        else {
            int count = (R - L + 1) / 2; // cite: 2
            if (k > count) return 0; // cite: 2
            return (R - 1) - 2 * (k - 1); // cite: 2
        }
    }

    public static void main(String[] args) {
        System.out.println(kthOdd(-3, 3, 1)); // Output: 3
    }
}