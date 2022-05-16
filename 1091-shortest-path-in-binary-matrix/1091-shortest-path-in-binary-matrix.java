class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] direction = new int[][]{{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1}};
        int r = grid.length;
        int c = grid[0].length;
        
        if(grid[0][0] != 0 || grid[r-1][c-1]!=0)
            return -1;
        
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0,0,1));
        grid[0][0]=1;
        while(!q.isEmpty()){
            
           
            
            while(q.size()>0){
                Node n = q.poll();
                
                if(n.x==r-1 && n.y==c-1)
                    return n.length;
                
                else{
                    for(int[] way : direction){
                        int newX = n.x + way[0];
                        int newY = n.y + way[1];
                        
                        
                        if(newX<r && newY < c && newX>=0 && newY >=0 && grid[newX][newY]==0){
                            q.offer(new Node (newX,newY,n.length+1));
                            grid[newX][newY]=1;
                        }
                    }
                }
            }
        }
        
        return -1;
        
    }
}


class Node{
    int x;
    int y;
    int length;
    
    public Node(int x , int y, int length){
        this.x=x;
        this.y=y;
        this.length=length;
    }
}

