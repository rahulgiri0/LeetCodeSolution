class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int end=0;
        int start =0;
        int sum=0;
        int count=0;
        
        while(end<arr.length){
            
            sum+=arr[end];
            
            if(end-start+1<k){
                end++;
            }
            
            else if(end-start+1==k){
                
                if(sum/k>=threshold){
                    count++;
                }
                
                sum=sum-arr[start];
                start++;
                end++;
                
            }
            
        }
        
        return count;
    }
}