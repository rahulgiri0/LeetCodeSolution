class Solution {
    public boolean canJump(int[] nums) {
         
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return canJump(nums,0 ,dp);
    }
    
    public boolean canJump(int[] nums, int idx,int[] dp){
        
        if(idx>=nums.length-1)
            return true;
        
        if(nums[idx]==0){
            dp[idx] =0;
            return false;
        }
       if(dp[idx]!=-1)
           return dp[idx]==1;
        
        int jump = nums[idx];
       
        for(int i =1; i<=jump;i++){
            if(canJump(nums,idx+i,dp)){
            dp[i]=1;
                return true;
            }
          
        }
        
        dp[idx] =0;
        return false;
    }
}