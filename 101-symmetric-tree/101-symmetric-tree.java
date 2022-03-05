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
    public boolean isSymmetric(TreeNode root) {
        
        Stack<TreeNode> st = new Stack<>();
        
        
        
        
        if(root.left!=null){
            if(root.right==null) return false;
            
            st.push(root.left);
            st.push(root.right);
        }
        else if(root.right!=null)
            return false;
        
        while(!st.isEmpty()){
            
            TreeNode left = st.pop();
            TreeNode right = st.pop();
            
            if(left.val !=right.val){
                return false;
            }
            
            if(left.left!=null){
            if(right.right==null) return false;
            
            st.push(left.left);
            st.push(right.right);
        }
        else if(right.right!=null)
            return false;
            
            
            if(left.right!=null){
           if(right.left==null) return false;
           
           st.push(left.right);
           st.push(right.left);
       }
        else if(right.left!=null)
            return false;
            
        }
        
       return true;

        
    }
    
    
}