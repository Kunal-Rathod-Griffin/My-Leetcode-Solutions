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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
//         int length = 1;
        
//         ListNode curr = head;
//         while(curr.next != null)
//         {    
//             length++;
//             curr = curr.next;
        
//         }
        
//         int from_first = length -n;
        
//         ListNode prev = null;
//         ListNode next = null;
//         curr= head;
//         int i = 1;
        
//         while( i< from_first +1){
//             prev = curr;
//             curr= curr.next;
//             if(curr.next != null)
//                 next = curr.next;
//             i++;
//         }
        
//         prev.next = next;
        
        // if(head == null )
        //     return head;
        // if(head.next == null && n == 1)
        //     return null;
        
        ListNode dummyHead = new ListNode(0);
        ListNode slow = dummyHead, fast = dummyHead;
        
        slow.next= head;
        
        if(head == null)
            return head;
        
        
        // ListNode slow = head;
        // ListNode fast = head;
        
        for(int i =1; i<=n; i++){
            fast = fast.next;
        } //this will loop put the fast at node number 3
        
        while(fast.next != null)
        {
            //now when we run it till fast is at the end
            //slow will be just before the node we want to delete
            
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummyHead.next; 
    }
}