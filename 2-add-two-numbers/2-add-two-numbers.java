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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
       ListNode node= new ListNode(0);
        ListNode ans=node;
        ListNode a= l1;
        ListNode b= l2;
        int c=0;
        
        
        while(a!=null || b!=null){
            
            int x = a==null?0:a.val;
            int y = b==null?0:b.val;
            
            
            int sum = x+y+c;
            c=sum/10;
            ans.next=new ListNode(sum%10);
            ans=ans.next;
           if (a != null) a = a.next;
        if (b != null) b = b.next;
            
            
        }
        if(c>0){
            ans.next= new ListNode(c);
        }
        
        return node.next;
       
        
    }
}