class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        int c=0;
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        
        Arrays.sort(expected);
        
        for(int i=0;i<heights.length;i++){
            if(expected[i]!=heights[i]){
                c++;
            }
            else
                continue;
        }
        
        return c;
    }
}