class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int start =0;
        int end =0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int score =0;
        int maxScore =0;
        
        while(end<nums.length){
            
        map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            score+=nums[end];
            while( map.get(nums[end])>1){
                map.put(nums[start],map.getOrDefault(nums[start],0)-1);
                score-=nums[start];
                start++;
            }
            
            
            maxScore = Math.max(score,maxScore);
            end++;
        }
        
        return maxScore;
    }
}