class Solution {
    public int maxProfit(int[] prices) {
        int lv = Integer.MAX_VALUE;
        int psf =0;
        int mp = 0;
        
        for(Integer p: prices){
            lv = Math.min(p,lv);
            psf = p-lv;
            mp = Math.max(mp,psf);
        }
        
        return mp;
    }
}