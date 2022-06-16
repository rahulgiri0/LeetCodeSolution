class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        
       String lps = "";
        
        for(int g=0; g<s.length();g++){

            int start =0;
            int end =g;
            while(end<s.length() && start<s.length() ){
                
                if(g==0){
                  
                    dp[start][end] =true;
                }
                
                else if(g==1){
                    
                    if(s.charAt(start) == s.charAt(end))
                    {
                        
                        dp[start][end] =true;
                    }
                    
                    else
                    {dp[start][end] =false;}
                }
                
                else{
                    if(s.charAt(start) == s.charAt(end) && dp[start+1][end-1]==true)
                    {
                        
                        dp[start][end] =true;}
                    
                    else{
                        dp[start][end] =false;
                    }
                }
                
                if(dp[start][end] ==true){
                    
                    lps = s.substring(start,end+1);
                }
                 
                start++;
                end++;
            }
            
            
        }
        
        
        return lps;
    }
}