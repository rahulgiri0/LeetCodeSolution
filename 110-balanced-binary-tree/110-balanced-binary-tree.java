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
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        util(root);
        return result;
    }
    
    public int util(TreeNode root){
        
        if(root == null || !result)
            return 0;
        
        int left = util(root.left);
        int right = util(root.right);
        
        if(Math.abs(left-right)>1)
            result = false;
        
        return 1+Math.max(left,right);
        
    }
}