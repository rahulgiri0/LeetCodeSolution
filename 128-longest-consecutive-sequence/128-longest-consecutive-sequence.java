class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(Integer num:nums)
            set.add(num);
        
        int longestStreek =0;
        for(Integer num:set){
            int streek =0;
            if(!set.contains(num-1)){
                
                int curValue = num;
                while(set.contains(curValue)){
                    streek++;
                    curValue++;
                }
                
                
            }
            
            longestStreek = Math.max(longestStreek,streek);
        }
        
        return longestStreek;
    }
}