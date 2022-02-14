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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        
        util(root,post);
        
        return post;
    }
    
    public void util(TreeNode root,List<Integer> post){
        
        if(root==null){
            return ;
        }
        
        util(root.left,post);
        util(root.right,post);
        post.add(root.val);
    }
}