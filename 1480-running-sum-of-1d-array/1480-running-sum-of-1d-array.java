class Solution {
    public int[] runningSum(int[] nums) {
    int n= nums.length;
        
        int[] arr = new int[n];
        
        for(int i = 0; i<nums.length; i++){
            int sum=0;
            for(int j=0 ; j <= i; j++){
                sum=sum+nums[j];
            }
            arr[i]=sum;
        }
        return arr;
    }
}