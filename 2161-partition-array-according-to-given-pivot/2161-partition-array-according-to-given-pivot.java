class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        
        ArrayList<Integer> less= new ArrayList<>();
         ArrayList<Integer> equal= new ArrayList<>();
         ArrayList<Integer> great= new ArrayList<>();
       ArrayList<Integer> ans= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==pivot){
                equal.add(nums[i]);
            }
            
            else if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else 
            {
                great.add(nums[i]);
            }
            
        }
        
      for(Integer e : less){
          ans.add(e);
      }
        
         for(Integer e : equal){
          ans.add(e);
      }
        
         for(Integer e : great){
          ans.add(e);
      }
        
        int[] res = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            res[i]=ans.get(i);
        }
        
        return res;
       
        
    }
}