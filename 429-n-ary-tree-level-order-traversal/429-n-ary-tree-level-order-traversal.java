/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null)
            return res;
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
       
        
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> levelVal = new ArrayList<>();
            for(int j =0 ; j<level;j++){
            Node temp = q.poll();
            int childrenSize = temp.children.size();
          levelVal.add(temp.val);
             
            for(int i =0; i<childrenSize;i++){
               
                q.offer(temp.children.get(i));
                
            }
            }
            
            res.add(new ArrayList(levelVal));
        }
        
        return res;
    }
}