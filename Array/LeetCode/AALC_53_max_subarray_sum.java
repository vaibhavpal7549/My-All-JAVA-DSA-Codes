// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         int cs = 0;
//         for(int i = 0; i<nums.length; i++){
//             cs += nums[i];
//             if(cs <0){
//                 cs = 0;
//             }
//             max = Math.max(cs, max);
//         }
//         return max;
//     }
// }



// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = nums[0]; // Initialize with the first element instead of Integer.MIN_VALUE
//         int cs = 0; // Current sum
        
//         for (int num : nums) {
//             if (cs < 0) {
//                 cs = 0; // Reset current sum if it's negative
//             }
//             cs += num;
//             max = Math.max(max, cs); // Update max
//         }
        
//         return max;
//     }
// }


