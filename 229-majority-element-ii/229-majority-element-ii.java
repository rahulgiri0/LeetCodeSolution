class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(Integer n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        System.out.println(map);
         for(Integer n : nums){
            if(!ans.contains(n) && map.get(n)>nums.length/3)
               { ans.add(n);}
        }
        
        
        return ans;
       
}
}