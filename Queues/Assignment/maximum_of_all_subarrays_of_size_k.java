//We have an array of size N and an integer K. Find the maximum for each and every
//contiguous subarray of size K

//Sample input 1 : N = 9, K = 3, arr= 1 2 3 1 4 5 2 3 6
//Sample output 1 : 3 3 4 5 5 5 6



import java.util.*;

public class maximum_of_all_subarrays_of_size_k {
    
    public static List<Integer> maxOfSubarrays(int[] arr, int n, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove out of window indices
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements as they won't be needed
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current element index
            deque.offerLast(i);

            // Add the max in window to result
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int N = arr.length;
        int K = 3;

        List<Integer> output = maxOfSubarrays(arr, N, K);
        System.out.println("Output: " + output);
    }
}
