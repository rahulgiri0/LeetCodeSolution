class Solution {
    public int countNegatives(int[][] grid) {
        
        int count=0;
        
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[r].length;c++){

            if(grid[r][c]<0){
                count++;
            }
            }
        }
        
        return count;
        
    }
}