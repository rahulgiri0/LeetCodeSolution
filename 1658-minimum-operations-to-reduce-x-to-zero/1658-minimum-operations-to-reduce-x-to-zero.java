class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        
        int sum =0;
        
        for(int num:nums)
            sum+=num;
        
        int k = sum-x;
        int start =0;
        int end =0;
        
        int curSum =0;
        int len=-1;
        while(end<n){
            
           curSum+=nums[end];
                
          
            
           
            while (start<=end && curSum > k) {
                curSum-=nums[start];
                start++;
            } 
            
             if(curSum==k){
                len = Math.max(len,end-start+1);
                
                
            }
            
            end++;
        }
        
        return len ==-1?-1:n-len;
    }
}