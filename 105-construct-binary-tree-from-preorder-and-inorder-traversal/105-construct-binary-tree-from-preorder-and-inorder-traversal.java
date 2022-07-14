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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i =0; i<inorder.length;i++)
            map.put(inorder[i],i);
        
        
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1,map);
    }
    
    public TreeNode buildTree(int[] preorder,int[] inorder, int preStart, int preEnd, int inStart, int inEnd ,Map<Integer,Integer> map){
        
       if(preStart>preEnd || inStart>inEnd) return null;
        
        int rootIndex = map.get(preorder[preStart]);
        int leftNums = rootIndex-inStart;
        TreeNode root = new TreeNode(preorder[preStart]);
        
        root.left = buildTree(preorder,inorder, preStart+1, preStart+leftNums, inStart,rootIndex-1,map);
        
        
        root.right = buildTree(preorder, inorder, preStart+leftNums+1,preEnd,rootIndex+1,inEnd, map);
        
        
        
        return root;
        
        
    }
}