class Solution {
    public int uniquePaths(int m, int n) {
        
        return util(m-1,n-1, new int[n+1][m+1]);
    }
    
    public int util(int m, int n, int[][] memo){
       if (m < 0 || n < 0) {
      return 0;
    }  if (m == 0 && n == 0) {
      return 1;
    }  if (memo[n][m] > 0) {
      return memo[n][m];
    } 
      memo[n][m] = util(m - 1, n, memo) + util(m, n - 1, memo);
      return memo[n][m];
    
    }
}


