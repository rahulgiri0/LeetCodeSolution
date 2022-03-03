class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int c=0;
        int sum=0;
        
        for(int i=2;i<nums.length;i++){

        if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
            c++;
            sum+=c;
        }
            else
                c=0;
        }
        return sum;
    }
}