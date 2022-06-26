class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int left =k-1;
        int right = cardPoints.length-1;
        
        int sum =0;
        
        
        for(int i =0; i<k ;i++){
            
            sum+=cardPoints[i];
            
           
        }
        int result =sum;
       
        
        for(int i=0; i<k ;i++){
            sum -=cardPoints[left];
            left--;
            sum +=cardPoints[right];
            right--;
            result = Math.max(sum,result);
        }
        
        return result;
    }
}