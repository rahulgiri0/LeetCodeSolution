class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    
        List<List<Integer>> sets = new ArrayList<List<Integer>>();
        List<Integer> set = new ArrayList<>();
        
        util(nums,0,sets,set);
        return sets;
            
        
    }
    
    
    public void util(int [] nums, int idx, List<List<Integer>> sets, List<Integer> set){
        
        if(idx>=nums.length){
            sets.add(new ArrayList<>(set));
            return;
        }
        
        
        int e = nums[idx];
        util(nums,idx+1,sets,set);
        set.add(e);
        util(nums,idx+1,sets,set);
        set.remove(set.size()-1);
        
        
        
    }
}