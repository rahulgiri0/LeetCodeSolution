class Solution {
    public int maxProfit(int[] prices) {
       int psf =0;
        int max = 0;
        int buy = Integer.MAX_VALUE;
        
        for(int p:prices){
            buy = Math.min(buy,p);
            psf = p-buy;
            
            max = Math.max(max,psf);
        }
        
        return max;
}
}