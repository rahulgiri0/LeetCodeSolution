class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> p = new ArrayList<List<Integer>>();
       permuteUtil(nums,p,new ArrayList<>(),new boolean[nums.length]);
        return p;
    }
    
    public void permuteUtil(int[] nums,List<List<Integer>> p, ArrayList<Integer> ansi,boolean[] used ){
        if(ansi.size()==nums.length){
            p.add(new ArrayList<>(ansi));
            return;
        }
        
       
        for(int i=0;i<nums.length;i++){
            
           if(used[i])
               continue;
            
            
                ansi.add(nums[i]);
                used[i]=true;
                permuteUtil(nums,p,ansi,used);
                used[i]=false;
                 ansi.remove(ansi.size() - 1);
            
            
           

        }
       
       
        
        
        
    }
    
    
    
}