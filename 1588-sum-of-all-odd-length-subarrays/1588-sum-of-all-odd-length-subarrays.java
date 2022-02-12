class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       
        int sum = 0;
        int n= arr.length;
        for (int i = 0; i < arr.length; i++){
            
          int startWithI = n-i;
            int endWithI = i+1;
            
            int totalTime = startWithI*endWithI;
            if(totalTime%2==1){
            totalTime=totalTime+1;
            }
            sum+=arr[i]*totalTime/2;
                
        }
        return sum;
    }
}