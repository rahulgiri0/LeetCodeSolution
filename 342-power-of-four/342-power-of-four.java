class Solution {
    public boolean ans;
    public boolean isPowerOfFour(int n) {
        
        if(n==0){
            return false;
        }
        
        if(n==1){
            ans=true;
            return ans;
        }
        
        if(n%4==0){
            ans= isPowerOfFour(n/4);
        }
        else{
            ans=false;
            return ans;
        }
           
        
        return ans;
        
    }
}