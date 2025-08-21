import java.util.*;

public class contains_dup {
    public static boolean containsDuplicate(int[] nums) {
        // Use HashSet to store unique values
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Duplicate found
            }
            set.add(num);
        }
        
        return false; // No duplicates
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        
        System.out.println(containsDuplicate(nums1)); // true
        System.out.println(containsDuplicate(nums2)); // false
        System.out.println(containsDuplicate(nums3)); // true
    }
}






// import java.util.*;

// public class contains_dup {
//     public static boolean containsDuplicate(int[] nums) {
//         // Sort the array
//         Arrays.sort(nums);

//         // Check consecutive elements
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 return true; // Duplicate found
//             }
//         }
//         return false; // No duplicates
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 3, 1};
//         int[] nums2 = {1, 2, 3, 4};
//         int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        
//         System.out.println(containsDuplicate(nums1)); // true
//         System.out.println(containsDuplicate(nums2)); // false
//         System.out.println(containsDuplicate(nums3)); // true
//     }
// }

