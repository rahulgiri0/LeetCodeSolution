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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int depth = depthOfTree(root);
        System.out.println(depth);
        
        calculateSumLeaves(root,depth,1);
        
        return sum;
    }
    
    public int depthOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int ldepth = depthOfTree(root.left);
        int rdepth = depthOfTree(root.right);
        
        return 1+Math.max(ldepth,rdepth);
    }
    
    public void calculateSumLeaves(TreeNode root, int depth,int curDepth){
        
        if(root==null){
            return;
        }
        
        if(root.left==null && root.right==null && curDepth == depth){
            sum+=root.val;
            System.out.println(sum);
            
        }
            
        
        calculateSumLeaves(root.left,depth,curDepth+1);
        calculateSumLeaves(root.right,depth,curDepth+1);
    }
}