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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return false;
        
        
        Stack<TreeNode> s = new Stack<>();
        
           Stack<Integer> a = new Stack<>();
        s.push(root);
        a.push(root.val);
     
        while(!s.isEmpty()){
            
            TreeNode temp = s.pop();
            int tempVal = a.pop();
            if(temp.left == null && temp.right == null ){
                if(tempVal == targetSum)
                    return true;
            }
                
            
            else{
                
                if(temp.left != null){
                    s.push(temp.left);
                    a.push(temp.left.val + tempVal);
                }
                if(temp.right != null){
                    s.push(temp.right);
                      a.push(temp.right.val + tempVal);
                }
            }
                
        }
        
        return false;
    }
}