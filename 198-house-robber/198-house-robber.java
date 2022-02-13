class Solution {
    public int rob(int[] nums) {
        
        
     
        return robUtil(nums,0, new int[nums.length+1]);
    }
    
    public int robUtil(int[] nums, int idx, int[] dp){
        
        
      for(int i=0;i<nums.length;i++){
          
          if(i==0){
              dp[i]=nums[i];
          }
          
         else if(i==1){
              dp[i]= nums[i]>dp[i-1]?nums[i]:dp[i-1];
          }
          
          else{
              
              dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
          }
          
          
      }
        
        return dp[nums.length-1];
        
        
    }
}