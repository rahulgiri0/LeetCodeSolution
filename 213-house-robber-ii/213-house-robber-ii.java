class Solution {
    public int rob(int[] nums) {
        
        if(nums.length<2)
            return nums[0];
        
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        
        for(int i =0; i<nums.length;i++){
            
            if(i!=0) arr1[i]=nums[i];
            if(i!=nums.length-1) arr2[i]=nums[i];
        }
        
        return Math.max(rob2(arr1),rob2(arr2));
    }
    
    
    public int rob2(int[] nums) {
        int[] dp = new int[nums.length];
       
        
        
        
        for(int i = 0; i<dp.length;i++){
            
            if(i ==0 )
            dp[i]=nums[i];
            
            else if(i ==1)
                dp[i] = nums[i]>nums[i-1]?nums[i]:nums[i-1];
            
            else
                dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        
        return dp[nums.length-1];
    }
}