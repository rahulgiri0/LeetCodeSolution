class Solution {
    public int splitArray(int[] nums, int m) {
       // 7, 2 5 10 8 = 7,25 max = 25
       // 7 2, 5 10 8 = 9,23 max =23
       // 7 2 5, 10 8 = 14,18 max =18
       // 7 2 5 10, 8 = 24,8  max =24
        // ans = 18
        
        
        int s=0;
        int ans =-1;
        int e=0;
        
        for(Integer n: nums)
            e+=n;
        
        
        
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(isPossible(nums,mid,m)){
                
                ans=mid;
                e=mid-1;
            }
            else
                s=mid+1;
        }
        
        return ans;
        
        
    }
    
    public boolean isPossible(int[] nums, int mid, int m){
       
        int count=1;
        int sum=0;
            
            for(Integer n:nums){
                if(sum+n<=mid){
                    sum+=n;
                }
                else{
                    count++;
                    if(count>m || n>mid){
                        return false;
                    }
                    else 
                        sum=n;
                }
            }
        
       return true;
        
    }
}