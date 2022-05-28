class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int n = nums.length;
         for(Integer num:nums){
             sum+=num;
         }
        
        return ((n*(n+1))/2)-sum;
    }
}