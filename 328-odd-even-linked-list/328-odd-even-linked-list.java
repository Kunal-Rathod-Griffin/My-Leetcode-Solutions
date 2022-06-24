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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null )
            return head;
        
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode fast_head = fast;
        while(fast.next != null && fast.next.next != null){
            
        
            
            slow.next = fast.next;
            fast.next = slow.next.next;
            slow = slow.next;
            fast = fast.next;
            
            
        }
            
        if(fast.next == null)
            slow.next = fast_head;
        else if(fast.next.next == null)
        {    
            slow.next = fast.next;
            slow= slow.next;
            fast.next = null;
            slow.next = fast_head;
        }
        
        
        return head;
    }
}