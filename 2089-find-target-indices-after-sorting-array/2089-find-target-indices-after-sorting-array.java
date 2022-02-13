class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        
        int s= 0;
        int e=nums.length-1;
        
        while(s<=e){
            int mid = (s+e)/2;
            
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                int fo=mid;
                int lo=mid;
                while( fo>=0 && nums[fo]==target){
                    fo--;
                }
                fo+=1;
                
                 while(  lo<nums.length && nums[lo]==target){
                    lo++;
                }
                lo-=1;
                
                for(int i=fo;i<=lo;i++){
                    ans.add(i);
                }
                break;
                
            }
        }
        
        Collections.sort(ans);
        return ans;
    }
}