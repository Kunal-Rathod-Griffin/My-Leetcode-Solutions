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
    
    public int curr_max;
    public int max_till_now;
    public List<Integer> ans;
    public List<Integer> rightSideView(TreeNode root) {
        ans = new ArrayList<Integer>();
        if(root == null) return ans;
        
        
        curr_max = 0;
        max_till_now  = 0;
        traverse(root, ans, 1);
        return ans;
    }
    
    public void traverse(TreeNode root, List<Integer> ans, int max_till_now){
        
        if(root == null) return;
        
        if(max_till_now > curr_max) {
            ans.add(root.val);
            curr_max = max_till_now;
        }
        
        if(root.right != null) traverse(root.right, ans, max_till_now+1);
        if(root.left != null) traverse(root.left, ans, max_till_now + 1);
    }
    
    
}