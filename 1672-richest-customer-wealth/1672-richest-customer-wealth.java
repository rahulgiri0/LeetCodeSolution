class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int[] sa = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
                for(int j=0;j<accounts[i].length;j++){
                    
                    sum=sum+accounts[i][j];
                    
                }
            sa[i]=sum;
            
        
        }
        
       
        for(int i=0;i<sa.length;i++){
            
            
            max = max>sa[i]?max:sa[i];
        }
        
        return max;
    }
}