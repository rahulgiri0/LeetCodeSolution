class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e= nums.length-1;
        
        while(s<e){
            int mid = s+(e-s)/2;
            
            if(nums[mid]>nums[e]){
                s=mid+1;
            }
            else
                e=mid;
        }
        
        int ros = s;
       
        
        s=0;
        e=nums.length-1;
        
        while(s<=e){
            int mid= s+(e-s)/2;
            int realMid = (mid+ros)%nums.length;
            
            if(nums[realMid]==target){
               return realMid;
            }
            
            else if(nums[realMid]<target){

                s=mid+1;
            }
            else
                e=mid-1;
        }
        
        return -1;
        
    }
}