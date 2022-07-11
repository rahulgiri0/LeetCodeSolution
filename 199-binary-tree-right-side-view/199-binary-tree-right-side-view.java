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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> view = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root == null)
            return view;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int level = q.size();
            
            for(int i =0; i<level ;i++){
                
                TreeNode cur = q.poll();
                
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
                
                
                if(i == level-1) view.add(cur.val);
            }
            
        }
        
        return view;
    }
}