
import java.util.Arrays;

public class lex_sma_str_len_n_sum_k {
    public static String getSmallestString(int n, int k) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a'); // Fill initially with 'a' (value = 1) cite: 2
        k -= n; // Account for the initial 'a's cite: 2

        // Fill from right to left to keep lexicographically smallest cite: 2
        for (int i = n - 1; i >= 0 && k > 0; i--) {
            int add = Math.min(k, 25); // Max we can add to 'a' is 25 (to reach 'z')
            arr[i] = (char) ('a' + add);
            k -= add;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(getSmallestString(5, 42)); // Output: aamz
        System.out.println(getSmallestString(3, 25)); // Output: aaw
    }
}
