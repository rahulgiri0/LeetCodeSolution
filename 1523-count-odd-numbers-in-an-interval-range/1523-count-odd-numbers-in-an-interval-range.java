class Solution {
    public int countOdds(int low, int high) {
       int numRange = high-low +1;
        
        if(low%2!=0 && high%2!=0)
            return (numRange/2 +1);
        
        else
            return numRange/2;
    }
}