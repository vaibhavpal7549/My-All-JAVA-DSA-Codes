// leetcode solution


// class Solution {
//     public long maximumSubarraySum(int[] nums, int k) {

//         long sum = 0;
//         long max = Long.MIN_VALUE;
//         int l = nums.length;

//         int i = 0;
//         int j = 0;

//         while (j < l) {
//             sum += nums[j]; 

//             if (j - i + 1 < k) {
                
//                 j++;
//             } else if (j - i + 1 == k) {
                
//                 max = Math.max(max, sum);

//                 sum -= nums[i];
//                 i++;
//                 j++;
//             }
//         }

//         return max;
//     }
// }


import java.util.Scanner;
public class max_sum_subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int l = sc.nextInt();

        int nums[] = new int[l];
        for(int i = 0; i<l;i++){
            nums[i] = sc.nextInt();
        }

        long sum = 0;
        long max = Long.MIN_VALUE;

        int i = 0;
        int j = 0;

        while (j < l) {
            sum += nums[j]; 

            if (j - i + 1 < k) {
                
                j++;
            } else if (j - i + 1 == k) {
                
                max = Math.max(max, sum);

                sum -= nums[i];
                i++;
                j++;
            }
        }

        System.out.println(max);

    }
}
