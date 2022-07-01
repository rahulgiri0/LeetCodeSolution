class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        
        int units=0;
        for(int[] box:boxTypes){
            
            if(truckSize>=box[0]){
                units+=box[1]*box[0];
                truckSize-=box[0];
            }
            else{
                units+=box[1]*truckSize;
                return units;
            }
        }
        
        return units;
    }
}