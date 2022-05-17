/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        Queue<TreeNode> o  = new LinkedList<>();
        Queue<TreeNode> c  = new LinkedList<>();
        
        o.offer(original);
        c.offer(cloned);
        
        while(!o.isEmpty()){
            
            int n = o.size();
            
            for(int i=0;i<n;i++){
                
                TreeNode to = o.poll();
                TreeNode tc = c.poll();
                
                if(to==target){
                    return tc;
                }
                if(to.left!=null){
                    o.offer(to.left);
                }
                
                if(tc.left!=null){
                    c.offer(tc.left);
                }
                
                 if(to.right!=null){
                    o.offer(to.right);
                }
                
                if(tc.right!=null){
                    c.offer(tc.right);
                }
                
            }
        }
        
       return null;
        
    }
}