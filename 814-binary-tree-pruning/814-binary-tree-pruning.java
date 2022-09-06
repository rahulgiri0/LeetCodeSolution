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
    public TreeNode pruneTree(TreeNode root) {
        
        return util(root)?root:null;
    }
    
    
    public boolean util(TreeNode root){
        
        if(root == null) return false;
        
        boolean leftOne = util(root.left);
        boolean rightOne = util(root.right);
        
        if(!leftOne) root.left = null;
        if(!rightOne) root.right = null;
        
        return root.val == 1 || leftOne || rightOne;
    }
}