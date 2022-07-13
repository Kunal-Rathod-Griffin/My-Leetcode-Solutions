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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    List<List<Integer>> nodes = new ArrayList<>();
    if(root==null){
        return nodes;
    }
    
    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    
    queue.add(root);
    
    while(queue.size()!=0){
        
        int size = queue.size();
        List<Integer> layer_vals = new ArrayList<Integer>();
        
        while(size!=0){
            TreeNode temp = queue.poll();
            layer_vals.add(temp.val);
            
            if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
            
            size--;
        }
        nodes.add(layer_vals);
    }
    
    return nodes;
        
        
    }
}