class Solution {
    int count = 0;
    public int numberOfSteps(int num) {
        
        if(num==0){
            return count;
        }
        
        count++;
        if(num%2 ==0){
            numberOfSteps(num/2);
        }
        else
            numberOfSteps(num-1);
        
        return count;
    }
}