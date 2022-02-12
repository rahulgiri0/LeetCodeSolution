class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = Integer.MIN_VALUE;
        
        for(Integer candy:candies){
            
            max = max>candy?max:candy;
        }
        
        List<Boolean> ans = new ArrayList<>();
        
        for(Integer candy:candies){
            
            if((candy+extraCandies)>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        
        return ans;
    }
}