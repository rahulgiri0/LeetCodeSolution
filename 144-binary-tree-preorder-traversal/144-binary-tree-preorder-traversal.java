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
    public List<Integer> preorderTraversal(TreeNode root) {
        
         List<Integer> pre = new ArrayList<>();
        
        util(root,pre);
        return pre;
    }
    
    public void util(TreeNode root,  List<Integer> pre){
        
        if(root==null)
            return;
        
        pre.add(root.val);
        util(root.left,pre);
        
        util(root.right,pre);
    }
}