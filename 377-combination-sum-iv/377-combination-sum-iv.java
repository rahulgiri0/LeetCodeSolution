class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int[] memo = new int[target+1];
        Arrays.fill(memo,-1);
        
        return util(nums,target,memo);
    }
    
    public int util(int[] nums, int target, int[] memo){
        
        if(target<0)
            return 0;
        
        if(target == 0)
            return 1;
        
        if(memo[target]!=-1)
            return memo[target];
        
        int ans =0;
        for(int i =0; i<nums.length ;i++){
            ans+= util(nums,target-nums[i],memo);
        }
        
        memo[target] = ans;
        
        return memo[target];
    }
}