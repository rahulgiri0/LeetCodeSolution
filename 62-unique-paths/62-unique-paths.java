class Solution {
    public int uniquePaths(int m, int n) {
       // return uniquePaths(0,0,m,n);
        
        int[][] memo = new int[m+1][n+1];
        
        return uniquePaths(0,0,m,n,memo);
    }
    
    // recursion
    public int uniquePaths(int  i, int j, int m, int n){
        
        if(i<0 || i>m-1 || j<0 || j>n-1)
            return 0;
        
        if(i == m-1 && j == n-1)
            return 1;
        
        int right = uniquePaths(i,j+1,m,n);
        int down = uniquePaths(i+1,j,m,n);
        
        return right+down;
    }
    
     public int uniquePaths(int  i, int j, int m, int n, int[][] memo){
        
        if(i<0 || i>m-1 || j<0 || j>n-1)
            return 0;
        
         if(memo[i][j]!=0)
             return memo[i][j];
         
        if(i == m-1 && j == n-1)
            return 1;
        
        int right = uniquePaths(i,j+1,m,n,memo);
        int down = uniquePaths(i+1,j,m,n,memo);
        
         memo[i][j] = right+down;
        return memo[i][j];
    }
}

