class Solution {
    
    public int climbStairs(int n) {
        
        int[] stg = new int[n+1];
        
       
        return climbStairsUtil(n,stg);
    }
    
    
    public int climbStairsUtil(int n,int[] stg){
        if(n<0){

          return 0;
      }
        
        if(n==0){
          
           return 1;
       }
        
        if(stg[n]!=0){
            return stg[n];
        }
        
      int c1=  climbStairsUtil(n-1,stg);
      int c2= climbStairsUtil(n-2,stg);
        
        stg[n]=c1+c2;
        
        return stg[n];
    }
 }
