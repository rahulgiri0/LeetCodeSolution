class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(verticalCuts);
        Arrays.sort(horizontalCuts);
        int maxh = Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        int maxw = Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
        
        int prev =0;
        
        for(int i =1; i<horizontalCuts.length;i++){
            
            maxh = Math.max(maxh,horizontalCuts[i]-horizontalCuts[prev]);
            prev =i;
        }
        
         prev =0;
        
        for(int i =1; i<verticalCuts.length;i++){
            
            maxw = Math.max(maxw,verticalCuts[i]-verticalCuts[prev]);
            prev =i;
        }
        
        
        return (int)((long)maxh * maxw % 1000000007);
    }
}