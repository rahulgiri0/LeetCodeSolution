class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ng = new int[nums2.length];
        int[] ans = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        s.push(nums2[nums2.length-1]);
        ng[nums2.length-1]=-1;
        for(int i=nums2.length-2;i>=0;i--){
            
            
            while(s.size()>0 && nums2[i]>=s.peek()){

                s.pop();
                
            }
            
            if(s.size()==0){

                ng[i]=-1;
            }
            else{
            
            ng[i]=s.peek();
           
            }
             s.push(nums2[i]);
            }
        
        
        
      
        
        for(int i=0; i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=ng[j];
                }
            }
        }
        
        return ans;
        
    }
}