/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null)
            return null;
        if(root.left == null)
        {
            root.next= null;
            return root;
        }
        
        root.next = null;
        helper(root.left, root.right);
        
        return root;
    }
    
    public void helper(Node root, Node next){
        
        if(root != null&&  root.left == null && root.right == null && next == null){  
            root.next = null;
            return;
        }
        // System.out.println(root.val);
        if(next == null && root.left != null)
        {
            root.next = null;
            helper(root.left, root.right);
        }
        
        else{
        root.next = next;
        
        if(root.left != null && root.right != null){
            
            helper(root.left, root.right);
            helper(root.right, next.left);
            helper(next.left, next.right);
        
        }
        }
        
        return;
        
    }
    
    
}