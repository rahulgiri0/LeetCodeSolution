class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int s = nums.length;
        int e = 0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    s = Math.min(s,i);
                    e = Math.max(e,j);
                    
                }
            }
        }
        
        return e-s>0?e-s+1:0;
    }
}