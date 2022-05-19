class Solution {
    int[][] dir = new int[][]{{0,-1},{1,0},{0,1},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[][] mem = new int[m][n];
        int longestPath = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                longestPath = Math.max(longestPath,dfs(matrix,i,j,m,n,mem));
            }
        }
     
        return longestPath;
    }
    
    public int dfs(int[][] matrix, int i, int j, int m, int n, int[][] mem ){
        
        if(mem[i][j]>0) return mem[i][j];
        
        int max =0;
        
        for(int[] way: dir){
            int x = i+way[0], y=j+way[1];
            
            if(x>=0 && y>=0 && x<m && y<n && matrix[x][y]>matrix[i][j]){
                max = Math.max(max, dfs(matrix,x,y,m,n,mem));
            }
        }
        
        mem[i][j] = max+1;
        
        return mem[i][j];
    }
}