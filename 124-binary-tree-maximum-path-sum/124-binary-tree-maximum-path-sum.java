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
class Solution {
    public int maxPathSum(TreeNode root) {
        
        
        max = Integer.MIN_VALUE; 
        int ans= helper(root);
        
        return max;
        
    }
    
    int max;
    int helper(TreeNode root){
        
        if(root == null) return 0;
        
        int left = 0, right = 0;
        if(root.left != null)  left = helper(root.left);
        if(root.right != null)  right = helper(root.right);
        
        left = Math.max(left, 0);
        right = Math.max(right, 0);
        int current_sum = left + right + root.val;
        
        if(current_sum > max) max = current_sum;
        // if(current_sum - left > max) max = current_sum - left;
        // if(current_sum - right > max) max = current_sum - right;
        // if(root.val > max) max = root.val;
        return ((left > right) ? left : right) + root.val; 
        
    }
    
}