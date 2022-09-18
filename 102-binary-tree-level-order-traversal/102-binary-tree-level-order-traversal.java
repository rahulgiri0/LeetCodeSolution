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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        Queue<TreeNode> q = new LinkedList();
        
        List<List<Integer>> ans = new ArrayList();
        
         if(root == null)
            return ans;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            List<Integer> levelNode = new ArrayList();
            
            for(int i =1; i<=n;i++){
                TreeNode temp = q.poll();
                
                
                if(temp.left != null) q.offer(temp.left);
                 if(temp.right != null) q.offer(temp.right);
                
                levelNode.add(temp.val);
            }
            
            ans.add(levelNode);
            
        }
        
        return ans;
    }
}