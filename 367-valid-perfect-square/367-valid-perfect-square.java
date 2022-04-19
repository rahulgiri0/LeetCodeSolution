class Solution {
    public boolean isPerfectSquare(int num) {
        int start =1;
        int end = num;
        
        while(start<=end){
            
            int mid = start +(end-start)/2;
            int res = num / mid, remain = num % mid;
            if(res==mid && remain==0)
                  return true;
            
            else if(res>mid)
                start = mid+1;
            
            else 
                end = mid-1;
              
        }
        
        return false;
    }
}