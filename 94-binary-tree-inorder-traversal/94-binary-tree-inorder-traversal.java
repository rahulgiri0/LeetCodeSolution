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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        recurse(root,al);
            
            return al;
    }
    
    private void recurse(TreeNode root, List<Integer> al){
        
        if(root == null){
            return;
        }
        
        recurse(root.left,al);
        al.add(root.val);
        
        recurse(root.right,al);
        
    }
}