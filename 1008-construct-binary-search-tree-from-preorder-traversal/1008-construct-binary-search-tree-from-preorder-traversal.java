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
    
    
    public TreeNode bstFromPreorder(int[] preorder) {
        
        if(preorder.length == 0)
            return null;
        
        preOrderIndex =0;
        return bsthelper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        
    }
    int preOrderIndex;
    
    public TreeNode bsthelper(int[] preorder, int left, int right){
        
        if(preOrderIndex == preorder.length || preorder[preOrderIndex] > right || preorder[preOrderIndex] < left  )
            return null;
        
        int rootVal = preorder[preOrderIndex];
        TreeNode root = new TreeNode(preorder[preOrderIndex++]);
        root.left = bsthelper(preorder, left, rootVal);
        root.right = bsthelper(preorder, rootVal, right);
        
        return root;
        
    }
}