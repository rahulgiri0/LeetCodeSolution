class Solution {
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        int count =0;
        for(int i =0; i<grid.length ;i++)
        {
            for(int j =0; j<grid[i].length ;j++){
                
                if(!visited[i][j] && grid[i][j] == '1'){
                    util(i,j,grid,visited);
                    count++;
                }
                
            }
        }
        
        return count;
    }
    
    
    public void util(int src, int des,char[][] grid,  boolean[][] visited){
        
        if(src<0 || des<0 || src>grid.length-1 || des> grid[0].length-1 || grid[src][des]=='0' || visited[src][des])
            return ;
        
        visited[src][des] = true;
        
         util(src,des+1,grid,visited);
         util(src+1,des,grid,visited);
         util(src-1,des,grid,visited);
         util(src,des-1,grid,visited);
        
        
        
    }
}