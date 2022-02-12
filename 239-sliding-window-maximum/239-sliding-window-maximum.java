class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        
        int start = 0;
        int end = 0;
        int[] ans = new int[nums.length-k+1];
        int idx=0;
        while(end<nums.length){
            
            
            while(!dq.isEmpty() && nums[end]>dq.peekLast()){
                dq.pollLast();
            }
            
            dq.offerLast(nums[end]);
            
            if(end-start+1<k){
                end++;
            }
            
            else if(end-start+1==k){
                ans[idx]=dq.peekFirst();
                idx++;
                if(dq.peekFirst()==nums[start]){
                    dq.pollFirst();
                }
                start++;
                end++;
            }
            
            
            
        }
        
        
        return ans;
    }
}