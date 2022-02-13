class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end =0;
        double avg= Integer.MIN_VALUE;
        double sum=0;

        while(end<nums.length){
            
            if(end-start+1<k){
                sum=sum+nums[end];
                end++;
            }
            
            if(end-start+1==k){
                sum=sum+nums[end];
                
                avg=Math.max(sum,avg);
                sum=sum-nums[start];

                
                end++;
                start++;
            }
            
            
        }
        
        return avg/k;
        
    }
}