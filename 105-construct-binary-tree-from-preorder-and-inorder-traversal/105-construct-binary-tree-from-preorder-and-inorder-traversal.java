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
    
    int preorderIndex;
    Map<Integer, Integer> inordermap;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        preorderIndex = 0;
        inordermap = new HashMap<>();
        
        for(int i =0; i<inorder.length; i++){
            inordermap.put(inorder[i], i);
        }
        
        return helper(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode helper(int[] preorder, int left, int right){
        
        if(left > right) return null;
        
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        
        root.left = helper(preorder, left, inordermap.get(rootValue) - 1);
        root.right = helper(preorder, inordermap.get(rootValue) + 1, right);
        
        return root;
    }
}