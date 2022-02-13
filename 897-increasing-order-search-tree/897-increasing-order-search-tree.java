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
    public TreeNode increasingBST(TreeNode root) {
       ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode node=new TreeNode(0);
       TreeNode cur= node;
        inorder(root,list);
        
        for(TreeNode element:list){
            cur.right= new TreeNode(element.val);
            cur=cur.right;
        }
       
        return node.right;
        
        
        
        
    }
    
    
    public void inorder(TreeNode node,ArrayList<TreeNode> list){
        
        if(node==null){
            return ;
        }
        
        inorder(node.left,list);
        list.add(node);
        inorder(node.right,list);
        
    }
}