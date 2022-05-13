/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
       Node node= new Node();
        
        if(root==null){
            node=null;
            return node;
        }
        
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
       //  node= new Node(q.peek().val,q.peek().left,q.peek().right,null);
        while(!q.isEmpty()){
            
            int n = q.size();
            
            for(int i=0;i<n;i++){
                
            Node item = q.poll();
           
                if(i==n-1){
                    item.next=null;
                }
                else
                    item.next=q.peek();
            // if(q.peek()!=null){
            //     node.next=item;
            // }
            // else
            //     node.next=null;
            
            if(item.left!=null){
                q.add(item.left);
            }
            if(item.right!=null){
                q.add(item.right);
            }
            }
        }
        
        return root;
    }
}