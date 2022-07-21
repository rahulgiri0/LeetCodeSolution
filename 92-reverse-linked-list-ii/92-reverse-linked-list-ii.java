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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy = new ListNode(0,head);
        
        ListNode leftPrev = dummy;
        ListNode cur = head;
        
        int l = left-1;
        while(l -->0){
            leftPrev = cur;
            cur = cur.next;
        }
        
       
        
        int reversal = right  - left +1;
        ListNode prev = null;
        while(reversal -->0){
            
            ListNode tempNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempNext;
        }
        
         leftPrev.next.next = cur;
        leftPrev.next = prev;
        
        
        return dummy.next;
    }
}