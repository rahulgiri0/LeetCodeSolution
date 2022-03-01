class Solution {
    public int[] countBits(int n) {
        int [] dp = new int[n+1];
       dp[0]=0;
        int of=1;
        for(int i=1;i<dp.length;i++){
            if(i==of*2)
                of=of*2;
            
            dp[i]=dp[i-of]+1;
        }
        
        return dp;
        
        
    }
}