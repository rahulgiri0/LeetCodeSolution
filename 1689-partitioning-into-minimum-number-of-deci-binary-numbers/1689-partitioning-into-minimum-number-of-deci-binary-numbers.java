class Solution {
    public int minPartitions(String n) {
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<n.length();i++){
            int ch = (int)n.charAt(i) -'0';
            ans = ch>ans?ch:ans;
                
            
        }
        
        return ans;
    }
}