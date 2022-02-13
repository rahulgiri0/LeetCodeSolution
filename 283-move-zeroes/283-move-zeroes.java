class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero=0; //last non zero
        int cur=0;
        
        while(cur<nums.length){
            
            if(nums[cur]!=0){
                
               nums[lastNonZero]=nums[cur];
                
                lastNonZero++;
                cur++;
            }
            else
                cur++;
            
            
            
        }
        
        
        System.out.println(lastNonZero);
        for(int i= lastNonZero;i<nums.length;i++){
            nums[i]=0;
        }
        
       
    }
}