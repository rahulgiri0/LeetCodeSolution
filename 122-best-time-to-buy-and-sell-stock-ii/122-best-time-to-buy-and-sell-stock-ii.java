class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int buy =0;
        int sell =0;
        
        int profit = 0;
        
        while(i<prices.length){
            
            while(i<prices.length-1 && prices[i+1]<=prices[i])
                i++;
            
            buy = prices[i];
            
             while(i<prices.length-1 && prices[i+1]>prices[i])
                i++;
            
            sell = prices[i];
            
            profit += sell -buy;
            i++;
        }
        
        return profit;
    }
}