class Solution {
    public int minMoves2(int[] nums) {
       int n = nums.length;
        Arrays.sort(nums);
        
        int median = n%2==0? (nums[n/2]+nums[(n/2)-1])/2: nums[n/2];
        int step =0;
        for(Integer num:nums)
            step+=Math.abs(num-median);
        
        return step;
    }
}