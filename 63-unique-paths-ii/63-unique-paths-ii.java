class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dir = new int[][]{{0,1},{1,0}};
        int[][] mem = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0]==1)
            return 0;
        
       return util(obstacleGrid,0,0,obstacleGrid.length,obstacleGrid[0].length,dir, mem);
    }
    
    
    public int util(int[][] obstacleGrid, int i, int j , int r ,  int c,int[][] dir,int[][] mem ){
        
        if(i==r-1 && j==c-1)
            return 1;
        
        if(mem[i][j]!=0)
            return mem[i][j];
        
       int path =0;
        obstacleGrid[i][j] = 1;
        
        for(int[] way: dir){
            int x = i+way[0];
            int y = j+way[1];
            
            if(x>=0 && y>=0 && x<r && y<c && obstacleGrid[x][y] == 0){
               
              path += util(obstacleGrid,x,y,r,c,dir,mem);
                
                
            }
            
            obstacleGrid[i][j] = 0;
            mem[i][j] = path;
        }
        
        
          return mem[i][j];
       
    }
}