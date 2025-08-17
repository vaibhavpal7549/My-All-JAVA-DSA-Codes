

/*
Print Maximum of All Subarrays of Size K
Given an integer array arr[] of size n and an integer k, the task is to print the maximum of each subarray of size k

Sample Input:
arr[] = {12, 1, 78, 90, 57, 89, 56}
k = 3

Sample Output:
78 90 90 90 89

Explanation :
The maximums of all contiguous subarrays of size k = 3 are:

{12, 1, 78} → 78

{1, 78, 90} → 90

{78, 90, 57} → 90

{90, 57, 89} → 90

{57, 89, 56} → 89


Time Complexity: O(n)
Each element is added and removed from the deque at most once.

Space Complexity: O(k)
For the deque storing indices of useful elements in current window.

 */




import java.util.Deque;
import java.util.LinkedList;

public class print_max_of_All_subarrays {

    static void printMax(int arr[], int n, int k) {
        Deque<Integer> Qi = new LinkedList<>();

        int i;
        // Process first k (or first window) elements of array
        for (i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }

        // Process rest of the elements
        for (; i < n; ++i) {
            System.out.print(arr[Qi.peek()] + " ");

            // Remove elements out of this window
            while (!Qi.isEmpty() && Qi.peek() <= i - k)
                Qi.removeFirst();

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();

            // Add current element at the rear of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;
        printMax(arr, arr.length, k);
    }
}


