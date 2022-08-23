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
    public boolean isPalindrome(ListNode head) {
        
        ListNode mid = mid(head);
       System.out.println(mid.val);
        ListNode second = reverse(mid);
       
    mid.next = null;
        ListNode first = head;
         
        
        while(first!=null && second !=null){
            
            if(first.val != second.val){
              System.out.println(second.val);
                return false;
            }
            
            first = first.next;
            second = second.next;
        }
      
       
        
        return true;
        
    }
    
    
    public ListNode reverse (ListNode root){
        
        if(root.next == null)
            return root;
        
        ListNode next = root.next;
        ListNode newHead = reverse(root.next);
        
        next.next = root;
        root.next = null;
        
        return newHead;
        
        
        
    }
    
    public ListNode mid(ListNode root){
        
        ListNode fast = root;
        ListNode slow = root;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }
}