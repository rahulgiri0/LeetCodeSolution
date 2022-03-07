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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a =list1;
        ListNode b=list2;
        ListNode head,tail;
        if(a==null){
            
                return b;
        }
        else if(b==null){
            
                return a;
        }
      
        
        if(a.val<=b.val){
            head=list1;
            tail=list1;
            a=a.next;
            
        }
        else{
            head=list2;
            tail=list2;
            b=b.next;
        }
        
        
        
        while(a!=null && b!=null){
            
            
            if(a.val<=b.val){
            tail.next=a;
                tail=a;
                a=a.next;
            
        }
            else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
            
        }
        
        
        if(b==null && a!=null){
            tail.next=a;
            tail=a;
        }
         else{
            tail.next=b;
             tail=b;
        }
        return head;
        
    }
}