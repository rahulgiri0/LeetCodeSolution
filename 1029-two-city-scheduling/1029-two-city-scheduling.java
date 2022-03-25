class Solution {
    public int twoCitySchedCost(int[][] costs) {
     int sum=0;
        int refund[] = new int[costs.length];
        int n = costs.length/2;
        for(int[] person:costs){
            sum+=person[0];
        }
        int i=0;
        for(int[] person:costs){
            
            refund[i] = person[1]-person[0];
            i++;
        }
        
        Arrays.sort(refund);
        
        for( i=0;i<n;i++){
            sum+=refund[i];
        }
        
        return sum;
    }
}