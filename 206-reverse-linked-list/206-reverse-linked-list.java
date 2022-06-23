/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode rest = reverseList(head.next);
        //here we have reverse all the nodes from head.next till the end
        //so now head points to the node number 2. 
        //but for reversing it node number 2 should point to the head
        //so by head.next we get next node number 2 
        //and by doint it's next we are reversing it
        
        head.next.next= head;
        //head.next.next is really important
        //
        
        
        head.next = null;
            
        return rest;
    }
}