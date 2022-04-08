class Solution {
    public int singleNumber(int[] nums) {
       int ans=0;
        for(Integer e:nums){
            ans= ans^e;
        }
        
        return ans;
    }
}