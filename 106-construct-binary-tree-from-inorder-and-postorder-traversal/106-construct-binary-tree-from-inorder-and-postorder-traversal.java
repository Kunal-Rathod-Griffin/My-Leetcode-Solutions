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
    
    int postIndex ;
    Map<Integer, Integer> inorderMap = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        postIndex = postorder.length - 1;
        
        // if(postIndex == 1)
        //     return new TreeNode(postorder[postIndex]);
        
        for(int i =0 ; i< inorder.length; i++){
            
            inorderMap.put(inorder[i], i);
        }
        
        return arrayToMap(postorder, 0, postorder.length -1);   
        
    }
        public TreeNode arrayToMap(int[] postorder, int left, int right){
            
            if(left > right || left < 0 ) return null;
            
            System.out.println(postIndex);
            int rootVal = postorder[postIndex--];
            
            TreeNode root = new TreeNode(rootVal);
            
            
            
            root.right = arrayToMap(postorder, inorderMap.get(rootVal) +1, right);
            
            root.left = arrayToMap(postorder, left, inorderMap.get(rootVal) -1);
            
            return root;
            
        }
    
}