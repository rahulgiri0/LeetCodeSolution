class Solution {
    public int[] runningSum(int[] nums) {
        
        int preSum = nums[0];
        
        for(int i =1; i<nums.length; i++){
            nums[i] +=preSum;
            preSum = nums[i];
        }
        
        return nums;
    }
}