public class missing_num_268 {
    
}


// public class Solution {
//     public int missingNumber(int[] nums) {
//         int missing = nums.length;
//         for (int i = 0; i < nums.length; i++) {
//             missing ^= i ^ nums[i];
//         }
//         return missing;
//     }
// }



// public class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int expectedSum = n * (n + 1) / 2;
//         int actualSum = 0;
//         for (int num : nums) {
//             actualSum += num;
//         }
//         return expectedSum - actualSum;
//     }
// }

