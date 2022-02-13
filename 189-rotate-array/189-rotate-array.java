class Solution {
    public void rotate(int[] nums, int k) {
        
        k=k%nums.length;
        
//         for (int r = 1; r <= k; r = r + 1) {

			
// 			int temp = nums[nums.length - 1];

// 			for (int j = nums.length - 1; j >= 1; j = j - 1){
// 				nums[j] = nums[j - 1];
//             }

// 			nums[0] = temp;

// 		}
        
        
        reverse(nums,0,nums.length-1-k);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        
            
            
       
    }
    
    
    
    public void reverse(int[] nums, int s, int e){
        
        while(s<=e){
            
           int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
            
        }
    }
    
    
    
    
    
    
}