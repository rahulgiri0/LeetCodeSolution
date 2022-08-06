class Solution {
    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length][grid[0].length];
        
        for(int[] m:memo){
            Arrays.fill(m,-1);
        }
        return util(grid, 0,0,memo);
    }
    
    
    public int util(int[][] grid , int r, int c, int[][] memo){
        
        if(r == grid.length -1 && c == grid[0].length-1){
            return grid[r][c];
        }
        
        if(r> grid.length -1 || c>grid[0].length -1){
            return Integer.MAX_VALUE;
        }
        
        if(memo[r][c]!=-1)
            return memo[r][c];
        
        int right = util(grid, r,c+1,memo);
        int down = util(grid, r+1,c,memo);
        
      memo[r][c] =grid[r][c]+ Math.min(right,down);
        
        return memo[r][c];
        
        
    }
}