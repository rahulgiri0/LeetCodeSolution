class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
           
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !isVisited[i][j] ){
               int   count=  maxAreaOfIslandUtil(grid,i,j,isVisited);
                    System.out.println(count);
                    max= max>count?max:count;
                }
            }
        }
        
        return max;
    }
    
    public int maxAreaOfIslandUtil(int[][] grid, int src, int des,  boolean[][] isVisited ) {
        
        if(src<0 || des<0 || src>grid.length-1 || des>grid[0].length-1 || grid[src][des]==0 || isVisited[src][des]){
            return 0;
        }
        
        
        isVisited[src][des]=true;
       return 1+ maxAreaOfIslandUtil(grid,src,des-1,isVisited)+
        maxAreaOfIslandUtil(grid,src-1,des,isVisited)+
        maxAreaOfIslandUtil(grid,src,des+1,isVisited)+
        maxAreaOfIslandUtil(grid,src+1,des,isVisited);
        
       
    }
}