class Solution {
    public int minDistance(String word1, String word2) {
        
        int totalSum = word1.length()+word2.length();
        int twiceOflcs = 2*lcs(word1,word2);
        
        return totalSum - twiceOflcs;
    }
    
    public int lcs(String s1,String s2){
        
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        
        for(int i = dp.length-2;i>=0;i--){
            for(int j = dp[i].length-2;j>=0;j--){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(j);
                
                if(c1==c2){
                    dp[i][j] = 1+dp[i+1][j+1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        
        return dp[0][0];
    }
}