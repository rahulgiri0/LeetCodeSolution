class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(!ans.contains(nums[i]) && map.get(nums[i])>(nums.length/3)){
                ans.add(nums[i]);
            }
        }
        
        return ans;
    }
}