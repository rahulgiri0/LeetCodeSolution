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
    public ListNode partition(ListNode head, int x) {
        
        ListNode beforeX = new ListNode(0);
        ListNode before = beforeX;
        ListNode afterX = new ListNode(0);
        ListNode after = afterX;
        
        
        while(head!=null){
            
            
            if(head.val<x)
            {
                beforeX.next = head;
                beforeX = beforeX.next;
            }
            else
            {
                afterX.next = head;
                afterX = afterX.next;
            }
            
            head = head.next;
            
            
            
        }
        
        
        afterX.next = null;
        
        beforeX.next = after.next;
        
        
        return before.next;
        
    }
}