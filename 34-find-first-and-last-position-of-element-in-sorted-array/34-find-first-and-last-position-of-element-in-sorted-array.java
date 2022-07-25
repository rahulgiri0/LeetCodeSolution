class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       
        
        int start = 0;
        int end = nums.length -1;
        
        int left =-1;
        int right =-1;
        
        while(start<=end){
            
            
            int mid = start+(end-start)/2;
            
            if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target)
                start = mid+1;
            
            else{
                
                 left = mid;
                 right = mid;
                
                while(left>=0 && nums[left] == target)
                    left--;
                
                left=left+1;
                
                while(right <=nums.length-1 && nums[right] == target)
                    right++;
                
                right = right-1;
                
                break;
            }
            
        }
        
        int[] ans = new int[2];
        
        ans[0]=left;
        ans[1] = right ;
        
        return ans;
    }
}