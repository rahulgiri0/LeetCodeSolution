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
        
        ListNode prev=head;
        ListNode cur = prev.next;
        ListNode next = head;
        
        int len =0;
        
        ListNode temp = head;
        
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        
        int k= len-n-1;
        
        if(prev.next==null){
            if(n==1){
                return null;
            }
            else
                return head;
        }
        
        while(k>0 && prev.next!=null && cur!=null ){
            
            prev=prev.next;
            cur=prev.next;
          
            k--;
        
            
        }
        
        if(k==-1){
            return head.next;
        }
      next=cur.next;
        prev.next=next;
        return head;
        
    }
}