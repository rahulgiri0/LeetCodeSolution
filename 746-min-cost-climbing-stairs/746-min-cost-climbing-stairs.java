class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
//         int[] memo = new int[cost.length +1];
        
        
//         return Math.min(util(cost,cost.length-1,memo),util(cost,cost.length-2,memo));
        int n = cost.length;
        return tabulation(cost,n);
    }
    
    
    
    public int util(int[] cost, int n, int[] memo){
        
        if(n == 1 || n == 0)
            return cost[n];
        
        if(n<0)
            return 0;
        
        if(memo[n]!=0)
            return memo[n];
        
       
        
        memo[n] = Math.min(util(cost,n-1,memo),util(cost,n-2,memo))+cost[n];
        
        return memo[n];
        
    }
    
    public int tabulation(int[] cost, int n){
        
        int[] dp = new int[n+1];
        
        dp[0]= cost[0];
        dp[1] = cost[1];
        
        for(int i=2;i<n;i++){
            
            dp[i] = cost[i]+ Math.min(dp[i-1],dp[i-2]);
        }
        
        
        return Math.min(dp[n -1],dp[n-2]);
    }
}