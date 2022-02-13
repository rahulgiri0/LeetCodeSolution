class Solution {
   

    public int maxAreaOfIsland(int[][] grid) {
       
        
        boolean[][] isvisited = new boolean[grid.length][grid[0].length];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                
                int sum = calculate(grid,i,j,isvisited);
                 max = sum>max?sum:max;
            }
        }
        
        return max;
    }
    
    
    public int calculate(int[][] grid,  int rc, int cc, boolean[][] isVisited){
        
        if(rc<0 || rc>grid.length-1 || cc<0 || cc>grid[0].length-1 || grid[rc][cc]==0 || isVisited[rc][cc]==true){
            return 0;
        }
        
       
        
            
            isVisited[rc][cc]=true;
        
       return (  1+  calculate(grid,      rc-1,  cc,isVisited)+
          calculate(grid,       rc,  cc-1,isVisited)+
        calculate(grid,      rc+1,  cc,isVisited)+
            calculate(grid,     rc,  cc+1,isVisited));
        
        
        
    }
    
}