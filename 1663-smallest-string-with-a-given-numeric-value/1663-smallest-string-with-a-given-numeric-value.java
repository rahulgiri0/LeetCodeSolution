class Solution {
    public String getSmallestString(int n, int k) {
        k=k-n;
        
        char[] ans = new char[n];
      Arrays.fill(ans,'a');
        
        while(k>0){
            n--;
           
            ans[n]+=Math.min(25,k);
            k=k-Math.min(25,k);
        }
        
        return String.valueOf(ans);
        
    }
}