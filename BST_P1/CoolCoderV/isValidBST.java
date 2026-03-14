public class isValidBST {
    
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         Long min = Long.MIN_VALUE;
//         Long max = Long.MAX_VALUE;
//         return isValidBST(root, min, max);
//     }
//     public static boolean isValidBST(TreeNode root, long min, long max){
//         if(root == null) return true;

//         if(root.val <= min || root.val >= max){
//             return false;
//         }

//         boolean isValidLeft =isValidBST(root.left, min, root.val);
//         boolean isValidRight = isValidBST(root.right, root.val, max);
//         return isValidLeft && isValidRight;
//     }
// }

