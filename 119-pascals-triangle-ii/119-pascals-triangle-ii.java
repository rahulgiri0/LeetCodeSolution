class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascals = new ArrayList<List<Integer>>();
        
        for(int i=0;i<=rowIndex;i++){
            List<Integer> pascal = new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    pascal.add(1);
                }
                else{
                    pascal.add(pascals.get(i-1).get(j-1) + pascals.get(i-1).get(j));
                }
            }
            pascals.add(pascal);
        }
        
        return pascals.get(rowIndex);
    }
}