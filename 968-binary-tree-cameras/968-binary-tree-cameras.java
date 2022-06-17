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
    int camera =0;
    public int minCameraCover(TreeNode root) {
        
        if(util(root)==-1) camera++;
        return camera;
    }
    
    
    public int util(TreeNode root){
        
        if(root==null){
            return 1;
        }
        
        int lc = util(root.left);
        int rc = util(root.right);
        
        if(lc==-1 || rc ==-1){
            camera++;
            return 0;
        }
        
        if(lc ==0 || rc ==0){
            return 1;
        }
        
        return -1;
    }
}