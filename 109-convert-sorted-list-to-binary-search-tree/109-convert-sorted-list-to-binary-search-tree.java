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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        
        
        return sortedListToBST(head,null);
    }
    
    public TreeNode sortedListToBST(ListNode head, ListNode tail){
        ListNode fast = head;
        ListNode slow = head;
        
        if(head == tail)
            return null;
        
        while(fast.next!=tail && fast.next.next!=tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        TreeNode newHead = new TreeNode(slow.val);
        
        newHead.left = sortedListToBST(head,slow);
        newHead.right = sortedListToBST(slow.next,tail);
        
        return newHead;
        
    }
}