class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo=-1;
        int lo=-1;
        int[] ans = new int[2];
        if(nums.length==1 && nums[0]==target){
            ans[0]=0;
            ans[1]=0;
            
            return ans;
        }
        
        int s=0;
        int e=nums.length-1;
        
        while(s<=e){
            int mid= (s+e)/2;
            
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                
                fo=mid;
                lo=mid;
                
               
                
                while(fo>=0 && nums[fo]==target){
                    fo--;
                }
                
                fo+=1;
                
                
                 while(lo<=nums.length-1 && nums[lo]==target){
                    lo++;
                }
                
                lo-=1;
                
                break;
                
            }
        }
        
        
        ans[0]=fo;
        ans[1]=lo;
        
        return ans;
        
    }
}