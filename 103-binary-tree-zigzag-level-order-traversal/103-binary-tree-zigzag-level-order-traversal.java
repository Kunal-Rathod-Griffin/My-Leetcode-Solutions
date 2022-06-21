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
    
    List<List<Integer>> list;
    int max;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        list = new ArrayList<>();
        max = -1;
        
        helper(root, 0);
        
        for(int i =0; i<=max; i++){
            if(i %2 != 0){
                List<Integer> arr = list.get(i);
                
                
                
                Collections.reverse(arr);
                // list.add(i, arr);
            }
        }
        
        return list;
    }
    
    public void helper(TreeNode root, int curr){
        
        if(root == null) return;
        
        if(curr > max){
            List<Integer> temp = new ArrayList<>();
            list.add(curr, temp);
            max = curr;
        }
        
        list.get(curr).add(root.val);
        
        if(root.left != null) helper(root.left, curr+1);
        if(root.right != null) helper(root.right, curr+ 1);
        
        
    }
}