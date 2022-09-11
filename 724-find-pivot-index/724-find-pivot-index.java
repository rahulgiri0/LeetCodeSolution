class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum =0;
        
        int totalSum = 0;
        
        for(Integer n:nums)
            totalSum+=n;
        
        for(int i =0; i<nums.length ;i++){
           
            int rightSum = totalSum - nums[i]-leftSum;
            
            if(leftSum == rightSum)
                return i;
            
            leftSum+=nums[i];
        }
        
        return -1;
    }
}