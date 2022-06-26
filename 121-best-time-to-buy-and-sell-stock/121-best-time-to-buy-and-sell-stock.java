class Solution {
    public int maxProfit(int[] prices) {
        int leastValue = Integer.MAX_VALUE;
        int psf=0;
        int maxProfit =0;
        
        for(Integer p:prices){
            leastValue = Math.min(p,leastValue);
            psf = p-leastValue;
            maxProfit = Math.max(psf,maxProfit);
        }
        
        return maxProfit;
    }
}