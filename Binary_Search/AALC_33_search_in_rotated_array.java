import java.util.Scanner;
//TC O(LOG N);

public class AALC_33_search_in_rotated_array {
    // Function to search in a rotated sorted array
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // Determine which half is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search in the left half
                } else {
                    left = mid + 1; // Search in the right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the target element: ");
            int target = sc.nextInt();
            
            int result = search(arr, target);
            if (result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }
}


// class Solution {
//     public int search(int[] nums, int target) {
//         int l = nums.length;
//         for(int i = 0; i<l; i++){
//             if(nums[i] == target){
//                 return i;
//             }
//         }
//         return -1;
        
//     }
// }

