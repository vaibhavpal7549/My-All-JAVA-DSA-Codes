import java.util.Scanner;

public class AALC_704_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        System.out.println(result);
        
    }
    private static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}







// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length-1;
//         while(low<=high){
//             int mid =  low + ;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if(nums[mid]>target){
//                 high = mid -1;

//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return -1;

        
//     }
// }