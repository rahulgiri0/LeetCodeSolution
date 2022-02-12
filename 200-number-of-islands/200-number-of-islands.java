class Solution {
    public int numIslands(char[][] grid) {
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                
                if(!visited[i][j] && grid[i][j]=='1'){
                    getIsland(grid,i,j,visited);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public void getIsland(char[][] grid, int i, int j, boolean[][] visited){
        
        if(i<0 || j<0 || i>=grid.length || j>= grid[i].length || visited[i][j] || grid[i][j]=='0'){
            return;
        }
        
        
        visited[i][j]=true;
        getIsland(grid,i-1,j,visited);
        getIsland(grid,i,j-1,visited);
        getIsland(grid,i,j+1,visited);
        getIsland(grid,i+1,j,visited);
        
        
    }

}